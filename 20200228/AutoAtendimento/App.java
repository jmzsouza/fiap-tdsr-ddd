class App {
	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.name = "Jorge";
		cli.cpf = 1254152;
		cli.rg = "141568x";
		cli.address = "Av. Lins de Vasconcelos, 1222";

		ContaCorrente cc = new ContaCorrente();
		cc.agency = 1234;
		cc.number = 123456;
		cc.saldo = 1200000.55;
		cc.cliente = cli;

		System.out.println(cc.cliente.name);
	}
}