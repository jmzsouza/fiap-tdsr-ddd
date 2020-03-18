import java.util.Scanner;

class App {
    public static void main(String[] args) {
        //Criando o objeto Calculadora
        Calculadora calc = new Calculadora();
        Scanner entrada = new Scanner(System.in);
        
        //Atribuindo valores a Calculadora
        System.out.print("Digite um número: ");
        calc.a = entrada.nextInt();
        System.out.print("Digite outro número: ");
        calc.b = entrada.nextInt();

        //Executar a soma
        calc.soma();

        //Executar a multiplicaao
        int resultado = calc.multiplicacao();
        System.out.println("A multiplicacao foi " + resultado);

        //Executar a subtracao
        calc.subtracao(84,42);

        //Executar a divisao
        resultado = calc.divisao(50,5);
        System.out.println("A divisao foi " + resultado);
        
    }
}