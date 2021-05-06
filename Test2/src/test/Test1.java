package test;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Test1 {

	static String urlApp;

	public static void main(String wer[]) {

		JFrame frame = new JFrame("Auto60 - User Input!");

		JLabel jL1 = new JLabel("Enter application URL under test: ");
		jL1.setBounds(10, 10, 200, 25);
		frame.add(jL1);
		JTextField txt1 = new JTextField();
		txt1.setBounds(210, 10, 250, 25);
		frame.add(txt1);

		JLabel jL2 = new JLabel("Do you have a method which takes a xpath as String and returns WebElement: ");
		jL2.setBounds(10, 40, 900, 25);
		frame.add(jL2);
		JRadioButton r1 = new JRadioButton(" Yes");
		r1.setBounds(20, 70, 50, 20);
		r1.setBackground(Color.CYAN);
		JTextField txt2 = new JTextField("Enter method name");
		txt2.setEnabled(false);
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt2.setEnabled(true);
			}
		});
		txt2.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				txt2.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
			}
		});
		txt2.setBounds(85, 68, 150, 25);
		frame.add(txt2);
		JRadioButton r2 = new JRadioButton(" No ( use driver.findElement() )");
		r2.setBounds(20, 100, 200, 20);
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt2.setText("");
				txt2.setText("Enter method name");
				txt2.setEnabled(false);
			}
		});
		r2.setBackground(Color.CYAN);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		frame.add(r1);
		frame.add(r2);

		JLabel jL3 = new JLabel("WebElement actions/methods: ");
		jL3.setBounds(10, 130, 900, 25);
		frame.add(jL3);
		JRadioButton r3 = new JRadioButton(
				" Use selenium provided web element actions/methods (e.g. click, sendkeys etc): \r\n" + "");
		r3.setBounds(20, 165, 487, 20);
		r3.setBackground(Color.CYAN);
		JRadioButton r4 = new JRadioButton(
				" I have overridden web element actions/methods created in my framework, use them: \r\n" + "");
		r4.setBounds(20, 195, 514, 20);
		r4.setBackground(Color.CYAN);
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(r3);
		bg2.add(r4);
		frame.add(r3);
		frame.add(r4);
		JTextField txt3 = new JTextField("Enter click method");
		txt3.setEnabled(false);
		txt3.setBounds(20, 220, 124, 25);
		frame.add(txt3);
		JTextField txt4 = new JTextField("Enter sendkey method");
		txt4.setEnabled(false);
		txt4.setBounds(150, 220, 130, 25);
		frame.add(txt4);
		JTextField txt5 = new JTextField("Enter select method");
		txt5.setEnabled(false);
		txt5.setBounds(285, 220, 124, 25);
		frame.add(txt5);
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt3.setText("");
				txt3.setText("Enter click method");
				txt3.setEnabled(false);
				txt4.setText("");
				txt4.setText("Enter sendkey method");
				txt4.setEnabled(false);
				txt5.setText("");
				txt5.setText("Enter select method");
				txt5.setEnabled(false);
			}
		});
		r4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt3.setEnabled(true);
				txt4.setEnabled(true);
				txt5.setEnabled(true);
			}
		});
		txt3.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				txt3.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
			}
		});
		txt4.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				txt4.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
			}
		});
		txt5.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				txt5.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
			}
		});
		JLabel jL4 = new JLabel("Do you have a method created to print logs in execution report: ");
		jL4.setBounds(10, 260, 900, 25);
		frame.add(jL4);
		JRadioButton r5 = new JRadioButton(" Yes");
		r5.setBounds(20, 293, 50, 20);
		r5.setBackground(Color.CYAN);
		JTextField txt6 = new JTextField("Enter log method");
		txt6.setEnabled(false);
		txt6.setBounds(85, 290, 150, 25);
		frame.add(txt6);
		JRadioButton r6 = new JRadioButton(" No");
		r6.setBounds(20, 320, 50, 20);
		r6.setBackground(Color.CYAN);
		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(r5);
		bg3.add(r6);
		frame.add(r5);
		frame.add(r6);
		txt6.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				txt6.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
			}
		});
		r5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt6.setEnabled(true);
			}
		});
		r6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt6.setText("");
				txt6.setText("Enter log method");
				txt6.setEnabled(false);
			}
		});
		JButton jB = new JButton("Start");
		jB.setBounds(250, 350, 80, 30);
		jB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				urlApp = txt1.getText();
			}
		});
		frame.add(jB);

		Image icon = Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + File.separator + "logo.png");
		frame.setIconImage(icon);
		frame.setLayout(null);
		frame.setSize(600, 440);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setVisible(true);
		frame.requestFocus();
		frame.setResizable(false);
	}
}
