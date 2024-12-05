package SequenceMemory;

import javax.swing.*; // JFrame을 포함한 패키지
import java.awt.*;
import java.awt.event.ActionEvent; // 버튼 클릭 같은 액션 이벤트 처리
import java.awt.event.ActionListener; // 액션을 처리하기 위한 리스너 인터페이스
import java.util.ArrayList; // 동적으로 크기를 조절할 수 있는 리스트 자료구조 제공
import java.util.Collections; // 셔플같은 리스트를 조작하기 위한 유틸리티 메서드 제공
import java.util.List; 

public class RememberGame {
    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        gameFrame.startGame(1); // 첫 번째 난이도로 게임 시작
    }
}

class GameFrame extends JFrame {
    private GameLogic gameLogic;
    private JButton[] buttons;
    private Color[] colors;

    public GameFrame() {
        setTitle("순서 기억하기 게임");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3)); // 3x3 그리드로 버튼 배치

        buttons = new JButton[9];
        colors = new Color[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setBackground(Color.LIGHT_GRAY); // 초기에는 회색으로 설정
            buttons[i].setEnabled(false); // 초기에는 비활성화
            buttons[i].addActionListener(new ButtonClickListener(i)); // 버튼 클릭 리스너 추가
            add(buttons[i]);
        }

        for (int i = 0; i < 9; i++) {
            colors[i] = new Color((int) (Math.random() * 0x1000000)); // 랜덤 색상 생성
        }

        gameLogic = new GameLogic(this);
        setVisible(true);
    }

    public void startGame(int sequenceLength) {
        gameLogic.startGame(sequenceLength);
    }

    public void showColorSequence(List<Integer> sequence) {
        for (int i = 0; i < 9; i++) {
            buttons[i].setBackground(Color.LIGHT_GRAY); // 모든 버튼을 회색으로 초기화
        }

        // 순서대로 색을 표시
        for (int i = 0; i < sequence.size(); i++) {
            int index = sequence.get(i);
            buttons[index].setBackground(colors[index]);
        }
    }

    // 버튼을 모두 다시 회색으로 설정하는 메서드
    public void resetButtonsToGray() {
        for (JButton button : buttons) {
            button.setBackground(Color.LIGHT_GRAY);
        }
    }

    public void showResult(int correctCount, int sequenceLength) {
        JOptionPane.showMessageDialog(this, "난이도 " + sequenceLength + "\n맞춘 개수 " + correctCount + "/" + sequenceLength);
    }

    public void disableAllButtons() {
        for (JButton button : buttons) {
            button.setEnabled(false);
            button.setBackground(Color.LIGHT_GRAY); // 비활성화된 버튼을 회색으로 표시
        }
    }

    private class ButtonClickListener implements ActionListener {
        private int buttonIndex;

        public ButtonClickListener(int index) {
            this.buttonIndex = index;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            gameLogic.checkAnswer(buttonIndex);
        }
    }

    public JButton[] getButtons() {
        return buttons;
    }

    public Color getButtonColor(int index) {
        return colors[index];
    }
}

class GameLogic {
    private GameFrame gameFrame; // GameFrame 클래스의 멤버 변수로 포함하여 필요한 기능을 사용 ex) button
    private List<Integer> answerSequence;
    private List<Integer> playerSequence;
    private int currentIndex;
    private int sequenceLength;
    private Timer showSequenceTimer;

    public GameLogic(GameFrame frame) {
        this.gameFrame = frame;
        this.answerSequence = new ArrayList<>();
        this.playerSequence = new ArrayList<>();
    }

    public void startGame(int sequenceLength) {
        this.sequenceLength = sequenceLength;
        answerSequence.clear();
        playerSequence.clear();
        currentIndex = 0;

        gameFrame.disableAllButtons();

        for (int i = 0; i < sequenceLength; i++) {
            answerSequence.add(i);
        }
        Collections.shuffle(answerSequence);

        showSequence(0);
    }

    private void showSequence(int index) {
        if (index < answerSequence.size()) {
            int buttonIndex = answerSequence.get(index);
            gameFrame.showColorSequence(Collections.singletonList(buttonIndex));

            showSequenceTimer = new Timer(1000, e -> {
                showSequence(index + 1);
            });
            showSequenceTimer.setRepeats(false);
            showSequenceTimer.start();
        } else {
            gameFrame.resetButtonsToGray(); // 순서 표시가 끝나면 모든 버튼을 회색으로 초기화
            enableButtons();
        }
    }

    private void enableButtons() {
        for (JButton button : gameFrame.getButtons()) {
            button.setEnabled(true);
        }
    }

    public void checkAnswer(int buttonIndex) {
        playerSequence.add(buttonIndex);

        if (buttonIndex == answerSequence.get(currentIndex)) {
            gameFrame.getButtons()[buttonIndex].setBackground(gameFrame.getButtonColor(buttonIndex));
            currentIndex++;
            if (currentIndex == sequenceLength) {
                gameFrame.showResult(sequenceLength, sequenceLength); // 맞춘 개수를 표시
                if (sequenceLength < 9) {
                    gameFrame.startGame(sequenceLength + 1);
                }
            }
        } else {
            gameFrame.showResult(currentIndex, sequenceLength); // 틀렸을 경우 맞춘 개수/전체 개수를 표시
            gameFrame.startGame(1);
        }
    }
}
