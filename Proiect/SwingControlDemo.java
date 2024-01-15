import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


import java.io.*;



public class SwingControlDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public SwingControlDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        swingControlDemo.showTextFieldDemo();
        swingControlDemo.showCheckBoxDemo();
        swingControlDemo.showRadioButtonDemo();
        swingControlDemo.showColorChooserDemo();
        swingControlDemo.showSpinnerDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Proiect Sacaciu Filip Daniel");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showTextFieldDemo() {
        headerLabel.setText("Control in action: JTextField");

        JLabel namelabel = new JLabel("Name: ", JLabel.RIGHT);
        final JTextField userText = new JTextField(6);

        JButton saveButton = new JButton("Salvare");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton cancelButton = new JButton("Anulare");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel textPanel = new JPanel(new FlowLayout());
        textPanel.add(namelabel);
        textPanel.add(userText);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);

        controlPanel.add(textPanel);
        controlPanel.add(buttonPanel);
        mainFrame.setVisible(true);
    }


    private void showCheckBoxDemo() {
        headerLabel.setText("Control in action: CheckBox");

        final JCheckBox chkLabel = new JCheckBox();
        chkLabel.setMnemonic(KeyEvent.VK_C);

        chkLabel.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Label Checkbox: " +
                        (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });

        JPanel checkBoxPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        checkBoxPanel.add(new JLabel("Label: ")); // Add label before checkbox
        checkBoxPanel.add(chkLabel);

        controlPanel.add(checkBoxPanel);
        mainFrame.setVisible(true);
    }
    private void showRadioButtonDemo() {
        headerLabel.setText("Control in action: RadioButton");

        final JRadioButton radApple = new JRadioButton();
        final JRadioButton radMango = new JRadioButton();
        final JRadioButton radPeer = new JRadioButton();

        radApple.setMnemonic(KeyEvent.VK_C);
        radMango.setMnemonic(KeyEvent.VK_M);
        radPeer.setMnemonic(KeyEvent.VK_P);

        radApple.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("First RadioButton: "
                        + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        radMango.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Second RadioButton: "
                        + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        radPeer.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Third RadioButton: "
                        + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        JPanel checkBoxPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        checkBoxPanel.add(new JLabel("Label: ")); // Add label before checkbox


        // Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(radApple);
        group.add(radMango);
        group.add(radPeer);

        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        radioPanel.add(new JLabel("Label: "));
        radioPanel.add(radApple);
        radioPanel.add(radMango);
        radioPanel.add(radPeer);

        controlPanel.add(radioPanel);

        mainFrame.setVisible(true);
    }

    private void showColorChooserDemo(){
        headerLabel.setText("Control in action: JColorChooser");
        JButton chooseButton = new JButton("Choose Background");

        chooseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color backgroundColor = JColorChooser.showDialog(mainFrame,
                        "Choose background color", Color.white);
                if(backgroundColor != null){
                    controlPanel.setBackground(backgroundColor);
                    mainFrame.getContentPane().setBackground(backgroundColor);
                }
            }
        });
        controlPanel.add(chooseButton);
        mainFrame.setVisible(true);
    }
    private void showSpinnerDemo(){
        headerLabel.setText("Control in action: JSpinner");
        SpinnerModel spinnerModel = new SpinnerNumberModel(10, //initial value
                0, //min
                100, //max
                1);//step
        JSpinner spinner = new JSpinner(spinnerModel);


        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                statusLabel.setText("Value : " + ((JSpinner)e.getSource()).getValue());
            }
        });
        controlPanel.add(spinner);
        mainFrame.setVisible(true);
    }
}