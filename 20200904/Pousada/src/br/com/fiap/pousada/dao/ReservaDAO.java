package br.com.fiap.pousada.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.pousada.domain.Quarto;
import br.com.fiap.pousada.domain.Reserva;

public class ReservaDAO {
	
private Connection conn;
	
	private void conecta() throws ClassNotFoundException, SQLException {
		this.conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
	}
	
	public List<Reserva> consultaTodas() throws ClassNotFoundException, SQLException {
		List<Reserva> reservas = new ArrayList<>();
		this.conecta();
		
		String sql = "select * from tb_reserva";
		PreparedStatement stmt = this.conn.prepareStatement(sql);
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			Long id = rs.getLong("id");
			Integer numeroQuarto = rs.getInt("id_quarto");
			LocalDate dataEntrada = rs.getDate("data_entrada").toLocalDate();
			LocalDate dataSaida = rs.getDate("data_saida").toLocalDate();
			Integer qtdePessoas = rs.getInt("qtde_pessoas");
			
			Quarto quarto = new QuartoDAO().consultaPorNumero(numeroQuarto);
			
			reservas.add(new Reserva(id, quarto, dataEntrada, dataSaida, qtdePessoas));
		}
		
		
		this.desconecta();		
		return reservas;
	}
	
	public Reserva salva(Reserva reserva) throws ClassNotFoundException, SQLException {
		this.conecta();
		
		String sql = "select sq_reserva.nextval as id from dual";
		PreparedStatement stmt = this.conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		Long id = null;
		if(rs.next()) id = rs.getLong("id");
		
		if(id == null) throw new SQLException("N�o foi poss�vel gerar um identificador de reserva");
		
		reserva.setId(id);
		
		sql = "insert into tb_reserva(id, id_quarto, data_entrada, data_saida, qtde_pessoas)"
				+ "values(?, ?, ?, ?, ?)";
		stmt = this.conn.prepareStatement(sql);
		
		stmt.setLong(1, reserva.getId());
		stmt.setInt(2, reserva.getQuarto().getNumero());
		stmt.setDate(3, Date.valueOf(reserva.getDataEntrada()));
		stmt.setDate(4, Date.valueOf(reserva.getDataSaida()));
		stmt.setInt(5, reserva.getQtdePessoas());
		
		stmt.executeUpdate();
		
		this.desconecta();
		
		return reserva;
	}
	
	private void desconecta() throws SQLException {
		if(!conn.isClosed()) conn.close();
	}

}
