package lab_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends JFrame implements ActionListener {

    public Frame1() {
        this.setVisible(true);
        this.setSize(700, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        this.add(panel);
        panel.setLayout(new FlowLayout());
        panel.setSize(500, 200);
        this.initPanel();
        this.setResizable(false);
    }

    private void initPanel() {
        lbName = new JLabel("Name");
        tfName = new JTextField();
        tfName.setPreferredSize(new Dimension(200, 25));
        namePane = new JPanel();
        namePane.setLayout(new GridLayout(2, 1));
        namePane.add(lbName);
        namePane.add(tfName);
        panel.add(namePane);

        lbStreet = new JLabel("Street");
        tfStreet = new JTextField();
        tfStreet.setPreferredSize(new Dimension(200, 25));
        streetPane = new JPanel();
        streetPane.setLayout(new GridLayout(2, 1));
        streetPane.add(lbStreet);
        streetPane.add(tfStreet);
        panel.add(streetPane);

        lbCity = new JLabel("City");
        tfCity = new JTextField();
        tfCity.setPreferredSize(new Dimension(200, 25));
        cityPane = new JPanel();
        cityPane.setLayout(new GridLayout(2, 1));
        cityPane.add(lbCity);
        cityPane.add(tfCity);
        panel.add(cityPane);

        lbState = new JLabel("State");
        tfState = new JTextField();
        tfState.setPreferredSize(new Dimension(200, 25));
        statePane = new JPanel();
        statePane.setLayout(new GridLayout(2, 1));
        statePane.add(lbState);
        statePane.add(tfState);
        panel.add(statePane);


        lbZip = new JLabel("Zip");
        tfZip = new JTextField();
        tfZip.setPreferredSize(new Dimension(200, 25));
        zipPane = new JPanel();
        zipPane.setLayout(new GridLayout(2, 1));
        zipPane.add(lbZip);
        zipPane.add(tfZip);
        panel.add(zipPane);


        btSubmit = new JButton("Submit");
        btPane = new JPanel();
        btPane.add(btSubmit);
        btPane.setPreferredSize(new Dimension(300, 50));
        panel.add(btPane);
        btSubmit.addActionListener(this);
        panel.revalidate();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String info = "";
        if (e.getSource() == btSubmit) {
            info = tfName.getText() + "\n" + tfStreet.getText() + "\n" + tfCity.getText() + ", " + tfState.getText() + " " + tfZip.getText();
            System.out.println(info);
        }
    }

    public static void main(String[] args) {
        new Frame1();

    }

    private JPanel panel;
    private JTextField tfName;
    private JLabel lbName;
    private JPanel namePane;
    private JTextField tfStreet;
    private JLabel lbStreet;
    private JPanel streetPane;

    private JTextField tfCity;
    private JLabel lbCity;
    private JPanel cityPane;
    private JTextField tfState;
    private JLabel lbState;
    private JPanel statePane;
    private JTextField tfZip;
    private JLabel lbZip;
    private JPanel zipPane;
    private JButton btSubmit;
    private JPanel btPane;

}
