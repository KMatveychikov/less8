import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("WeightMeter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 250, 200);
        setLayout(null);
        JLabel label = new JLabel();
        label.setBounds(50,50,150,50);
        label.setText("введите ваше вес");
        add(label);
        JTextField field = new JTextField();
        field.setBounds(50,25,100,25);
        add(field);
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Ваш вес: " + field.getText() + "кг");
            }
        });





        setVisible(true);
    }
}
class MainClass {
    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow();

    }


}
