import com.sun.corba.se.spi.orbutil.fsm.Action;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by user on 13.05.2017.
 */
public class Gui implements ActionListener {

    static JLabel  label;

    public static void run()
    {
     Gui gui = new Gui();

     JFrame frame = new JFrame();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(300,300);
     frame.setVisible(true);

     JButton button = new JButton("View Date");
     button.addActionListener(gui);
     frame.setLayout(null);
     frame.getContentPane().add(button);
     button.setBounds(95,150, 120,30);

     label = new JLabel();
     frame.getContentPane().add(label);
     label.setBounds(40,90, 150,30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText((new Date().toString()));
    }
}
