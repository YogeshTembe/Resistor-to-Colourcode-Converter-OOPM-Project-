package mainrc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;

public class mainrc extends JFrame {

	private JPanel contentPane;
	private JTextField t11;
	private JButton btnBuyResistors;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainrc frame = new mainrc();
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
	public mainrc() {
		setForeground(Color.PINK);
		setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 16));
		setTitle("My Resistor");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Rakesh\\Desktop\\symbol.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 204, 204));
		contentPane.setBorder(new LineBorder(new Color(153, 0, 204), 5, true));
		setContentPane(contentPane);
		
		JButton btnResistanceToColourcode = new JButton("Resistance To Colourcode");
		btnResistanceToColourcode.setForeground(new Color(204, 153, 255));
		btnResistanceToColourcode.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		btnResistanceToColourcode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rc h=new rc();
				h.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton btnColourcodeToResistance = new JButton("Colourcode To Resistance");
		btnColourcodeToResistance.setForeground(new Color(204, 153, 255));
		btnColourcodeToResistance.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		btnColourcodeToResistance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr x=new cr();
				x.setVisible(true);
				setVisible(false);
			}
		});
		
		t11 = new JTextField();
		t11.setForeground(new Color(204, 153, 204));
		t11.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 12));
		t11.setText("Choose One Operation ");
		t11.setColumns(10);
		t11.setEditable(false);
		
		btnBuyResistors = new JButton("Buy Resistors ");
		btnBuyResistors.setForeground(new Color(204, 153, 255));
		btnBuyResistors.setFont(new Font("Vani", Font.BOLD | Font.ITALIC, 13));
		btnBuyResistors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rest r=new rest();
				r.setVisible(true);
				setVisible(false);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(147)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBuyResistors)
						.addComponent(btnColourcodeToResistance)
						.addComponent(t11, 157, 157, 157)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnResistanceToColourcode, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(91, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(t11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnResistanceToColourcode)
					.addGap(18)
					.addComponent(btnColourcodeToResistance)
					.addGap(28)
					.addComponent(btnBuyResistors)
					.addContainerGap(66, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
