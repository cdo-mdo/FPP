package sample;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.Charset;
import java.nio.charset.*;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleL10n extends JFrame {
	//Internationalized fields
	JButton englishButton;
	JButton chineseButton;
	JPanel mainPanel;
	Locale currentLocale = this.getLocale();
	ResourceBundle strings = ResourceBundle.getBundle("sample.resources.strings", currentLocale);
	public SimpleL10n() {
		setTitle(strings.getString("title"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centerFrameOnDesktop(this);
		setSize(240,80);
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		englishButton = new JButton();
		chineseButton = new JButton();
		englishButton.setText(strings.getString("English"));
		chineseButton.setText(strings.getString("Chinese"));
		englishButton.addActionListener(new EnglishButnListener());
		chineseButton.addActionListener(new ChineseButnListener());
		mainPanel.add(englishButton);
		mainPanel.add(chineseButton);
		getContentPane().add(mainPanel);
		//pack();
		
	}
	
	
	public void setCurrentLocale(Locale locale) {
		currentLocale = locale;
		strings = ResourceBundle.getBundle("sample.resources.strings", currentLocale);
		updateDisplay();
	}
	
	public void updateDisplay() {
		chineseButton.setText(strings.getString("Chinese"));
		englishButton.setText(strings.getString("English"));
		setTitle(strings.getString("title"));
		//repaint();
	}
	
	
	class ChineseButnListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			setCurrentLocale(Locale.CHINESE);
			updateDisplay();
			validate();
		}
	}
	class EnglishButnListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			setCurrentLocale(Locale.ENGLISH);
			updateDisplay();
			validate();
		}
	}
	
	public static void centerFrameOnDesktop(Component f) {
        final int SHIFT_AMOUNT = 0;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width  = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth  = f.getSize().width;
        f.setLocation(((width-frameWidth)/2)-SHIFT_AMOUNT, (height-frameHeight)/3);    
    }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				SimpleL10n sl = new SimpleL10n();
				sl.setVisible(true);
			}
		});
	}
}
