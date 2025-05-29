package Q3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
public class MyFrame extends JFrame {
        public  MyFrame(){
            setSize(400,450);
            getContentPane().setBackground(Color.BLUE);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton button= new JButton("Click me");
            button.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,"You clicked");
                }
            });

            add(button);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        }

    }

