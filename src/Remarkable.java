import javax.swing.JOptionPane;

public class Remarkable {

	public static void main(String[] args) {
		//1: Write the names of all the students on the white board
String name1 = "Emerson";
String name2 = "Priyankaa";
String name3 = "Sowmya";
String name4 = "Keith";
String name5 = "April";
String qual1 = "reader";
String qual2 = "gymast";
String qual3 = "singer";
String qual4 = "teacher";
String qual5 = "runner";
		//2: Depending on which user types their name, tell them something remarkable about themselves
String name = JOptionPane.showInputDialog("Please write one of the folowing names: Emerson, Priyankaa, Sowmya, Keith, or April");
if (name = name1) {JOptionPane.showMessageDialog(null, "Hi, "+name1+" you are a remarkable "+qual1+".");
}
if (name = name2) {JOptionPane.showMessageDialog(null, "Hi, "+name2+" you are a remarkable "+qual2+".");
}
if (name.equals(name3)) {JOptionPane.showMessageDialog(null, "Hi, "+name3+" you are a remarkable "+qual3+".");
}
if (name.equals(name4) ) {JOptionPane.showMessageDialog(null, "Hi, "+name4+" you are a remarkable "+qual4+".");
}
if (name.equals(name5)) {JOptionPane.showMessageDialog(null, "Hi, "+name5+" you are a remarkable "+qual5+".");
}		//3: Have students walk round and try each other's programs


	}

}
