package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author andytaber
 */
public class ClickListener implements ActionListener{
    private Calculator calc;
    private JLabel label;
    
    public ClickListener(Calculator calc, JLabel label) {
        this.calc = calc;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calc.increase();
        label.setText(calc.giveValue() + "");
    }
    
}
