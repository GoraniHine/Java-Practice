package min;
import java.util.*;

public class WordGameApp {
    private Scanner scan;
    private String startWord = "아버지";
    private Player[] players;

    public WordGameApp() {
        scan = new Scanner(System.in);
    }

    private void createPlayers() {
        System.out.println("게임에 참가하는 인원은 몇명입니까 >> ");
        int nPlayers = scan.nextInt();
        players = new Player[nPlayers];

        for (int i = 0; i < nPlayers; i++) {
            System.out.print("참가자의 이름을 입력하세요 >> ");
            String name = scan.next();
            players[i] = new Player(name);
        }
    }

    public void run() {
        createPlayers();
        String lastWord = startWord;
        System.out.println("시작하는 단어는 " + lastWord + "입니다");
        int next = 0;

        while (true) {
            String newWord = players[next].sayWord();
            if (!players[next].succeed(lastWord)) {
                System.out.println(players[next].getName() + "이 졌습니다.");
                break;
            }
            lastWord = newWord;
            next++;
            next %= players.length;
        }
    }

    public static void main(String[] args) {
        WordGameApp game = new WordGameApp();
        game.run();
    }
}

