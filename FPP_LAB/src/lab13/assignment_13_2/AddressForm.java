package lab13.assignment_13_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class AddressForm extends JFrame {

	private static final long serialVersionUID = 1L;
//	public static int SCREEN_WIDTH = 580;
	public static int SCREEN_WIDTH = 800;
	public static int SCREEN_HEIGHT = 225;

	// JPanels
	private JPanel mainPanel;

	private JPanel subPanel1;
	private JLabel labelID;
	private JTextField fieldID;
	private JLabel labelFirstName;
	private JTextField fieldFirstName;
	private JLabel labelLastName;
	private JTextField fieldLastName;
	private JLabel labelSSN;
	private JTextField fieldSSN;

	private JPanel subPanel2;
	private JLabel labelStreet;
	private JTextField fieldStreet;
	private JLabel labelCity;
	private JTextField fieldCity;
	private JLabel labelState;
	private JTextField fieldState;
	private JLabel labelZip;
	private JTextField fieldZip;

	private JPanel subPanel3;
	private JLabel labelResult;

	private JPanel subPanel4;
	private JButton searchButton;
	private JButton saveButton;
	private JButton clearButton;

	private DBInterface db;
	
	private void initializeWindow() {
		setTitle("Address Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		centerFrameOnDesktop(this);
		handleWindowClosing();
	}

	private void centerFrameOnDesktop(Component f) {
		final int SHIFT_AMOUNT = 0;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
	}

	private void handleWindowClosing() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w) {
				dispose();
				// other clean-up
				System.exit(0);
			}
		});
	}

	private void defineMainPanel() {
		mainPanel = new JPanel();
		mainPanel.setSize(175, SCREEN_WIDTH);
		mainPanel.setLayout(new GridLayout(4, 1));
		mainPanel.setBackground(Color.white);

		definePanel1();
		definePanel2();
		definePanel3();
		definePanel4();

		mainPanel.add(subPanel1);
		mainPanel.add(subPanel2);
		mainPanel.add(subPanel3);
		mainPanel.add(subPanel4);
	}

	private void definePanel1() {
		subPanel1 = new JPanel();
		subPanel1.setBackground(Color.WHITE);
		subPanel1.setLayout(new GridLayout(1, 4));

		defineIDPanel();
		defineFirstNamePanel();
		defineLastNamePanel();
		defineSSNPanel();
	}

	private void defineIDPanel() {
		JPanel idPanel = new JPanel();
		idPanel.setLayout(new GridBagLayout());

		labelID = new JLabel("ID");
		fieldID = new JTextField();
		fieldID.setPreferredSize(new Dimension(150, 10));

		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.anchor = GridBagConstraints.NORTHWEST;
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		idPanel.add(labelID, gbc1);

		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.gridx = 0;
		gbc2.gridy = 1;
		gbc2.ipadx = 150;
		gbc2.ipady = 0;
		idPanel.add(fieldID, gbc2);

		subPanel1.add(idPanel);
	}

	private void defineFirstNamePanel() {
		JPanel firstNamePanel = new JPanel();
		firstNamePanel.setLayout(new GridBagLayout());

		labelFirstName = new JLabel("First Name");
		fieldFirstName = new JTextField();
		fieldFirstName.setPreferredSize(new Dimension(150, 10));

		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.anchor = GridBagConstraints.NORTHWEST;
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		firstNamePanel.add(labelFirstName, gbc1);

		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.ipadx = 150;
		gbc2.ipady = 0;
		gbc2.gridx = 0;
		gbc2.gridy = 1;
		firstNamePanel.add(fieldFirstName, gbc2);

		subPanel1.add(firstNamePanel);
	}

	private void defineLastNamePanel() {
		JPanel lastNamePanel = new JPanel();
		lastNamePanel.setLayout(new GridBagLayout());

		labelLastName = new JLabel("Last Name");
		fieldLastName = new JTextField();
		fieldLastName.setPreferredSize(new Dimension(150, 10));

		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.anchor = GridBagConstraints.NORTHWEST;
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		lastNamePanel.add(labelLastName, gbc1);

		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.gridx = 0;
		gbc2.gridy = 1;
		gbc2.ipadx = 150;
		gbc2.ipady = 0;
		lastNamePanel.add(fieldLastName, gbc2);

		subPanel1.add(lastNamePanel);
	}

	private void defineSSNPanel() {
		JPanel ssnPanel = new JPanel();
		ssnPanel.setLayout(new GridBagLayout());

		labelSSN = new JLabel("SSN");
		fieldSSN = new JTextField();
		fieldSSN.setPreferredSize(new Dimension(150, 10));

		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.anchor = GridBagConstraints.NORTHWEST;
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		ssnPanel.add(labelSSN, gbc1);

		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.gridx = 0;
		gbc2.gridy = 1;
		gbc2.ipadx = 150;
		gbc2.ipady = 0;
		ssnPanel.add(fieldSSN, gbc2);

		subPanel1.add(ssnPanel);
	}

	private void definePanel2() {
		subPanel2 = new JPanel();
		subPanel2.setBackground(Color.WHITE);
		subPanel2.setLayout(new GridLayout(1, 4));

		defineStreetPanel();
		defineCityPanel();
		defineStatePanel();
		defineZipPanel();
	}

	private void defineStreetPanel() {
		JPanel streetPanel = new JPanel();
		streetPanel.setLayout(new GridBagLayout());

		labelStreet = new JLabel("Street");
		fieldStreet = new JTextField();
		fieldStreet.setPreferredSize(new Dimension(150, 10));

		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.anchor = GridBagConstraints.NORTHWEST;
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		streetPanel.add(labelStreet, gbc1);

		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.gridx = 0;
		gbc2.gridy = 1;
		gbc2.ipadx = 150;
		gbc2.ipady = 0;
		streetPanel.add(fieldStreet, gbc2);

		subPanel2.add(streetPanel);
	}

	private void defineCityPanel() {
		JPanel cityPanel = new JPanel();
		cityPanel.setLayout(new GridBagLayout());

		labelCity = new JLabel("City");
		fieldCity = new JTextField();
		fieldCity.setPreferredSize(new Dimension(150, 10));

		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.anchor = GridBagConstraints.NORTHWEST;
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		cityPanel.add(labelCity, gbc1);

		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.gridx = 0;
		gbc2.gridy = 1;
		gbc2.ipadx = 150;
		gbc2.ipady = 0;
		cityPanel.add(fieldCity, gbc2);

		subPanel2.add(cityPanel);
	}

	private void defineStatePanel() {
		JPanel statePanel = new JPanel();
		statePanel.setLayout(new GridBagLayout());

		labelState = new JLabel("State");
		fieldState = new JTextField();
		fieldState.setPreferredSize(new Dimension(150, 10));

		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.anchor = GridBagConstraints.NORTHWEST;
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		statePanel.add(labelState, gbc1);

		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.gridx = 0;
		gbc2.gridy = 1;
		gbc2.ipadx = 150;
		gbc2.ipady = 0;
		statePanel.add(fieldState, gbc2);

		subPanel2.add(statePanel);
	}

	private void defineZipPanel() {
		JPanel zipPanel = new JPanel();
		zipPanel.setLayout(new GridBagLayout());

		labelZip = new JLabel("Zip");
		fieldZip = new JTextField();
		fieldZip.setPreferredSize(new Dimension(150, 10));

		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.anchor = GridBagConstraints.NORTHWEST;
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		zipPanel.add(labelZip, gbc1);

		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.gridx = 0;
		gbc2.gridy = 1;
		gbc2.ipadx = 150;
		gbc2.ipady = 0;
		zipPanel.add(fieldZip, gbc2);

		subPanel2.add(zipPanel);
	}

	private void definePanel3() {
		subPanel3 = new JPanel();
//		subPanel3.setBackground(Color.WHITE);
		
		Border blackline = BorderFactory.createLineBorder(Color.blue.darker());
		subPanel3.setBorder(blackline);

		subPanel3.setLayout(new GridLayout(1, 0));
		GridBagConstraints gbc1 = new GridBagConstraints();
//		gbc1.anchor = GridBagConstraints.NORTHWEST;
		gbc1.gridx = 0;	gbc1.gridy = 10;
//		gbc1.ipadx = 300; gbc1.ipady = 0;
		gbc1.insets = new Insets(10, 100, 10, 10);

		labelResult = new JLabel("");
		labelResult.setForeground(Color.red.darker());
//		Border blueline = BorderFactory.createLineBorder(Color.blue);
//		labelResult.setBorder(blueline);

		subPanel3.add(labelResult, gbc1);
	}

	private void definePanel4() {
		subPanel4 = new JPanel();
		subPanel4.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		addButtonSearch();
		addButtonSave();
		addButtonClear();

		subPanel4.add(searchButton);
		subPanel4.add(saveButton);
		subPanel4.add(clearButton);

	}
	
	private void addButtonSearch() {
		class SearchListener implements ActionListener {
			public void actionPerformed(ActionEvent evt) {
				labelResult.setText("");
				fieldFirstName.setText("");
				fieldLastName.setText("");
				fieldSSN.setText("");
				fieldStreet.setText("");
				fieldCity.setText("");
				fieldState.setText("");
				fieldZip.setText("");
				String id = fieldID.getText();
				if (id == null || id.equals("")) {
					labelResult.setText("No ID");
					return;
				}
				
				db.connect();
				People res = db.getInfo(id);
				db.disconnect();
				
				if (res == null) {
					fieldFirstName.setText("");
					fieldLastName.setText("");
					fieldSSN.setText("");
					fieldStreet.setText("");
					fieldCity.setText("");
					fieldState.setText("");
					fieldZip.setText("");
					
					labelResult.setText("No Record Found");
				}
				else {
					fieldID.setText(res.id);
					fieldFirstName.setText(res.firstName);
					fieldLastName.setText(res.lastName);
					fieldSSN.setText(res.ssn);
					fieldStreet.setText(res.street);
					fieldCity.setText(res.city);
					fieldState.setText(res.state);
					fieldZip.setText(res.zip);
					
					labelResult.setText("Record Found");
				}
				
			}
		}

		SearchListener sl = new SearchListener();
		searchButton = new JButton("Search");
		searchButton.addActionListener(sl);

		subPanel4.add(searchButton);
	}
	
	private void addButtonSave() {
		class SaveListener implements ActionListener {
			public void actionPerformed(ActionEvent evt) {
				labelResult.setText("");
				String id = fieldID.getText();
				if (id != null && !id.equals("")) {
					labelResult.setText("No value for ID when adding new record");
					return;
				}
				People people = new People();
				people.firstName = fieldFirstName.getText();
				people.lastName = fieldLastName.getText();
				people.ssn = fieldSSN.getText();
				people.street = fieldStreet.getText();
				people.city = fieldCity.getText();
				people.state = fieldState.getText();
				people.zip = fieldZip.getText();
				
				if ("".equals(people.firstName) || 
					"".equals(people.lastName) ||
					"".equals(people.ssn) ||
					"".equals(people.street) ||
					"".equals(people.city) ||
					"".equals(people.zip)) {
					labelResult.setText("To perform a save, all fields but ID must nonempty");
					
					return;
				}
																
				db.connect();
				db.addNew(people);
				labelResult.setText("Database has been updated");
				db.disconnect();				
			}
		}

		SaveListener sl = new SaveListener();
		saveButton = new JButton("Save");
		saveButton.addActionListener(sl);

		subPanel4.add(saveButton);
		
	}
	
	private void addButtonClear() {
		class ClearListener implements ActionListener {
			public void actionPerformed(ActionEvent evt) {
				labelResult.setText("");
				
				fieldID.setText("");
				fieldFirstName.setText("");
				fieldLastName.setText("");
				fieldSSN.setText("");
				fieldStreet.setText("");
				fieldCity.setText("");
				fieldState.setText("");
				fieldZip.setText("");
				
			}
		}

		ClearListener sl = new ClearListener();
		clearButton = new JButton("Clear");
		clearButton.addActionListener(sl);
		
		subPanel4.add(clearButton);
	}



	AddressForm() {
		initializeWindow();
		defineMainPanel();
		getContentPane().add(mainPanel);
		
		db = new DBInterface();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				AddressForm addressForm = new AddressForm();
				addressForm.setVisible(true);
			}
		});
	}
}
