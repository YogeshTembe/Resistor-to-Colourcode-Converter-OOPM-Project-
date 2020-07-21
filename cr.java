package mainrc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;

public class cr extends JFrame {

	private JPanel contentPane;
	private JTextField t4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cr frame = new cr();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cr() {
		setTitle("My Resistor\r\n");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rakesh\\Desktop\\symbol.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(255, 102, 0), 5, true));
		setContentPane(contentPane);
		
		JLabel lblEnterFirstBands = new JLabel("Enter First Band's Colour:");
		lblEnterFirstBands.setForeground(new Color(204, 102, 255));
		lblEnterFirstBands.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		
		JLabel lblEnterSecondBands = new JLabel("Enter Second Band's Colour:");
		lblEnterSecondBands.setForeground(new Color(204, 102, 204));
		lblEnterSecondBands.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		
		JLabel lblEnterThirdBands = new JLabel("Enter Third Band's Colour:");
		lblEnterThirdBands.setForeground(new Color(204, 102, 204));
		lblEnterThirdBands.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		
		JLabel lblEnterFourthTolerancs = new JLabel("Enter Fourth Tolerancs Band's Colour: ");
		lblEnterFourthTolerancs.setForeground(new Color(204, 102, 204));
		lblEnterFourthTolerancs.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		
		final JComboBox t1 = new JComboBox();
		t1.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		t1.setModel(new DefaultComboBoxModel(new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"}));
		
		final JComboBox t2 = new JComboBox();
		t2.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		t2.setForeground(new Color(0, 0, 0));
		t2.setModel(new DefaultComboBoxModel(new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"}));
		
		final JComboBox t3 = new JComboBox();
		t3.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		t3.setModel(new DefaultComboBoxModel(new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"}));
		
		final JComboBox t5 = new JComboBox();
		t5.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		t5.setModel(new DefaultComboBoxModel(new String[] {"brown", "red", "green", "blue", "violet", "gold", "silver", "no colour"}));
		
		JLabel lblResistanceValueIs = new JLabel("Resistance Value is:");
		lblResistanceValueIs.setForeground(new Color(255, 102, 153));
		lblResistanceValueIs.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		
		t4 = new JTextField();
		t4.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		t4.setColumns(10);
		t4.setEditable(false);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setForeground(new Color(255, 102, 0));
		btnConvert.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x1="null";
				int x2=0,d=0;
				double t=0;
				String a=(String) t1.getSelectedItem();
				String b=(String) t2.getSelectedItem();
				String c=(String) t3.getSelectedItem();
				String h=(String) t5.getSelectedItem();
				switch(a)
				{
				case "black": 
					x2=0;
					break;
					case "brown":
					 x2=1;
					break;
					case "red": 
					x2=2;
					break;
					case "orange": 
					x2=3;
					break;
					case "yellow": 
					x2=4;
					break;
					case "green": 
					x2=5;
					break;
					case "blue": 
					x2=6;
					break;
					case "violet": 
					x2=7;
					break;
					case "grey": 
					x2=8;
					break;
					case "white": 
					x2=9;
					break;
				}
				switch(b)
				{
				case "black": 
					d=0;
					break;
					case "brown":
					 d=1;
					break;
					case "red": 
					d=2;
					break;
					case "orange": 
					d=3;
					break;
					case "yellow": 
					d=4;
					break;
					case "green": 
					d=5;
					break;
					case "blue": 
					d=6;
					break;
					case "violet": 
					d=7;
					break;
					case "grey": 
					d=8;
					break;
					case "white": 
					d=9;
					break;
				}
				switch (c)
				{
				case "black": 
				x1="10^0";
				break;
				case "brown": 
				x1="10^1";
				break;
				case "red": 
				x1="10^2";
				break;
				case "orange": 
				x1="10^3";
				break;
				case "yellow": 
				x1="10^4";
				break;
				case "green": 
				x1="10^5";
				break;
				case "blue":
				x1="10^6";
				break;
				case "violet": 
				x1="10^7";
				break;
				case "grey": 
				x1="10^8";
				break;
				case "white":
				x1="10^9";
				break;
				}
				switch(h)
				{
				case "brown":
					t=1;
					break;
				case "red":
					t=2;
					break;
				case "green":
					t=0.5;
					break;
				case "blue":
					t=0.25;
					break;
				case "violet":
					t=0.1;
					break;
				case "gold":
					t=5;
					break;
				case "silver":
					t=10;
					break;
				case "no colour":
					t=20;
					break;
				}
				t4.setText("("+x2+""+d+"*"+x1+")+/-"+t+"%");
				
			}
		});
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(new Color(255, 102, 0));
		btnClear.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 14));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t4.setText("");
			}
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 14));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				mainrc h=new mainrc();
				h.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblEnterFirstBands)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(t1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblEnterThirdBands)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(t3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblEnterFourthTolerancs)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(t5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblResistanceValueIs)
									.addComponent(btnConvert))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(btnClear)
										.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
										.addComponent(btnExit))
									.addComponent(t4, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblEnterSecondBands)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(t2, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(119, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterFirstBands)
						.addComponent(t1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterSecondBands)
						.addComponent(t2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterThirdBands)
						.addComponent(t3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterFourthTolerancs)
						.addComponent(t5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResistanceValueIs)
						.addComponent(t4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConvert)
						.addComponent(btnClear)
						.addComponent(btnExit))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
