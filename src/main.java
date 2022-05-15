import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import java.awt.CardLayout;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.Window.Type;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.ScrollPane;
import javax.swing.table.DefaultTableModel;

public class main extends JFrame {
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public main() {
		setResizable(false);
		setTitle("MC Lenin's Burger Grill Ordering App");
		getContentPane().setBackground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 600);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);

		JPanel pnlHeading = new JPanel();
		pnlHeading.setBackground(Color.RED);
		pnlHeading.setBounds(0, 0, 854, 70);
		getContentPane().add(pnlHeading);
		pnlHeading.setLayout(null);

		JLabel txtTitle = new JLabel("MC LENIN's BURGER GRILL");
		txtTitle.setBackground(Color.YELLOW);
		txtTitle.setBounds(170, 20, 591, 41);
		txtTitle.setFont(new Font("Red October", Font.PLAIN, 37));
		txtTitle.setForeground(Color.YELLOW);
		pnlHeading.add(txtTitle);

		JLabel imgLogo = new JLabel("New label");
		Image logo = new ImageIcon(this.getClass().getResource("/LeninXD.png")).getImage();
		imgLogo.setIcon(new ImageIcon(logo));
		imgLogo.setBounds(10, 11, 140, 46);
		pnlHeading.add(imgLogo);

		JPanel pnlMenu = new JPanel();
		pnlMenu.setBackground(new Color(255, 255, 204));
		pnlMenu.setBounds(119, 81, 506, 469);
		getContentPane().add(pnlMenu);
		pnlMenu.setLayout(new CardLayout(0, 0));

		JPanel menu_1 = new JPanel();
		menu_1.setBackground(Color.CYAN);
		menu_1.setForeground(Color.CYAN);
		pnlMenu.add(menu_1, "menu_1");
		menu_1.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel inv1_1 = new JPanel();
		inv1_1.setBackground(new Color(255, 255, 204));
		inv1_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv1_1);
		inv1_1.setLayout(null);

		JButton btnOrder_1 = new JButton("ORDER");
		btnOrder_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOrder_1.setForeground(Color.YELLOW);
		btnOrder_1.setBackground(Color.RED);
		btnOrder_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder_1.setBounds(85, 200, 89, 23);
		inv1_1.add(btnOrder_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 42, 233, 147);
		inv1_1.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("CLASSIC BURGER");
		lblNewLabel_2.setBackground(Color.RED);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 11, 233, 20);
		inv1_1.add(lblNewLabel_2);

		JPanel inv2_1 = new JPanel();
		inv2_1.setBackground(new Color(255, 255, 204));
		inv2_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv2_1);
		inv2_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 42, 233, 147);
		inv2_1.add(lblNewLabel_1);

		JButton btnOrder_2 = new JButton("ORDER");
		btnOrder_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOrder_2.setForeground(Color.YELLOW);
		btnOrder_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder_2.setBackground(Color.RED);
		btnOrder_2.setBounds(85, 200, 89, 23);
		inv2_1.add(btnOrder_2);

		JLabel lblNewLabel_2_1 = new JLabel("CHEESE BURGER");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblNewLabel_2_1.setBackground(Color.RED);
		lblNewLabel_2_1.setBounds(10, 11, 233, 20);
		inv2_1.add(lblNewLabel_2_1);

		JPanel inv3_1 = new JPanel();
		inv3_1.setBackground(new Color(255, 255, 204));
		inv3_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv3_1);
		inv3_1.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(10, 42, 233, 147);
		inv3_1.add(lblNewLabel_3);

		JButton btnOrder_3 = new JButton("ORDER");
		btnOrder_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOrder_3.setForeground(Color.YELLOW);
		btnOrder_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder_3.setBackground(Color.RED);
		btnOrder_3.setBounds(85, 200, 89, 23);
		inv3_1.add(btnOrder_3);

		JLabel lblNewLabel_2_2 = new JLabel("BACON CHEESE BURGER");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(Color.RED);
		lblNewLabel_2_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblNewLabel_2_2.setBackground(Color.RED);
		lblNewLabel_2_2.setBounds(10, 11, 233, 20);
		inv3_1.add(lblNewLabel_2_2);

		JPanel inv4_1 = new JPanel();
		inv4_1.setBackground(new Color(255, 255, 204));
		inv4_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv4_1);
		inv4_1.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(10, 42, 233, 147);
		inv4_1.add(lblNewLabel_4);

		JButton btnOrder_4 = new JButton("ORDER");
		btnOrder_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOrder_4.setForeground(Color.YELLOW);
		btnOrder_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder_4.setBackground(Color.RED);
		btnOrder_4.setBounds(85, 200, 89, 23);
		inv4_1.add(btnOrder_4);

		JLabel lblNewLabel_2_3 = new JLabel("DOUBLE CHEESE BURGER");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setForeground(Color.RED);
		lblNewLabel_2_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblNewLabel_2_3.setBackground(Color.RED);
		lblNewLabel_2_3.setBounds(10, 11, 233, 20);
		inv4_1.add(lblNewLabel_2_3);

		JPanel menu_2 = new JPanel();
		menu_2.setBackground(Color.BLACK);
		pnlMenu.add(menu_2, "menu_2");
		menu_2.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel inv1_2 = new JPanel();
		inv1_2.setBorder(new LineBorder(Color.RED, 2));
		inv1_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv1_2);
		inv1_2.setLayout(null);

		JButton btnNewButton_4 = new JButton("ORDER");
		btnNewButton_4.setForeground(Color.YELLOW);
		btnNewButton_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnNewButton_4.setBackground(Color.RED);
		btnNewButton_4.setBounds(85, 200, 89, 23);
		inv1_2.add(btnNewButton_4);

		JLabel lblNewLabel_2_4 = new JLabel("LENINADE");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setForeground(Color.RED);
		lblNewLabel_2_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblNewLabel_2_4.setBackground(Color.RED);
		lblNewLabel_2_4.setBounds(10, 11, 233, 20);
		inv1_2.add(lblNewLabel_2_4);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(10, 42, 233, 147);
		inv1_2.add(lblNewLabel_5);

		JPanel inv2_2 = new JPanel();
		inv2_2.setBorder(new LineBorder(Color.RED, 2));
		inv2_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv2_2);
		inv2_2.setLayout(null);

		JButton btnNewButton_5 = new JButton("ORDER");
		btnNewButton_5.setForeground(Color.YELLOW);
		btnNewButton_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnNewButton_5.setBackground(Color.RED);
		btnNewButton_5.setBounds(85, 200, 89, 23);
		inv2_2.add(btnNewButton_5);

		JLabel lblNewLabel_2_5 = new JLabel("KVASS");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(Color.RED);
		lblNewLabel_2_5.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblNewLabel_2_5.setBackground(Color.RED);
		lblNewLabel_2_5.setBounds(10, 11, 233, 20);
		inv2_2.add(lblNewLabel_2_5);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBackground(new Color(255, 255, 204));
		lblNewLabel_6.setBounds(10, 42, 233, 147);
		inv2_2.add(lblNewLabel_6);

		JPanel inv3_2 = new JPanel();
		inv3_2.setBorder(new LineBorder(Color.RED, 2));
		inv3_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv3_2);
		inv3_2.setLayout(null);

		JButton btnNewButton_6 = new JButton("ORDER");
		btnNewButton_6.setForeground(Color.YELLOW);
		btnNewButton_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnNewButton_6.setBackground(Color.RED);
		btnNewButton_6.setBounds(85, 200, 89, 23);
		inv3_2.add(btnNewButton_6);

		JLabel lblNewLabel_2_6 = new JLabel("TARKHUN");
		lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_6.setForeground(Color.RED);
		lblNewLabel_2_6.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblNewLabel_2_6.setBackground(Color.RED);
		lblNewLabel_2_6.setBounds(10, 11, 233, 20);
		inv3_2.add(lblNewLabel_2_6);

		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBackground(new Color(255, 255, 204));
		lblNewLabel_7.setBounds(10, 42, 233, 147);
		inv3_2.add(lblNewLabel_7);

		JPanel inv4_2 = new JPanel();
		inv4_2.setBorder(new LineBorder(Color.RED, 2));
		inv4_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv4_2);
		inv4_2.setLayout(null);

		JButton btnNewButton_7 = new JButton("ORDER");
		btnNewButton_7.setForeground(Color.YELLOW);
		btnNewButton_7.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnNewButton_7.setBackground(Color.RED);
		btnNewButton_7.setBounds(85, 200, 89, 23);
		inv4_2.add(btnNewButton_7);

		JLabel lblNewLabel_2_7 = new JLabel("MEDOVUKHA");
		lblNewLabel_2_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_7.setForeground(Color.RED);
		lblNewLabel_2_7.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblNewLabel_2_7.setBackground(Color.RED);
		lblNewLabel_2_7.setBounds(10, 11, 233, 20);
		inv4_2.add(lblNewLabel_2_7);

		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(10, 42, 233, 147);
		inv4_2.add(lblNewLabel_8);

		JPanel menu_3 = new JPanel();
		menu_3.setBackground(Color.GREEN);
		pnlMenu.add(menu_3, "menu_3");
		menu_3.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel inv1_3 = new JPanel();
		inv1_3.setBackground(new Color(255, 255, 204));
		inv1_3.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(inv1_3);
		inv1_3.setLayout(null);

		JLabel lblNewLabel_2_4_1 = new JLabel("MEDOVIK");
		lblNewLabel_2_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4_1.setForeground(Color.RED);
		lblNewLabel_2_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblNewLabel_2_4_1.setBackground(Color.RED);
		lblNewLabel_2_4_1.setBounds(10, 11, 233, 20);
		inv1_3.add(lblNewLabel_2_4_1);

		JLabel lblNewLabel_5_1 = new JLabel("New label");
		lblNewLabel_5_1.setBounds(10, 42, 233, 147);
		inv1_3.add(lblNewLabel_5_1);

		JButton btnNewButton_4_1 = new JButton("ORDER");
		btnNewButton_4_1.setForeground(Color.YELLOW);
		btnNewButton_4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnNewButton_4_1.setBackground(Color.RED);
		btnNewButton_4_1.setBounds(85, 200, 89, 23);
		inv1_3.add(btnNewButton_4_1);

		JPanel inv2_3 = new JPanel();
		inv2_3.setBackground(new Color(255, 255, 204));
		inv2_3.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(inv2_3);
		inv2_3.setLayout(null);

		JLabel lblNewLabel_2_4_2 = new JLabel("SYRNIKI");
		lblNewLabel_2_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4_2.setForeground(Color.RED);
		lblNewLabel_2_4_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblNewLabel_2_4_2.setBackground(Color.RED);
		lblNewLabel_2_4_2.setBounds(10, 11, 233, 20);
		inv2_3.add(lblNewLabel_2_4_2);

		JLabel lblNewLabel_5_2 = new JLabel("New label");
		lblNewLabel_5_2.setBounds(10, 42, 233, 147);
		inv2_3.add(lblNewLabel_5_2);

		JButton btnNewButton_4_2 = new JButton("ORDER");
		btnNewButton_4_2.setForeground(Color.YELLOW);
		btnNewButton_4_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnNewButton_4_2.setBackground(Color.RED);
		btnNewButton_4_2.setBounds(85, 200, 89, 23);
		inv2_3.add(btnNewButton_4_2);

		JPanel inv3_3 = new JPanel();
		inv3_3.setBackground(new Color(255, 255, 204));
		inv3_3.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(inv3_3);
		inv3_3.setLayout(null);

		JLabel lblNewLabel_2_4_3 = new JLabel("BAKLAVA");
		lblNewLabel_2_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4_3.setForeground(Color.RED);
		lblNewLabel_2_4_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblNewLabel_2_4_3.setBackground(Color.RED);
		lblNewLabel_2_4_3.setBounds(10, 11, 233, 20);
		inv3_3.add(lblNewLabel_2_4_3);

		JLabel lblNewLabel_5_3 = new JLabel("New label");
		lblNewLabel_5_3.setBounds(10, 42, 233, 147);
		inv3_3.add(lblNewLabel_5_3);

		JButton btnNewButton_4_3 = new JButton("ORDER");
		btnNewButton_4_3.setForeground(Color.YELLOW);
		btnNewButton_4_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnNewButton_4_3.setBackground(Color.RED);
		btnNewButton_4_3.setBounds(85, 200, 89, 23);
		inv3_3.add(btnNewButton_4_3);

		JPanel inv4_3 = new JPanel();
		inv4_3.setBackground(new Color(255, 255, 204));
		inv4_3.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(inv4_3);
		inv4_3.setLayout(null);

		JLabel lblNewLabel_2_4_4 = new JLabel("VARENKI");
		lblNewLabel_2_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4_4.setForeground(Color.RED);
		lblNewLabel_2_4_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblNewLabel_2_4_4.setBackground(Color.RED);
		lblNewLabel_2_4_4.setBounds(10, 11, 233, 20);
		inv4_3.add(lblNewLabel_2_4_4);

		JLabel lblNewLabel_5_4 = new JLabel("New label");
		lblNewLabel_5_4.setBounds(10, 42, 233, 147);
		inv4_3.add(lblNewLabel_5_4);

		JButton btnNewButton_4_4 = new JButton("ORDER");
		btnNewButton_4_4.setForeground(Color.YELLOW);
		btnNewButton_4_4.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnNewButton_4_4.setBackground(Color.RED);
		btnNewButton_4_4.setBounds(85, 200, 89, 23);
		inv4_3.add(btnNewButton_4_4);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.RED);
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 70, 110, 481);
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(3, 1, 0, 0));

		JButton btnMenu_1 = new JButton("Burgers");
		btnMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) (pnlMenu.getLayout());
				c.show(pnlMenu, "menu_1");

			}
		});
		btnMenu_1.setFont(new Font("Red October Light", Font.PLAIN, 13));
		btnMenu_1.setForeground(Color.YELLOW);
		btnMenu_1.setBackground(Color.RED);
		panel_1.add(btnMenu_1);

		JButton btnMenu_2 = new JButton("Drinks");
		btnMenu_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) (pnlMenu.getLayout());
				c.show(pnlMenu, "menu_2");

			}
		});

		btnMenu_2.setFont(new Font("Red October Light", Font.PLAIN, 14));
		btnMenu_2.setForeground(Color.YELLOW);
		btnMenu_2.setBackground(Color.RED);
		panel_1.add(btnMenu_2);

		JButton btnMenu_3 = new JButton("Desserts");
		btnMenu_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) (pnlMenu.getLayout());
				c.show(pnlMenu, "menu_3");

			}
		});
		btnMenu_3.setFont(new Font("Red October Light", Font.PLAIN, 11));
		btnMenu_3.setForeground(Color.YELLOW);
		btnMenu_3.setBackground(Color.RED);
		panel_1.add(btnMenu_3);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(635, 81, 209, 469);
		getContentPane().add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Item", "Qty" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(15);
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
	}

	public void buttonFunction(String var) {

		if (table.getRowCount() == 0 || table.getColumnCount() == 0) {

			String input[] = { var, "1" };
			DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
			tblModel.addRow(input);

			return;

		}

		String checker = "";
		for (int i = 0; i < table.getRowCount(); i++) {
			checker = table.getValueAt(i, 0).toString().trim();

			if (var.equals(checker)) {

				int newNum = Integer.parseInt(table.getValueAt(i, 1).toString()) + 1;
				table.setValueAt(Integer.toString(newNum), i, 1);
			} else {
				String input[] = { var, "1" };
				DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
				tblModel.addRow(input);
			}
		}

	}
}
