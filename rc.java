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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class rc extends JFrame {

	private JPanel contentPane;
	private JTextField t5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rc frame = new rc();
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
	public rc() {
		setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 17));
		setTitle("My Resistor");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rakesh\\Desktop\\symbol.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(255, 102, 0), 5, true));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Enter First Digit:");
		lblNewLabel.setForeground(new Color(204, 102, 255));
		lblNewLabel.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		
		JLabel lblEnterSecondDigit = new JLabel("Enter Second Digit:");
		lblEnterSecondDigit.setForeground(new Color(204, 102, 204));
		lblEnterSecondDigit.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		
		JLabel lblEnterMultiplier = new JLabel("Enter Multiplier:");
		lblEnterMultiplier.setForeground(new Color(204, 102, 255));
		lblEnterMultiplier.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		
		JLabel lblEnterTolerance = new JLabel("Enter Tolerance:");
		lblEnterTolerance.setForeground(new Color(204, 102, 255));
		lblEnterTolerance.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		
		final JComboBox t1 = new JComboBox();
		t1.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 11));
		t1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		
		final JComboBox t2 = new JComboBox();
		t2.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 11));
		t2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		
		final JComboBox t3 = new JComboBox();
		t3.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 11));
		t3.setModel(new DefaultComboBoxModel(new String[] {"10^0", "10^1", "10^2", "10^3", "10^4", "10^5", "10^6", "10^7", "10^8", "10^9"}));
		
		final JComboBox t4 = new JComboBox();
		t4.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 11));
		t4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "0.5", "0.25", "0.1", "5", "10", "20"}));
		
		JLabel lblColourBandsOf = new JLabel("Colour Band's of Required Resistance :");
		lblColourBandsOf.setForeground(new Color(204, 51, 153));
		lblColourBandsOf.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		
		t5 = new JTextField();
		t5.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		t5.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setForeground(new Color(255, 102, 0));
		btnConvert.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a,b;
				String s1="null",s2="null",s3="null",s4="null",r,d;
				a=Integer.parseInt((String) t1.getSelectedItem());
				b=Integer.parseInt((String) t2.getSelectedItem());
				r=(String) t3.getSelectedItem();
				d=(String) t4.getSelectedItem();
				switch(a)
				{
				case 0:
					s1="black";
					break;
				case 1:
					s1="brown";
					break;
				case 2:
					s1="red";
					break;
				case 3:
					s1="orange";
					break;
				case 4:
					s1="yellow";
					break;
				case 5:
					s1="green";
					break;
				case 6:
					s1="blue";
					break;
				case 7:
					s1="violet";
					break;
				case 8:
					s1="grey";
					break;
				case 9:
					s1="white";
					break;
				}
				switch(b)
				{
				case 0:
					s2="black";
					break;
				case 1:
					s2="brown";
					break;
				case 2:
					s2="red";
					break;
				case 3:
					s2="orange";
					break;
				case 4:
					s2="yellow";
					break;
				case 5:
					s2="green";
					break;
				case 6:
					s2="blue";
					break;
				case 7:
					s2="violet";
					break;
				case 8:
					s2="grey";
					break;
				case 9:
					s2="white";
					break;
				}
				switch(r)
				{
				case "10^0":
					s3="black";
					break;
				case "10^1":
					s3="brown";
					break;
				case "10^2":
					s3="red";
					break;
				case "10^3":
					s3="orange";
					break;
				case "10^4":
					s3="yellow";
					break;
				case "10^5":
					s3="green";
					break;
				case "10^6":
					s3="blue";
					break;
				case "10^7":
					s3="violet";
					break;
				case "10^8":
					s3="grey";
					break;
				case "10^9":
					s3="white";
					break;
				}
				switch(d)
				{
				case "1":
					s4="brown";
					break;
				case "2":
					s4="red";
					break;
				case "0.5":
					s4="green";
					break;
				case "0.25":
					s4="blue";
					break;
				case "0.1":
					s4="violet";
					break;
				case "5":
					s4="gold";
					break;
				case "10":
					s4="silver";
					break;
				case "20":
					s4="no colour";
					break;
					
				}
				t5.setText(s1+"  "+s2+"  "+s3+"  "+s4);
			
				
			}
		});
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(new Color(255, 102, 0));
		btnClear.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t5.setText("");
				
			}
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				mainrc y=new mainrc();
				y.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(lblEnterSecondDigit, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(t2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNewLabel)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(t1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblEnterTolerance)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(t4, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblEnterMultiplier)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(t3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
						.addComponent(t5, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnConvert)
							.addGap(26)
							.addComponent(btnClear)
							.addGap(36)
							.addComponent(btnExit))
						.addComponent(lblColourBandsOf))
					.addContainerGap(161, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(t1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterSecondDigit)
						.addComponent(t2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterMultiplier)
						.addComponent(t3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterTolerance)
						.addComponent(t4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblColourBandsOf)
					.addGap(12)
					.addComponent(t5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConvert)
						.addComponent(btnClear)
						.addComponent(btnExit))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
