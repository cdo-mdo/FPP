package lab06.assignment_6_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lab06.samplecode.gui.GuiControl;

public class AddressForm extends JFrame {

	private static final long serialVersionUID = 1L;
	public static int SCREEN_WIDTH = 580;
	public static int SCREEN_HEIGHT = 200;

	// JPanels
	private JPanel mainPanel;

	private JPanel upperSubpanel;
	private JLabel labelName;
	private JTextField fieldName;
	private JLabel labelStreet;
	private JTextField fieldStreet;
	private JLabel labelCity;
	private JTextField fieldCity;

	private JPanel middleSubpanel;
	private JLabel labelState;
	private JTextField fieldState;
	private JLabel labelZip;
	private JTextField fieldZip;

	private JPanel lowerSubpanel;
	private JButton submitButton;

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
		mainPanel.setSize(168, 580);
		mainPanel.setLayout(new GridLayout(3, 1));
		mainPanel.setBackground(GuiControl.FILLER_COLOR);
		defineUpperPanel();
		defineMiddlePanel();
		defineLowerPanel();
		mainPanel.add(upperSubpanel, BorderLayout.NORTH);
		mainPanel.add(middleSubpanel, BorderLayout.CENTER);
		mainPanel.add(lowerSubpanel, BorderLayout.SOUTH);
	}

	private void defineUpperPanel() {
		upperSubpanel = new JPanel();
		upperSubpanel.setBackground(Color.WHITE);
		upperSubpanel.setLayout(new GridLayout(1, 3));

		JPanel namePanel = new JPanel();
		labelName = new JLabel("Name");
		fieldName = new JTextField();
		fieldName.setSize(10, 100);

		namePanel.setLayout(new GridBagLayout());
		GridBagConstraints gbcName = new GridBagConstraints();
		gbcName.fill = GridBagConstraints.VERTICAL;

		gbcName.gridx = 0;
		gbcName.gridy = 0;
		gbcName.anchor = GridBagConstraints.NORTHWEST;
		gbcName.insets = new Insets(1, 0, 0, 0);
		namePanel.add(labelName, gbcName);

		gbcName.ipadx = 150;
		gbcName.ipady = 0;
		gbcName.gridx = 0;
		gbcName.gridy = 1;
		namePanel.add(fieldName, gbcName);

		JPanel streetPanel = new JPanel();
		labelStreet = new JLabel("Street");
		fieldStreet = new JTextField();

		streetPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbcStreet = new GridBagConstraints();
		gbcStreet.fill = GridBagConstraints.VERTICAL;

		gbcStreet.gridx = 0;
		gbcStreet.gridy = 0;
		gbcStreet.anchor = GridBagConstraints.NORTHWEST;
		gbcStreet.insets = new Insets(1, 0, 0, 0);
		streetPanel.add(labelStreet, gbcStreet);

		gbcStreet.ipadx = 150;
		gbcStreet.ipady = 0;
		gbcStreet.gridx = 0;
		gbcStreet.gridy = 1;
		streetPanel.add(fieldStreet, gbcStreet);

		JPanel cityPanel = new JPanel();
		labelCity = new JLabel("City");
		fieldCity = new JTextField();

		cityPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbcCity = new GridBagConstraints();
		gbcCity.fill = GridBagConstraints.VERTICAL;

		gbcCity.gridx = 0;
		gbcCity.gridy = 0;
		gbcCity.anchor = GridBagConstraints.NORTHWEST;
		gbcCity.insets = new Insets(1, 0, 0, 0);
		cityPanel.add(labelCity, gbcCity);

		gbcCity.ipadx = 150;
		gbcCity.ipady = 0;
		gbcCity.gridx = 0;
		gbcCity.gridy = 1;
		cityPanel.add(fieldCity, gbcCity);

		upperSubpanel.add(namePanel);
		upperSubpanel.add(streetPanel);
		upperSubpanel.add(cityPanel);

	}

	private void defineMiddlePanel() {
		middleSubpanel = new JPanel();
		middleSubpanel.setBackground(Color.WHITE);
		middleSubpanel.setLayout(new GridLayout(1, 2));

		JPanel statePanel = new JPanel();
		labelState = new JLabel("State");
		fieldState = new JTextField();

		statePanel.setLayout(new GridBagLayout());
		GridBagConstraints gbcState = new GridBagConstraints();
		gbcState.fill = GridBagConstraints.VERTICAL;

		gbcState.gridx = 0;
		gbcState.gridy = 0;
		gbcState.anchor = GridBagConstraints.NORTHWEST;
		gbcState.insets = new Insets(1, 0, 0, 0);
		statePanel.add(labelState, gbcState);

		gbcState.ipadx = 150;
		gbcState.ipady = 0;
		gbcState.gridx = 0;
		gbcState.gridy = 1;
		statePanel.add(fieldState, gbcState);

		JPanel zipPanel = new JPanel();
		labelZip = new JLabel("Zip");
		fieldZip = new JTextField();

		zipPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbcZip = new GridBagConstraints();
		gbcZip.fill = GridBagConstraints.VERTICAL;

		gbcZip.gridx = 0;
		gbcZip.gridy = 0;
		gbcZip.anchor = GridBagConstraints.NORTHWEST;
		gbcZip.insets = new Insets(1, 0, 0, 0);
		zipPanel.add(labelZip, gbcZip);

		gbcZip.ipadx = 150;
		gbcZip.ipady = 0;
		gbcZip.gridx = 0;
		gbcZip.gridy = 1;
		zipPanel.add(fieldZip, gbcZip);

		middleSubpanel.add(statePanel);
		middleSubpanel.add(zipPanel);

	}

	private void defineLowerPanel() {
		lowerSubpanel = new JPanel();
		lowerSubpanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		class SubmitListener implements ActionListener {
			public void actionPerformed(ActionEvent evt) {
				String name = fieldName.getText();
				String street = fieldStreet.getText();
				String city = fieldCity.getText();
				String state = fieldState.getText();
				String zip = fieldZip.getText();

				System.out.println(name);
				System.out.println(street);
				System.out.println(city + ", " + state + " " + zip);
			}
		}

		SubmitListener sl = new SubmitListener();

		submitButton = new JButton("Submit");
		submitButton.addActionListener(sl);
		lowerSubpanel.add(submitButton);
	}

	AddressForm() {
		initializeWindow();
		defineMainPanel();
		getContentPane().add(mainPanel);
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
