import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;

public class DropDownMenu{
    private static String selectedChoice;
    private static CountDownLatch latch;

    public static String getSelectedChoice(String[] choices, String message) {
        latch = new CountDownLatch(1); // Initialize the CountDownLatch with 1 permit

        JFrame frame = new JFrame("A Simple GUI");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocation(430, 100);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.add(panel);

        JLabel lbl = new JLabel(message);
        lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(lbl);

        final JComboBox<String> cb = new JComboBox<>(choices);
        cb.setMaximumSize(cb.getPreferredSize());
        cb.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(cb);

        JButton btn = new JButton("OK");
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(btn);

        frame.setVisible(true);

        // Add action listener for the button
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedChoice = (String) cb.getSelectedItem();
                //System.out.println("Selected Choice: " + selectedChoice);
                latch.countDown(); // Release the CountDownLatch
                frame.dispose(); // Close the frame when the button is clicked
            }
        });

        // Use latch.await() to block until the latch has counted down to zero
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return selectedChoice;
    }
}
