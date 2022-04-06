import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JButton button;
    JButton button2;
    JButton button3;
    int num = 0;

    Frame(){

        //Botones
        button = new JButton();
        button.setBounds(150,125,100,50);
        button.addActionListener(this);
        button2 = new JButton();
        button2.setBounds(150,225,100,50);
        button2.addActionListener(this);
        button3 = new JButton();
        button3.setBounds(150,325,100,50);
        button3.addActionListener(this);

        //JFrame Stuff
        this.setSize(400,550);
        this.setLayout(null);
        this.setTitle("Tarea Corta 5");
        this.getContentPane().setBackground(new Color(255,200,88));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.add(button);
        this.add(button2);
        this.add(button3);
    }
    private void lookForException(int num){
        if (this.num != num){
            System.out.println("error");
            this.num = 0;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.num += 1;
        if(e.getSource()==button){
            System.out.println(1);
            lookForException(1);
        }
        if(e.getSource()==button2){
            System.out.println(2);
            lookForException(2);
        }
        if(e.getSource()==button3) {
            System.out.println(3);
            lookForException(3);
            this.num = 0;
        }
    }
}
