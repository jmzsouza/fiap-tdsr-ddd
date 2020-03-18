class ContaCorrente {
    int agencia;
    int numero;
    double saldo;
    Pessoa cliente;
    
    
    double getSaldo() {
    	return saldo;
    }    

    double setSaque(double valor){

        //tres maneiras de atualizar o valor
        //double saldoAtualizado = saldo - valor;
        //saldo = saldoAtualizado;
        //saldo = saldo - valor;

        saldo -= valor;
        return saldo;
    }

    double setDeposito(double valor){
        saldo += valor;
        return saldo;
    }
    
    void exibeDadosConta() {
    	System.out.printf("Agência: %d%nNúmero: %d%nCliente: %s%n", agencia, numero, cliente.nome);
    }


}