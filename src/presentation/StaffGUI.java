package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public StaffGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(221, 28, 330, 262);
		contentPane.add(table);
		
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.setBounds(24, 38, 171, 41);
		contentPane.add(btnAddBook);
		
		JButton btnEditBook = new JButton("Edit Book");
		btnEditBook.setBounds(24, 113, 171, 41);
		contentPane.add(btnEditBook);
		
		JButton btnDeleteBook = new JButton("Delete Book");
		btnDeleteBook.setBounds(24, 182, 184, 41);
		contentPane.add(btnDeleteBook);
		
		JButton btnViewAllBooks = new JButton("View All Books");
		btnViewAllBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnViewAllBooks.setBounds(287, 331, 203, 57);
		contentPane.add(btnViewAllBooks);
	}

}
