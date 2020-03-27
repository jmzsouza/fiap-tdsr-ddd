import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a placa do ve�culo: ");
		String placa = scan.nextLine();
		
		System.out.println("Informe a marca do ve�culo: ");
		String marca = scan.nextLine();
		
		System.out.println("Informe o modelo do ve�culo: ");
		String modelo = scan.nextLine();
		
		Veiculo veiculo = new Veiculo(placa, marca, modelo);
		
		// mesmo com o scanner o m�todo set define os valores
		veiculo.setMarca("Lamborghini");
		veiculo.setModelo("Hurac�n");
		veiculo.setPlaca("XXX-9999");
		
		System.out.printf("Veiculo %s %s com placa %s\n", veiculo.getMarca(), veiculo.getModelo(), veiculo.getPlaca());
		
		scan.close();
	}

}
