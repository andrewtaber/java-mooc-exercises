
import Buttons.EventListener;
import CalculatorLogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 400));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField output = new JTextField();
        output.setEnabled(false);
        JTextField input = new JTextField();
        output.setText("0");
        
        container.add(output);
        container.add(input);
        container.add(createPanel(output, input));        
    }

    public JFrame getFrame() {
        return frame;
    }
    
    private JPanel createPanel(JTextField output, JTextField input) {
        Calculator calc = new Calculator();
        JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton reset = new JButton("Z");
        reset.setEnabled(false);
        EventListener listener = new EventListener(calc, output, input, plus, minus, reset);
        
        plus.addActionListener(listener);
        minus.addActionListener(listener);
        reset.addActionListener(listener);

        
        panel.add(plus);
        panel.add(minus);
        panel.add(reset);
        return panel;
    }
}