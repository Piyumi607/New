package Q4;
import javax.swing.*;
import java.awt.event.ActionEvent;
public class MyFrame extends JFrame {
        private JTextField textField;
        public MyFrame(){
            setSize(400,450);
            textField=new JTextField();
            JButton button=new JButton("Change Title");
            button.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String title=textField.getText();
                    setTitle(title);

                }
            });
            add(textField);
            add(button);
            setLayout(null);
            textField.setBounds(50,50,200,30);
            button.setBounds(100,100,100,30);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
}
