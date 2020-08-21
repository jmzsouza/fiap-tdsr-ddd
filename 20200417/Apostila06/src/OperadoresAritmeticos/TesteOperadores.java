package OperadoresAritmeticos;
import javax.swing.JOptionPane;

public class TesteOperadores {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		String operacao = JOptionPane
				.showInputDialog("Digite:\n* para multiplicacao\n+ para adicao\n- para subtracao\n/ para divisao");

		double numA = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero"));
		double numB = Double.parseDouble(JOptionPane.showInputDialog("Informe outro numero inteiro"));

		switch (operacao) {
		case "+":
			JOptionPane.showMessageDialog(null, calc.adicao(numA, numB));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, calc.subtracao(numA, numB));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, calc.multiplicacao(numA, numB));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, calc.divisao(numA, numB));
			break;
		}

	}

}
