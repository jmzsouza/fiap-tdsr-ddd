import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		        //Criando o objeto Pessoa
		        Pessoa ps = new Pessoa();
		        Scanner entrada = new Scanner(System.in);

		        //Atribuindo valores ao Pessoa
		        System.out.print("Digite seu nome: ");
		        ps.nome = entrada.next();
		        System.out.print("Digite seu rg: ");
		        ps.rg = entrada.next();		        
		        System.out.print("Digite seu cpf: ");
		        ps.cpf = entrada.nextInt();
		        System.out.print("Digite seu endereco: ");
		        ps.endereco = entrada.next();
		        System.out.print("Digite sua data de nascimento: ");
		        ps.dataNascimento = entrada.next();		                
		        
		        //Atribuindo valores a ContaCorrente
				ContaCorrente cc = new ContaCorrente();
				cc.numero = 9999;
				cc.numero = 55555;
				cc.saldo = 10000.00;
				cc.cliente = ps;
				
		        //Executar exibeDadosCadastrais
		        ps.exibeDadosCadastrais();
		        
		        //Executar informeEndereco
		        ps.informeEndereco();
		        System.out.printf("Endereco: %s%n", cc.cliente.endereco);		        
		        	
		        //Executar getSaldo
		        cc.getSaldo();
		        System.out.printf("Saldo: %.2f%n%n", cc.saldo);
		        
		        
		        System.out.print("Digite um valor de saque: ");
		        double saque = entrada.nextDouble();
		        
		        //Executar setSaque
		        double resultado = cc.setSaque(saque);
		        System.out.printf("Seu saldo atual com o saque: %.2f%n%n", resultado);
		        
		        System.out.print("Digite um valor para depósito: ");		        
		        double deposito = entrada.nextDouble();		        
		        
		        //Executar setDeposito
		        resultado = cc.setDeposito(deposito);
		        System.out.printf("Seu saldo atual com o deposito: %.2f%n", resultado);		        
		        
		        //Executar exibeDadosConta
		        cc.exibeDadosConta();
		        
		        entrada.close();
		    }                                     

}