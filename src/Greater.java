import javax.swing.JOptionPane;

public class Greater {// This recipe says "hi" to the user
	//
	// 1. Create a class called Greeter
	// 2. Add a main method
	// 3. Use JOptionPane.showInputDialog to ask them their name, e.g. What is your name?
	// HINT: Use a variable to store their name
	// 4. Use JOptionPane.showMessageDialog to say hi to them, e.g. Hi Jackie
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println(name);
		JOptionPane.showMessageDialog(null, "Hello " + name + ".");
	}

}
