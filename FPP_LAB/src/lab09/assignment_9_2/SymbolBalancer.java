package lab09.assignment_9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = "" + (char) 0;
	String filename;
	String text;
	char[] left;
	char[] right;

	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean symbolsBalanced(String delimiters) {
		// implement
		Stack<Character> stack = new Stack<>();
		String openChars = "{[(<";
		for (int i = 0; i < text.length(); i++) {
			char chr = text.charAt(i);
			if (delimiters.indexOf(chr) == -1) {
				continue;
			}
			
			if (openChars.indexOf(chr) != -1) {
				stack.push(chr);
			}
			else {
				Object obj = stack.pop();
				if (obj == null) {
					return false;
				}
				if (obj.equals('{') && chr != '}' ||
					obj.equals('[') && chr != ']' ||
					obj.equals('(') && chr != ')' ||
					obj.equals('<') && chr != '>' ||
					obj.equals('|') && chr != '|') {
					
					return false;
				}
			}
		}
		
		return stack.isEmpty() ? true: false;

	}

	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("lab09\\assignment_9_2\\Employee.java");
		System.out.println("Check balance for []{}<>()|| " + sb.symbolsBalanced("[]{}<>()||"));
		System.out.println("Check balance for [] " + sb.symbolsBalanced("[]"));
		System.out.println("Check balance for {} " + sb.symbolsBalanced("{}"));
		System.out.println("Check balance for () " + sb.symbolsBalanced("()"));
		System.out.println("Check balance for <> " + sb.symbolsBalanced("<>"));
		System.out.println("Check balance for || " + sb.symbolsBalanced("||"));
	}

	void readFile() {
		String prefix = System.getProperty("user.dir") + "\\src\\";
		try {
			Scanner sc = new Scanner(new File(prefix + filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
//			System.out.println(text);
			sc.close();
		} catch (FileNotFoundException ex) {
			System.err.println("File Not Found Exception " + ex.getMessage());
		}
	}

}
