package mainrc;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class rest extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t4;
	private JLabel lblResistanceValue;
	private JLabel lblYourDeliveryAddress;
	private JTextField t2;
	private JButton btnExit;
	private JLabel lblTotalPrice;
	private JTextField t5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rest frame = new rest();
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
	public rest() {
		setTitle("My Resistor");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rakesh\\Desktop\\symbol.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(255, 102, 0), 5, true));
		setContentPane(contentPane);
		
		JLabel lblName = new JLabel("Your Name:");
		lblName.setForeground(new Color(204, 51, 255));
		lblName.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		
		t1 = new JTextField();
		t1.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 11));
		t1.setColumns(10);
		t1.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(ch=='#'||ch=='$'||ch=='%'||ch=='@'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch=='!'||ch=='+'||ch=='_'||ch=='1'||ch=='2'||ch=='3'||
                		ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0'){
                	JOptionPane.showMessageDialog(null, "Only alphabets are allowed!");
                    t1.setText("");
                }
                else{
                    
                }
            }
});

		final JComboBox t3 = new JComboBox();
		t3.setForeground(new Color(0, 0, 0));
		t3.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		t3.setModel(new DefaultComboBoxModel(new String[] {"1Kohm", "10Kohm", "100Kohm", "1Mohm"}));
		
		JLabel lblId = new JLabel("quantity:");
		lblId.setForeground(new Color(204, 51, 255));
		lblId.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		
		t4 = new JTextField();
		t4.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 11));
		t4.setColumns(10);
		t4.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0'){
                }
                else{
                	JOptionPane.showMessageDialog(null, "Only numbers  are allowed!");
                    t4.setText(""); 
                }
            }
});
		
		JButton btnAdd = new JButton("submit");
		btnAdd.setForeground(new Color(255, 102, 0));
		btnAdd.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a,b,c,d;
				int m,n;
				a=t1.getText();
				b=t2.getText();
				d=(String)t3.getSelectedItem();
				m=Integer.parseInt(t4.getText());
				switch(d)
				{
				case "1Kohm":n=1*m;
				t5.setText(Integer.toString(n));
				break;
				case "10Kohm":n=2*m;
				t5.setText(Integer.toString(n));
				break;
				case "100Kohm":n=3*m;
				t5.setText(Integer.toString(n));
				break;
				case"1Mohm":n=5*m;
				t5.setText(Integer.toString(n));
				break;
				default:t5.setText("Not Available");
				break;
				}
				try{
				     Class.forName("com.mysql.jdbc.Driver");
				     Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/mydata","root","yogesh");  
				    		 Statement stmt=con.createStatement(); 
				    		 c="INSERT INTO data1(name,address,resistancevalue,quantity) VALUES("+"'"+a+"'"+","+"'"+b+"'"+","+"'"+d+"'"+","+m+")";
				    		 int rs=stmt.executeUpdate(c);  
                             System.out.println("done");  
				    	 con.close();}catch(Exception e){ System.out.println(e);}
			}
		});
		
		lblResistanceValue = new JLabel("Resistance Value:");
		lblResistanceValue.setForeground(new Color(204, 51, 255));
		lblResistanceValue.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		
		lblYourDeliveryAddress = new JLabel("Your Delivery Address:");
		lblYourDeliveryAddress.setForeground(new Color(204, 51, 255));
		lblYourDeliveryAddress.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		
		t2 = new JTextField();
		t2.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 11));
		t2.setColumns(10);
		t2.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(ch=='#'||ch=='$'||ch=='%'||ch=='@'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch=='!'||ch=='+'||ch=='_'){
                	JOptionPane.showMessageDialog(null, "Only alphabets and numbers  are allowed!");
                    t2.setText("");
                }
                else{
                    
                }
            }
});
		
		btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				mainrc y=new mainrc();
				y.setVisible(true);
			}
		});
		
		lblTotalPrice = new JLabel("Total Price :");
		lblTotalPrice.setForeground(new Color(204, 51, 255));
		lblTotalPrice.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		
		t5 = new JTextField();
		t5.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 11));
		t5.setColumns(10);
		t5.setEditable(false);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblYourDeliveryAddress)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblId)
									.addGap(18)
									.addComponent(t4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(t2, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblName)
							.addGap(18)
							.addComponent(t1, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblResistanceValue)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(t3, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnAdd)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnExit))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblTotalPrice)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(t5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(t1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblYourDeliveryAddress)
						.addComponent(t2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResistanceValue)
						.addComponent(t3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(t4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTotalPrice)
						.addComponent(t5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAdd)
						.addComponent(btnExit))
					.addGap(44))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
