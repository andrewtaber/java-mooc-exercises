package Buttons;

import CalculatorLogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author andytaber
 */
public class EventListener implements ActionListener{
    private Calculator calc;
    private JTextField output;
    private JTextField input;
    private JButton plus;
    private JButton minus;
    private JButton reset;
    
    public EventListener(Calculator calc, JTextField output, JTextField input, JButton plus, JButton minus, JButton reset) {
        this.calc = calc;
        this.output = output;
        this.input = input;
        this.plus = plus;
        this.minus = minus;
        this.reset = reset;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(plus)) {
            if(checkValidInput()) {;
                add();
                setForNext();
            }
        }
        if(e.getSource().equals(minus)) {
            if(checkValidInput()) {
                subtract();
                setForNext();
            }
        }
        if(e.getSource().equals(reset)) {
            reset();
            setForNext();
        }
    }
    
    private void add() {
        setArguments();
        calc.add();
        output.setText(calc.getValue() + "");
    }
    
    private void subtract() {
        setArguments();
        calc.substract();
        output.setText(calc.getValue() + "");
    }
    
    private void reset() {
        calc.reset();
        output.setText("0");
    }
    
    private void setForNext() {
        input.setText("");
        if(calc.getValue() == 0) {
            reset.setEnabled(false);
        } else {
            reset.setEnabled(true);
        }
    }
    
    private void setArguments() {
        calc.setFirstArg(Integer.parseInt(output.getText()));
        calc.setSecondArg(Integer.parseInt(input.getText()));
    }
    
    private boolean checkValidInput() {
        try {
            Integer.parseInt(input.getText());
        }
        catch(NumberFormatException e) {
            input.setText("");
            return false;
        }
        return true;
    }
    
}
