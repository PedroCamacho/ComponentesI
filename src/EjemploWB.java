import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class EjemploWB extends JFrame {

	private JPanel contentPane;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JButton btnOK;
	private JComboBox comboBox;
	private JTextArea textArea;
	private JCheckBox chckbxNewCheckBox;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		EjemploWB frame = new EjemploWB();
		frame.setVisible(true);
	}

	public EjemploWB() {
		setTitle("Ejemplo Componentes I");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 32, 65, 14);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(105, 29, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(chckbxNewCheckBox.isSelected() ? "Está seleccionado" : "No está seleccionado");
			}
		});
		btnOK.setBounds(315, 228, 89, 23);
		contentPane.add(btnOK);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 60, 161, 108);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		comboBox = new JComboBox();
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.addItem("5");
		comboBox.setBounds(201, 28, 57, 22);
		contentPane.add(comboBox);

		chckbxNewCheckBox = new JCheckBox("Pregunta");
		chckbxNewCheckBox.setBounds(279, 28, 97, 23);
		contentPane.add(chckbxNewCheckBox);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String texto = ((JRadioButton) e.getSource()).getText();
				if (e.getStateChange() == ItemEvent.DESELECTED)
					System.out.format("Botón %s deseleccionado.\n", texto);
				else if (e.getStateChange() == ItemEvent.SELECTED)
					System.out.format("Botón %s seleccionado.\n", texto);
			}

		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(197, 62, 109, 23);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String texto = ((JRadioButton) e.getSource()).getText();
				if (e.getStateChange() == ItemEvent.DESELECTED)
					System.out.format("Botón %s deseleccionado.\n", texto);
				else if (e.getStateChange() == ItemEvent.SELECTED)
					System.out.format("Botón %s seleccionado.\n", texto);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(197, 88, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
	}
}
