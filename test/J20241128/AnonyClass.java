package J20241128;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonyClass extends JFrame {
    public AnonyClass() {
        setTitle("액션 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        // Create button and add it to the container
        JButton btn = new JButton("Action");
        c.add(btn);
        
        // Use anonymous inner class to implement ActionListener
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();  // Correctly cast the event source to JButton
                if (b.getText().equals("Action")) {
                    b.setText("액션");
                } else {
                    b.setText("Action");
                }
                setTitle(b.getText());  // Update the window title to match the button text
            }
        });
        
        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnonyClass();
    }
}
