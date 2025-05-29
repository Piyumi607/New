package Q05;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{
    private JButton toggleButton;
    private Color initialColor;
    private String initialButtonText;

    public MyFrame(){
        setSize(200,200);
        initialColor=Color.GREEN;
        initialButtonText="OFF";


        JPanel contentPane=new JPanel();
        contentPane.setBackground(initialColor);
        setContentPane(contentPane);

        toggleButton= new JButton(initialButtonText);

        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(getContentPane().getBackground().equals(initialColor)){
                    getContentPane().setBackground(Color.RED);
                    toggleButton.setText("ON");
                }
            }
        });

        contentPane.add(toggleButton);

    }


}
