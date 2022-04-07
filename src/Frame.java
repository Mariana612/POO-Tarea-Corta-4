import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Frame extends JFrame implements ActionListener {

    JButton button;
    JButton button2;
    JButton button3;
    int num = 0;

    Frame(){

        JLabel tittle = new JLabel("HOLA PROFE");
        tittle.setBounds(160,50,100,50);

        //Botones
        button = new JButton("1");
        button.setBounds(150,125,100,50);
        button.addActionListener(this);

        button2 = new JButton("2");
        button2.setBounds(150,225,100,50);
        button2.addActionListener(this);

        button3 = new JButton("3");
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
        this.add(tittle);
    }
    private void lookForException(int num) {
        try{
            if (this.num == num){
            }
            else{throw new IOException();}
        }
        catch (Exception e) {
            JLabel aText = new JLabel("<html> Botones presionados en desorden. <br/> Presiono "  + num + " en vez de " + this.num + ".",JLabel.CENTER);
            JDialog error = new JDialog();
            error.setTitle("Botones presionados en desorden.");
            error.add(aText, BorderLayout.CENTER);
            error.setVisible(true);
            error.setSize(260,100);
            error.setLocation(200,200);
            error.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            this.num = 0;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.num += 1;
        if(e.getSource()==button){
            lookForException(1);
        }
        if(e.getSource()==button2){
            lookForException(2);
        }
        if(e.getSource()==button3) {
            lookForException(3);
            this.num = 0;
        }
    }
}
