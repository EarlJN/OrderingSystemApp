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
		txtTitle.setBounds(170, 20, 570, 41);
		txtTitle.setFont(new Font("Red October", Font.PLAIN, 36));
		txtTitle.setForeground(Color.YELLOW);
		pnlHeading.add(txtTitle);

		JLabel imgLogo = new JLabel("New label");
		imgLogo.setBounds(10, 11, 140, 46);
		Image logo = new ImageIcon(this.getClass().getResource("/logo_1.png")).getImage();
		System.out.println(imgLogo);
		imgLogo.setIcon(new ImageIcon(logo));
		pnlHeading.add(imgLogo);

		JLabel imgLogo_2 = new JLabel("New label");
		imgLogo_2.setBounds(763, 11, 81, 46);
		setImg(imgLogo_2, "./imgs/logo_2.png", 81, 46);
		pnlHeading.add(imgLogo_2);

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

		JButton btnOrder1_1 = new JButton("ORDER");
		btnOrder1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Classic Burger");
			}
		});
		btnOrder1_1.setForeground(Color.YELLOW);
		btnOrder1_1.setBackground(Color.RED);
		btnOrder1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder1_1.setBounds(85, 200, 89, 23);
		inv1_1.add(btnOrder1_1);

		JLabel imgMenu1_1 = new JLabel("burger_1");
		imgMenu1_1.setBounds(10, 42, 233, 147);
		setImg(imgMenu1_1, "./imgs/burger_1.png", 233, 147);

		inv1_1.add(imgMenu1_1);

		JLabel lblHeading1_1 = new JLabel("CLASSIC BURGER");
		lblHeading1_1.setBackground(Color.RED);
		lblHeading1_1.setForeground(Color.RED);
		lblHeading1_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading1_1.setBounds(10, 11, 233, 20);
		inv1_1.add(lblHeading1_1);

		JPanel inv2_1 = new JPanel();
		inv2_1.setBackground(new Color(255, 255, 204));
		inv2_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv2_1);
		inv2_1.setLayout(null);

		JLabel imgMenu2_1 = new JLabel("New label");
		setImg(imgMenu2_1, "./imgs/Burger_2.png", 233, 147);
		imgMenu2_1.setBounds(10, 42, 233, 147);
		inv2_1.add(imgMenu2_1);

		JButton btnOrder2_1 = new JButton("ORDER");
		btnOrder2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Cheese Burger");
			}

		});
		btnOrder2_1.setForeground(Color.YELLOW);
		btnOrder2_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder2_1.setBackground(Color.RED);
		btnOrder2_1.setBounds(85, 200, 89, 23);
		inv2_1.add(btnOrder2_1);

		JLabel lblHeading_2 = new JLabel("CHEESE BURGER");
		lblHeading_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading_2.setForeground(Color.RED);
		lblHeading_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading_2.setBackground(Color.RED);
		lblHeading_2.setBounds(10, 11, 233, 20);
		inv2_1.add(lblHeading_2);

		JPanel inv3_1 = new JPanel();
		inv3_1.setBackground(new Color(255, 255, 204));
		inv3_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv3_1);
		inv3_1.setLayout(null);

		JLabel imgMenu3_1 = new JLabel("New label");
		imgMenu3_1.setBounds(10, 42, 233, 147);
		setImg(imgMenu3_1, "./imgs/burger_3.png", 233, 147);
		inv3_1.add(imgMenu3_1);

		JButton btnOrder3_1 = new JButton("ORDER");
		btnOrder3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Bacon Cheese Burger");
			}
		});
		btnOrder3_1.setForeground(Color.YELLOW);
		btnOrder3_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder3_1.setBackground(Color.RED);
		btnOrder3_1.setBounds(85, 200, 89, 23);
		inv3_1.add(btnOrder3_1);

		JLabel lblHeading3_1 = new JLabel("BACON CHEESE BURGER");
		lblHeading3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading3_1.setForeground(Color.RED);
		lblHeading3_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading3_1.setBackground(Color.RED);
		lblHeading3_1.setBounds(10, 11, 233, 20);
		inv3_1.add(lblHeading3_1);

		JPanel inv4_1 = new JPanel();
		inv4_1.setBackground(new Color(255, 255, 204));
		inv4_1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		menu_1.add(inv4_1);
		inv4_1.setLayout(null);

		JLabel imgMenu4_1 = new JLabel("New label");
		imgMenu4_1.setBounds(10, 42, 233, 147);
		setImg(imgMenu4_1, "./imgs/burger_4.png", 233, 147);
		inv4_1.add(imgMenu4_1);

		JButton btnOrder4_1 = new JButton("ORDER");
		btnOrder4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Double Cheese Burger");
			}
		});
		btnOrder4_1.setForeground(Color.YELLOW);
		btnOrder4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder4_1.setBackground(Color.RED);
		btnOrder4_1.setBounds(85, 200, 89, 23);
		inv4_1.add(btnOrder4_1);

		JLabel lblHeading4_1 = new JLabel("DOUBLE CHEESE BURGER");
		lblHeading4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading4_1.setForeground(Color.RED);
		lblHeading4_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeading4_1.setBackground(Color.RED);
		lblHeading4_1.setBounds(10, 11, 233, 20);
		inv4_1.add(lblHeading4_1);

		JPanel menu_2 = new JPanel();
		menu_2.setBackground(Color.BLACK);
		pnlMenu.add(menu_2, "menu_2");
		menu_2.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel inv1_2 = new JPanel();
		inv1_2.setBorder(new LineBorder(Color.RED, 2));
		inv1_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv1_2);
		inv1_2.setLayout(null);

		JButton btnOrder1_2 = new JButton("ORDER");
		btnOrder1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Leninade");
			}
		});
		btnOrder1_2.setForeground(Color.YELLOW);
		btnOrder1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder1_2.setBackground(Color.RED);
		btnOrder1_2.setBounds(85, 200, 89, 23);
		inv1_2.add(btnOrder1_2);

		JLabel lblHeader1_2 = new JLabel("LENINADE");
		lblHeader1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader1_2.setForeground(Color.RED);
		lblHeader1_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader1_2.setBackground(Color.RED);
		lblHeader1_2.setBounds(10, 11, 233, 20);
		inv1_2.add(lblHeader1_2);

		JLabel imgMenu1_2 = new JLabel("New label");
		imgMenu1_2.setBounds(10, 42, 233, 147);
		setImg(imgMenu1_2, "./imgs/drinks_1.png", 233, 147);
		inv1_2.add(imgMenu1_2);

		JPanel inv2_2 = new JPanel();
		inv2_2.setBorder(new LineBorder(Color.RED, 2));
		inv2_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv2_2);
		inv2_2.setLayout(null);

		JButton btnOrder2_2 = new JButton("ORDER");
		btnOrder2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Kvass");
			}
		});
		btnOrder2_2.setForeground(Color.YELLOW);
		btnOrder2_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder2_2.setBackground(Color.RED);
		btnOrder2_2.setBounds(85, 200, 89, 23);
		inv2_2.add(btnOrder2_2);

		JLabel lblHeader2_2 = new JLabel("KVASS");
		lblHeader2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader2_2.setForeground(Color.RED);
		lblHeader2_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader2_2.setBackground(Color.RED);
		lblHeader2_2.setBounds(10, 11, 233, 20);
		inv2_2.add(lblHeader2_2);

		JLabel imgMenu2_2 = new JLabel("Leninade");
		imgMenu2_2.setBounds(10, 42, 233, 147);
		setImg(imgMenu2_2, "./imgs/drinks_2.png", 233, 147);
		inv2_2.add(imgMenu2_2);

		JPanel inv3_2 = new JPanel();
		inv3_2.setBorder(new LineBorder(Color.RED, 2));
		inv3_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv3_2);
		inv3_2.setLayout(null);

		JButton btnOrder3_2 = new JButton("ORDER");
		btnOrder3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Tarkhun");
			}
		});
		btnOrder3_2.setForeground(Color.YELLOW);
		btnOrder3_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder3_2.setBackground(Color.RED);
		btnOrder3_2.setBounds(85, 200, 89, 23);
		inv3_2.add(btnOrder3_2);

		JLabel lblHeader3_2 = new JLabel("TARKHUN");
		lblHeader3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader3_2.setForeground(Color.RED);
		lblHeader3_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader3_2.setBackground(Color.RED);
		lblHeader3_2.setBounds(10, 11, 233, 20);
		inv3_2.add(lblHeader3_2);

		JLabel imgMenu3_2 = new JLabel("Tarkhun");
		imgMenu3_2.setBounds(10, 42, 233, 147);
		setImg(imgMenu3_2, "./imgs/drinks_3.png", 233, 147);
		inv3_2.add(imgMenu3_2);

		JPanel inv4_2 = new JPanel();
		inv4_2.setBorder(new LineBorder(Color.RED, 2));
		inv4_2.setBackground(new Color(255, 255, 204));
		menu_2.add(inv4_2);
		inv4_2.setLayout(null);

		JButton btnOrder4_2 = new JButton("ORDER");
		btnOrder4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Medovukha");
			}
		});
		btnOrder4_2.setForeground(Color.YELLOW);
		btnOrder4_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder4_2.setBackground(Color.RED);
		btnOrder4_2.setBounds(85, 200, 89, 23);
		inv4_2.add(btnOrder4_2);

		JLabel lblHeader4_2 = new JLabel("MEDOVUKHA");
		lblHeader4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader4_2.setForeground(Color.RED);
		lblHeader4_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader4_2.setBackground(Color.RED);
		lblHeader4_2.setBounds(10, 11, 233, 20);
		inv4_2.add(lblHeader4_2);

		JLabel imgMenu4_2 = new JLabel("New label");
		imgMenu4_2.setBounds(10, 42, 233, 147);
		setImg(imgMenu4_2, "./imgs/drinks_4.png", 233, 147);
		inv4_2.add(imgMenu4_2);

		JPanel menu_3 = new JPanel();
		menu_3.setBackground(Color.GREEN);
		pnlMenu.add(menu_3, "menu_3");
		menu_3.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel inv1_3 = new JPanel();
		inv1_3.setBackground(new Color(255, 255, 204));
		inv1_3.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(inv1_3);
		inv1_3.setLayout(null);

		JLabel lblHeader_1_3 = new JLabel("MEDOVIK");
		lblHeader_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader_1_3.setForeground(Color.RED);
		lblHeader_1_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader_1_3.setBackground(Color.RED);
		lblHeader_1_3.setBounds(10, 11, 233, 20);
		inv1_3.add(lblHeader_1_3);

		JLabel imgMenu1_3 = new JLabel("New label");
		imgMenu1_3.setBounds(10, 42, 233, 147);
		setImg(imgMenu1_3, "./imgs/dessert_1.png", 233, 147);
		inv1_3.add(imgMenu1_3);

		JButton btnOrder1_3 = new JButton("ORDER");
		btnOrder1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Medovik");
			}
		});
		btnOrder1_3.setForeground(Color.YELLOW);
		btnOrder1_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder1_3.setBackground(Color.RED);
		btnOrder1_3.setBounds(85, 200, 89, 23);
		inv1_3.add(btnOrder1_3);

		JPanel inv2_3 = new JPanel();
		inv2_3.setBackground(new Color(255, 255, 204));
		inv2_3.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(inv2_3);
		inv2_3.setLayout(null);

		JLabel lblHeader2_3 = new JLabel("SYRNIKI");
		lblHeader2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader2_3.setForeground(Color.RED);
		lblHeader2_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader2_3.setBackground(Color.RED);
		lblHeader2_3.setBounds(10, 11, 233, 20);
		inv2_3.add(lblHeader2_3);

		JLabel imgMenu2_3 = new JLabel("New label");
		imgMenu2_3.setBounds(10, 42, 233, 147);
		setImg(imgMenu2_3, "./imgs/dessert_2.png", 233, 147);
		inv2_3.add(imgMenu2_3);

		JButton btnOrder2_3 = new JButton("ORDER");
		btnOrder2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Syrniki");
			}
		});
		btnOrder2_3.setForeground(Color.YELLOW);
		btnOrder2_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder2_3.setBackground(Color.RED);
		btnOrder2_3.setBounds(85, 200, 89, 23);
		inv2_3.add(btnOrder2_3);

		JPanel inv3_3 = new JPanel();
		inv3_3.setBackground(new Color(255, 255, 204));
		inv3_3.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(inv3_3);
		inv3_3.setLayout(null);

		JLabel lblHeader3_3 = new JLabel("BAKLAVA");
		lblHeader3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader3_3.setForeground(Color.RED);
		lblHeader3_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader3_3.setBackground(Color.RED);
		lblHeader3_3.setBounds(10, 11, 233, 20);
		inv3_3.add(lblHeader3_3);

		JLabel imgMenu3_3 = new JLabel("New label");
		imgMenu3_3.setBounds(10, 42, 233, 147);
		setImg(imgMenu3_3, "./imgs/dessert_3.png", 233, 147);
		inv3_3.add(imgMenu3_3);

		JButton btnOrder3_3 = new JButton("ORDER");
		btnOrder3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Baklava");
			}
		});
		btnOrder3_3.setForeground(Color.YELLOW);
		btnOrder3_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder3_3.setBackground(Color.RED);
		btnOrder3_3.setBounds(85, 200, 89, 23);
		inv3_3.add(btnOrder3_3);

		JPanel inv4_3 = new JPanel();
		inv4_3.setBackground(new Color(255, 255, 204));
		inv4_3.setBorder(new LineBorder(Color.RED, 2));
		menu_3.add(inv4_3);
		inv4_3.setLayout(null);

		JLabel lblHeader4_3 = new JLabel("VARENKI");
		lblHeader4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader4_3.setForeground(Color.RED);
		lblHeader4_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		lblHeader4_3.setBackground(Color.RED);
		lblHeader4_3.setBounds(10, 11, 233, 20);
		inv4_3.add(lblHeader4_3);

		JLabel imgMenu4_3 = new JLabel("New label");
		imgMenu4_3.setBounds(10, 42, 233, 147);
		setImg(imgMenu4_3, "./imgs/dessert_4.png", 233, 147);
		inv4_3.add(imgMenu4_3);

		JButton btnOrder4_3 = new JButton("ORDER");
		btnOrder4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempButtonFunction("Varenki");
			}
		});
		btnOrder4_3.setForeground(Color.YELLOW);
		btnOrder4_3.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 12));
		btnOrder4_3.setBackground(Color.RED);
		btnOrder4_3.setBounds(85, 200, 89, 23);
		inv4_3.add(btnOrder4_3);

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
		table.setShowGrid(false);
		table.setRowSelectionAllowed(false);
		table.setBackground(new Color(255, 255, 204));
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Item" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
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

	public void tempButtonFunction(String var) {

		String input[] = { var };
		DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
		tblModel.addRow(input);

	}

	public void setImg(JLabel label, String dir, int x, int y) {

		ImageIcon imageIcon = new ImageIcon(dir); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it
		Image newimg = image.getScaledInstance(x, y, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		imageIcon = new ImageIcon(newimg);
		label.setIcon(imageIcon);

	}
}
