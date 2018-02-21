package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app 
        frame = new JFrame("title");
        frame.setPreferredSize(new Dimension(200, 300));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");
        container.add(yes);
        container.add(no);
        
        container.add(new JLabel("Why?"));
        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton forFun = new JRadioButton("Because it is fun!");
        ButtonGroup why = new ButtonGroup();
        why.add(noReason);
        why.add(forFun);
        container.add(noReason);
        container.add(forFun);
        
        container.add(new JButton("Done!"));
    }

    public JFrame getFrame() {
        return frame;
    }
    
    
}
