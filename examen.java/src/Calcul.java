import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calcul{
    public static void main(String[] args) {
    JFrame c= new JFrame("Calcul");
    JTextField n1 = new JTextField(10);
    JTextField n2 = new JTextField(10);
    JButton plus = new JButton("+");
    JButton sous = new JButton("-");
    JButton fois = new JButton("*");
    JButton div = new JButton("/");
    JTextField res = new JTextField(10);

    c.setSize(320, 200);
    c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    c.setLayout(new GridLayout(1,3));
    JPanel p =new JPanel();
    plus.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int first = Integer.parseInt(n1.getText());
            int second = Integer.parseInt(n2.getText());
            res.setText(String.valueOf(first + second));
        }
    });
    sous.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            int first = Integer.parseInt(n1.getText());
            int second =Integer.parseInt(n2.getText());
            res.setText(String.valueOf(first-second));
        }
    });
    fois.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            int first =Integer.parseInt(n1.getText());
            int second =Integer.parseInt(n2.getText());
            res.setText(String.valueOf(first*second));
        }
    });
    div.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            int first =Integer.parseInt(n1.getText());
            int second =Integer.parseInt(n2.getText());
            res.setText(String.valueOf(first/second));
        }
    });
    p.add(n1);
    p.add(n2);
    p.add(plus);
    p.add(sous);
    p.add(fois);
    p.add(div);
    p.add(res);
    c.add(p);
    c.setVisible(true);
}}
    
   


