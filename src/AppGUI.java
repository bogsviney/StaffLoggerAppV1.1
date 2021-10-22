import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppGUI extends JFrame {

    private JButton button1 = new JButton("Calculate salary");
    private JButton button2 = new JButton("Random Workers Spawner");
    private JButton button3 = new JButton("Default Employees Adding");
    private JButton button4 = new JButton("Sort By Name");
    private JButton button5 = new JButton("Print Database");
    private JButton button6 = new JButton("Remove By ID");
    private JButton button7 = new JButton("coming SOON");
    private JButton button8 = new JButton("coming SOON");
    private JButton button9 = new JButton("coming SOON");
    private JButton button10 = new JButton("coming SOON");
    private JLabel label = new JLabel("                INTERFACE VER 0,7");

    private JTextField input = new JTextField(" ", 5);

    public AppGUI() {
        super("Staff Logger App V1.0 beta");
        this.setBounds(300, 300, 800, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        container.add(button1);
        group.add(button2);
        container.add(button2);
        group.add(button3);
        container.add(button3);
        group.add(button4);
        container.add(button4);
        group.add(button5);
        container.add(button5);
        group.add(button6);
        container.add(button6);
        group.add(button7);
        container.add(button7);
        group.add(button8);
        container.add(button8);
        group.add(button9);
        container.add(button9);
        group.add(button10);
        container.add(button10);

        this.button1.addActionListener(new AppGUI.ButtonEventListener());
        this.button2.addActionListener(new AppGUI.ButtonEventListener());
        this.button3.addActionListener(new AppGUI.ButtonEventListener());
        this.button4.addActionListener(new AppGUI.ButtonEventListener());
        this.button5.addActionListener(new AppGUI.ButtonEventListener());
        this.button6.addActionListener(new AppGUI.ButtonEventListener());
        this.button7.addActionListener(new AppGUI.ButtonEventListener());
        this.button8.addActionListener(new AppGUI.ButtonEventListener());
        this.button9.addActionListener(new AppGUI.ButtonEventListener());
        this.button10.addActionListener(new AppGUI.ButtonEventListener());



    }

    class ButtonEventListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Test test = new Test();
            if (e.getSource() == button1) {
                test.testCalculateSalaryAndBonus();
            } else if (e.getSource() == button2) {
                test.testRandomEmployeesSpawning();
            } else if (e.getSource() == button3) {
                test.testDefaultEmployeesAdding();
            } else if (e.getSource() == button4) {
                test.testSortByName();
            } else if (e.getSource() == button5) {
                test.testPrintAllDatabase();
            } else if (e.getSource() == button6) {
                test.testRemoveById();
            } else if (e.getSource() == button7) {

            } else if (e.getSource() == button8) {

            } else if (e.getSource() == button9) {

            } else if (e.getSource() == button10) {

            }
        }
    }
}
