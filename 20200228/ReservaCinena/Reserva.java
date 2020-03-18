class Reserva{
	public static void main(String[] args) {
		Sala sala = new Sala();
		sala.capacidade = 40;
		sala.lugaresOcupados = 20;

		Cinema cine = new Cinema();
		cine.preco = 20.50;
		cine.sala = sala;

		System.out.println(cine.sala.lugaresOcupados);
		
	}
}