import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Calculator extends JFrame implements ActionListener {
    static JFrame CalcWindow;
    static JTextField CalcOutput;


    String s0;
    String s1;
    String s2;

    Calculator(){
        s0 = s1 = s2 ="";
    }

    public static void main(String[] args) {
        CalcWindow = new JFrame("Calculator");
        CalcOutput = new JTextField(15);
            //Set and Look theme for Window
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }

        Calculator calc = new Calculator();

        JPanel panel = new JPanel();

        JButton button0;
        JButton button1;
        JButton button2;
        JButton button3;
        JButton button4;
        JButton button5;
        JButton button6;
        JButton button7;
        JButton button8;
        JButton button9;
        JButton buttonPlus;
        JButton buttonMinus;
        JButton buttonMultiply;
        JButton buttonDivide;
        JButton buttonDot;
        JButton buttonResult;
        JButton buttonDelete;

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");

        buttonResult = new JButton("=");
        buttonDelete = new JButton("C");

        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivide = new JButton("÷");
        buttonMultiply = new JButton("x");
        buttonDot = new JButton(".");


        button0.addActionListener(calc);
        button1.addActionListener(calc);
        button2.addActionListener(calc);
        button3.addActionListener(calc);
        button4.addActionListener(calc);
        button5.addActionListener(calc);
        button6.addActionListener(calc);
        button7.addActionListener(calc);
        button8.addActionListener(calc);
        button9.addActionListener(calc);
        buttonResult.addActionListener(calc);
        buttonPlus.addActionListener(calc);
        buttonMinus.addActionListener(calc);
        buttonDivide.addActionListener(calc);
        buttonMultiply.addActionListener(calc);
        buttonDot.addActionListener(calc);
        buttonDelete.addActionListener(calc);

        panel.add(CalcOutput);
        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonResult);
        panel.add(buttonPlus);
        panel.add(buttonMinus);
        panel.add(buttonDivide);
        panel.add(buttonMultiply);
        panel.add(buttonDot);
        panel.add(buttonDelete);

        panel.setBackground(Color.PINK);

        CalcWindow.add(panel);
        CalcWindow.setSize(250, 200);
        CalcWindow.show();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.'){
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;

            CalcOutput.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C'){
            s0 = s1 = s2 = "";

            CalcOutput.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '='){
            double te;

            if(s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("÷"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));

            CalcOutput.setText(s0 + s1 + s2 + "=" + te);

            s0 = Double.toString(te);

            s1 = s2 = "";
        }
        else{
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else{
                double te;

                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("÷"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                s0 = Double.toString(te);

                s1 = s;

                s2 = "";
            }
            CalcOutput.setText(s0 + s1 + s2);

        }
    }
}