import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MapButton extends JFrame implements ActionListener {
    JButton arcticButton;
    JButton europeButton;
    MapButton(){

        arcticButton = new JButton();
        arcticButton.setBounds(200, 100, 100,50);
        arcticButton.addActionListener(this);
        arcticButton.setText("Arctic");
        arcticButton.setFocusable(false);
        europeButton = new JButton();
        europeButton.setBounds(200, 200, 100,50);
        europeButton.addActionListener(this);
        europeButton.setText("Europe");
        europeButton.setFocusable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(500,200);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(arcticButton);
        this.add(europeButton);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("You have chosen " + this.getTitle());
    }
}
