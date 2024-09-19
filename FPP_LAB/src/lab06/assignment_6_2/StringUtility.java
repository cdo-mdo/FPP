package lab06.assignment_6_2;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StringUtility extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3403739879141288863L;
	public static int SCREEN_WIDTH = 580;
	public static int SCREEN_HEIGHT = 240;

	private JPanel mainPanel;

	private JPanel leftPanel;
	private JPanel countLetterPanel;
	private JButton countLetterButton;
	private JPanel reverseLetterPanel;
	private JButton reverseLetterButton;
	private JPanel removeDuplicatePanel;
	private JButton removeDuplicateButton;

	private JPanel rightPanel;
	private JLabel inTextLabel;
	private JTextField inTextField;
	private JLabel outTextLabel;
	private JTextField outTextField;

	StringUtility() {
		initializeWindow();
		defineMainPanel();
		getContentPane().add(mainPanel);
	}

	private void initializeWindow() {
		setTitle("String Utility");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		centerFrameOnDesktop(this);
		handleWindowClosing();
	}

	private void defineMainPanel() {
		mainPanel = new JPanel(new GridLayout(1, 2));

		defineLeftPanel();
		defineRightPanel();

		mainPanel.add(leftPanel);
		mainPanel.add(rightPanel);
	}

	private void defineLeftPanel() {
		leftPanel = new JPanel(new GridLayout(3, 1));

		countLetterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 20));
		reverseLetterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 20));
		removeDuplicatePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 20));

		countLetterButton = new JButton("Count Letters         ");
		reverseLetterButton = new JButton("Revese Letters      ");
		removeDuplicateButton = new JButton("Remove Duplicate ");

		class CountLetter implements ActionListener {

			public void actionPerformed(ActionEvent evt) {
				String input = inTextField.getText();

				outTextField.setText(String.valueOf(input.length()));
			}
		}

		CountLetter countLetter = new CountLetter();
		countLetterButton.addActionListener(countLetter);
		countLetterPanel.add(countLetterButton);

		class ReverseLetter implements ActionListener {

			public void actionPerformed(ActionEvent evt) {
				String input = inTextField.getText();
				StringBuilder buffer = new StringBuilder(input);

				outTextField.setText(buffer.reverse().toString());
			}
		}

		ReverseLetter reverseLetter = new ReverseLetter();
		reverseLetterButton.addActionListener(reverseLetter);
		reverseLetterPanel.add(reverseLetterButton);

		class RemoveDuplicateLetter implements ActionListener {

			public void actionPerformed(ActionEvent evt) {
				String input = inTextField.getText();
				Set<Character> nonDuplicateChars = new HashSet<Character>();
				for (int i = 0; i < input.length(); i++) {
					if (!nonDuplicateChars.contains(input.charAt(i))) {
						nonDuplicateChars.add(input.charAt(i));
					}
				}

				StringBuilder buffer = new StringBuilder();
				Object[] arrays = nonDuplicateChars.toArray();
				for (int i = 0; i < arrays.length; i++) {
					buffer.append((Character) arrays[i]);
				}

				outTextField.setText(buffer.toString());
			}
		}

		RemoveDuplicateLetter removeDuplicateLetter = new RemoveDuplicateLetter();
		removeDuplicateButton.addActionListener(removeDuplicateLetter);

		removeDuplicatePanel.add(removeDuplicateButton);

		leftPanel.add(countLetterPanel);
		leftPanel.add(reverseLetterPanel);
		leftPanel.add(removeDuplicatePanel);
	}

	private void defineRightPanel() {
		rightPanel = new JPanel(new GridLayout(4, 1));

		JPanel inLabelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 30));
		JPanel inTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		JPanel outLabelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 30));
		JPanel outTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));

		inTextLabel = new JLabel("Input");
		inTextField = new JTextField();
		inTextField.setPreferredSize(new Dimension(200, 30));
		outTextLabel = new JLabel("Output");
		outTextField = new JTextField();
		outTextField.setPreferredSize(new Dimension(200, 30));

		inLabelPanel.add(inTextLabel);
		inTextPanel.add(inTextField);
		outLabelPanel.add(outTextLabel);
		outTextPanel.add(outTextField);

		rightPanel.add(inLabelPanel);
		rightPanel.add(inTextPanel);
		rightPanel.add(outLabelPanel);
		rightPanel.add(outTextPanel);

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

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				StringUtility su = new StringUtility();
				su.setVisible(true);
			}
		});
	}
}
