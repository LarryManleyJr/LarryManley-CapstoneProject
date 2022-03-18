package org.launchcode.liftOff.models;

import javax.swing.*;

public class FrameClass extends JFrame {

    private JLabel selectContLabel, numberOfContLabel,
            mobileContLabel, emailContLabel, twitterContLabel;

    private JTextField
            mobileContTxtF, emailContTxtF, twitterContTxtF;

    private JList namesContList = new JList();

    private JButton searchbutton = new JButton("search");


    public FrameClass() {

        this.setLayout(null);
        this.setTitle("Contacts Application");
        selectContLabel = new JLabel("Select Contact:");
        numberOfContLabel = new JLabel("Number of Contacts:");
        mobileContLabel = new JLabel("Mobile:");
        emailContLabel = new JLabel("Email:");
        twitterContLabel = new JLabel("Twitter:");
        mobileContTxtF = new JTextField();
        emailContTxtF = new JTextField();
        twitterContTxtF = new JTextField();

        selectContLabel.setBounds(5,5,100, 30);
//        numberOfContLabel
//        mobileContLabel
//        emailContLabel
//        twitterContLabel


        this.add(selectContLabel);
        this.add(numberOfContLabel);
        this.add(mobileContLabel);
        this.add(emailContLabel);
        this.add(twitterContLabel);
        this.add(mobileContTxtF);
        this.add(emailContTxtF);
        this.add(twitterContTxtF);

        this.add(namesContList);
        this.add(searchbutton);
    }
    }
