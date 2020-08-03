package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;

public class Screen extends JFrame {

	private JPanel contentPane;
	private JPanel masterPanel;
	private CardLayout cardLayout;
	private JTextField formInputID__textField;
	private JTextField formInputName__textField;
	private JTextField formInputDir__textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen frame = new Screen();
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
	public Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 587, 22);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("Menu");
		menuBar.add(menu);
		
		JMenuItem createProduct__menuItem = new JMenuItem("Create New Product");
		menu.add(createProduct__menuItem);
		
		JMenuItem listProducts__menuItem = new JMenuItem("List All Products");
		menu.add(listProducts__menuItem);
		
		masterPanel = new JPanel();
		masterPanel.setBounds(50, 61, 486, 431);
		contentPane.add(masterPanel);
		masterPanel.setLayout(new CardLayout(0, 0));
		cardLayout = (CardLayout) masterPanel.getLayout();
		
		JPanel createProduct__panel = new JPanel();
		masterPanel.add(createProduct__panel, "CREATE_PRODUCT__PANEL");
		
		JPanel listProducts__panel = new JPanel();
		masterPanel.add(listProducts__panel, "LIST_PRODUCTS__PANEL");
		listProducts__panel.setLayout(null);
		
		JLabel listProducts__label = new JLabel("List All Products");
		listProducts__label.setBounds(184, 5, 103, 16);
		listProducts__panel.add(listProducts__label);
		
		JPanel listProductsTable__panel = new JPanel();
		listProductsTable__panel.setBounds(23, 33, 436, 392);
		listProducts__panel.add(listProductsTable__panel);
		listProductsTable__panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 5, 424, 381);
		listProductsTable__panel.add(scrollPane);
		createProduct__panel.setLayout(null);
		
		JLabel createProduct__label = new JLabel("Create New Product");
		createProduct__label.setBounds(176, 12, 123, 16);
		createProduct__panel.add(createProduct__label);
		
		JPanel createProductForm__panel = new JPanel();
		createProductForm__panel.setBounds(50, 40, 380, 380);
		createProduct__panel.add(createProductForm__panel);
		createProductForm__panel.setLayout(null);
		
		JLabel formInputID__label = new JLabel("Product ID");
		formInputID__label.setBounds(79, 66, 91, 16);
		createProductForm__panel.add(formInputID__label);
		
		JLabel formInputName__label = new JLabel("Product Name");
		formInputName__label.setBounds(80, 109, 90, 16);
		createProductForm__panel.add(formInputName__label);
		
		JLabel formInputDir__label = new JLabel("Product Direction");
		formInputDir__label.setBounds(81, 158, 117, 16);
		createProductForm__panel.add(formInputDir__label);
		
		JLabel formInputAmount__label = new JLabel("Avilable Amount");
		formInputAmount__label.setBounds(82, 207, 116, 16);
		createProductForm__panel.add(formInputAmount__label);
		
		JButton formCancel__button = new JButton("Cancel");
		formCancel__button.setBounds(29, 296, 117, 29);
		createProductForm__panel.add(formCancel__button);
		
		JButton formSave__button = new JButton("Save");
		formSave__button.setBounds(234, 298, 117, 29);
		createProductForm__panel.add(formSave__button);
		
		formInputID__textField = new JTextField();
		formInputID__textField.setBounds(221, 61, 130, 26);
		createProductForm__panel.add(formInputID__textField);
		formInputID__textField.setColumns(10);
		
		formInputName__textField = new JTextField();
		formInputName__textField.setBounds(221, 104, 130, 26);
		createProductForm__panel.add(formInputName__textField);
		formInputName__textField.setColumns(10);
		
		formInputDir__textField = new JTextField();
		formInputDir__textField.setBounds(221, 153, 130, 26);
		createProductForm__panel.add(formInputDir__textField);
		formInputDir__textField.setColumns(10);
		
		JSpinner formInputAmount__spinner = new JSpinner();
		formInputAmount__spinner.setBounds(223, 202, 43, 26);
		createProductForm__panel.add(formInputAmount__spinner);
	}
}
