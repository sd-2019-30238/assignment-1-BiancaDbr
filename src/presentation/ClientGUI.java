package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


	/**
	 * Create the frame.
	 */
	public ClientGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(26, 321, 518, 175);
		contentPane.add(table);
		
		JButton btnBorrowBook = new JButton("Borrow Book");
		btnBorrowBook.setBounds(179, 524, 196, 41);
		contentPane.add(btnBorrowBook);
		
		JButton btnViewAllBooks = new JButton("Filter");
		btnViewAllBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnViewAllBooks.setBounds(192, 186, 206, 41);
		contentPane.add(btnViewAllBooks);
		
		JCheckBox chckbxReleaseDate = new JCheckBox("Release Date");
		chckbxReleaseDate.setBounds(26, 24, 221, 41);
		contentPane.add(chckbxReleaseDate);
		
		JCheckBox chckbxAuthor = new JCheckBox("Author");
		chckbxAuthor.setBounds(26, 67, 221, 41);
		contentPane.add(chckbxAuthor);
		
		JCheckBox chckbxGenre = new JCheckBox("Genre");
		chckbxGenre.setBounds(26, 112, 221, 41);
		contentPane.add(chckbxGenre);
		
		textField = new JTextField();
		textField.setBounds(295, 25, 236, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(295, 68, 236, 39);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(295, 113, 236, 39);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("View All Books");
		button.setBounds(138, 255, 319, 41);
		contentPane.add(button);
	}
}
