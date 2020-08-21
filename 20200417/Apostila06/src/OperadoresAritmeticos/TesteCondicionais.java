package OperadoresAritmeticos;
import javax.swing.JOptionPane;

public class TesteCondicionais {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de b"));
		boolean c = true;
		boolean d = false;

		System.out.println(a + "igual a " + b + " : " + (a == b));
		System.out.println(a + "maior " + b + " : " + (a > b));
		System.out.println(a + "menor " + b + " : " + (a < b));
		System.out.println(c + " && " + d + " = " + (c && d));
		System.out.println(d + " && " + c + " = " + (d && c));
		System.out.println(c + " || " + d + " = " + (c || d));
	}

}
