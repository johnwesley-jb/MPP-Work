package lab_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends JFrame implements ActionListener {
    private Frame2() {
        this.setVisible(true);
        this.setSize(400, 200);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        panelLeft = new JPanel();
        panelLeft.setSize(200, 200);
        panelLeft.setLayout(new GridLayout(4, 1, 20, 20));
        this.add(panelLeft, BorderLayout.WEST);
        panelRight = new JPanel();
        this.add(panelRight, BorderLayout.CENTER);
        panelRight.setSize(100, 150);
        intPanels();
        countBt.addActionListener(this);
        revBt.addActionListener(this);
        remDupBt.addActionListener(this);

    }

    private void intPanels() {
        countBt = new JButton("Count Letters");
        panelLeft.add(countBt);
        revBt = new JButton("Reverse Letters");
        panelLeft.add(revBt);
        remDupBt = new JButton("Remove Duplicates");
        panelLeft.add(remDupBt);
        inputPan = new JPanel();
        inputPan.setLayout(new GridLayout(2, 1));
        lbInput = new JLabel("Input");
        tfInput = new JTextField();
        tfInput.setPreferredSize(new Dimension(120, 25));
        inputPan.add(lbInput);
        inputPan.add(tfInput);
        panelRight.add(inputPan);
        ouputPan = new JPanel();
        ouputPan.setLayout(new GridLayout(2, 1));
        lbOuput = new JLabel("Ouput");
        tfOuput = new JTextField();
        tfOuput.setPreferredSize(new Dimension(120, 25));
        ouputPan.add(lbOuput);
        ouputPan.add(tfOuput);
        panelRight.add(ouputPan);
        panelRight.revalidate();

    }

    public static void main(String[] args) {
        new Frame2();

    }

    private JPanel panelLeft;
    private JPanel panelRight;
    private JPanel pano;
    private JPanel inputPan;
    private JPanel ouputPan;

    private JButton countBt;
    private JButton revBt;
    private JButton remDupBt;
    private JTextField tfInput;
    private JLabel lbInput;
    private JTextField tfOuput;
    private JLabel lbOuput;


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countBt) {
            tfOuput.setText(String.valueOf(tfInput.getText().length()));
        }
        if (e.getSource() == revBt) {
            String text = "";
            for (int i = tfInput.getText().length() - 1; i >= 0; i--) {
                text += tfInput.getText().charAt(i);
            }
            tfOuput.setText(text);
        }
        if (e.getSource() == remDupBt) {
            String s = "";
            for (int i = 0; i < tfInput.getText().length(); i++) {
                if (!s.contains(String.valueOf(tfInput.getText().charAt(i)))) {
                    s += tfInput.getText().charAt(i);
                }
            }
            tfOuput.setText(s);
        }

    }
}
