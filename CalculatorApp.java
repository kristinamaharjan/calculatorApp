package Calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorApp extends JFrame implements ActionListener {
   
    JPanel panel;
    JTextField jtInput;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btnAdd;
    JButton btnSub;
    JButton btnEquals;
    int first;
    int second;
    int result;
    

    public CalculatorApp()
    {
        setTitle("Calculator App");
        setLayout(new BorderLayout());
        panel = new JPanel(new GridLayout(3, 4));
        add(panel, BorderLayout.CENTER);
        
        
        btn1= new JButton("1");
        btn2= new JButton("2");
        btn3= new JButton("3");
        btnAdd= new JButton("+");      
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btnSub = new JButton("-");
        btn7= new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnEquals = new JButton("=");

        jtInput= new JTextField();
        
        
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btnAdd);
        btnAdd.setBackground(Color.GREEN);
        btnAdd.setForeground(Color.WHITE);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btnSub);
        btnSub.setBackground(Color.BLUE);
        btnSub.setForeground(Color.WHITE);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnEquals);
        btnEquals.setBackground(Color.MAGENTA);
        btnEquals.setForeground(Color.WHITE);

        

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnEquals.addActionListener(this);


        add(jtInput, BorderLayout.NORTH);
        setSize(400,400);
        setVisible(true);
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {
        Arithmetic arithmetic = new Arithmetic();
        if (result == 3) {
            jtInput.setText("");
            result = 0;
        }
        if (e.getSource() == btn1) {
            jtInput.setText(jtInput.getText() + "1");
        }
        else if (e.getSource() == btn2) {
            jtInput.setText(jtInput.getText() + "2");
        }
        else if (e.getSource() == btn3) {
            jtInput.setText(jtInput.getText() + "3");
        }
        else if (e.getSource() == btn4) {
            jtInput.setText(jtInput.getText() + "4");
        }
        else if (e.getSource() == btn5) {
            jtInput.setText(jtInput.getText() + "5");
        }
        else if (e.getSource() == btn6) {
            jtInput.setText(jtInput.getText() + "6");
        }
        else if (e.getSource() == btn7) {
            jtInput.setText(jtInput.getText() + "7");
        }
        else if (e.getSource() == btn8) {
            jtInput.setText(jtInput.getText() + "8");
        }
        else if (e.getSource() == btn9) {
            jtInput.setText(jtInput.getText() + "9");
        }
        else if (e.getSource() == btnAdd) {
            this.first = Integer.parseInt(jtInput.getText());
            result = 1;
            jtInput.setText("");
        }
        else if (e.getSource() == btnSub){
            this.first = Integer.parseInt(jtInput.getText());
            result = 2;
            jtInput.setText("");
        }
        else if (e.getSource() == btnEquals){
            this.second = Integer.parseInt(jtInput.getText());
            arithmetic.setFirst (this.first);
            arithmetic.setSecond (this.second);

            if(result == 1){
                jtInput.setText(Integer.toString(arithmetic.addition()));
            }
            else if (result == 2){
                jtInput.setText(Integer.toString(arithmetic.subtraction()));
            }
            result = 3;

        }
        }

        public static void main(String[] args) {
            new CalculatorApp();
        }
    }
