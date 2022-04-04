package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDao {
	
	public static void inserir(model.Contato contato)  throws ClassNotFoundException, SQLException  {
		// Conexao com banco
		Connection connection = ConexaoMySQL.getConexaoMySQL();
		String sql = "INSERT INTO `tb_contatos`"
				+ "(`id`,`nome`,`telefone`, `data_nascimento`, `idade`) "
				+ "VALUES (?,?,?,?,?)";
		
		// PREPARANDO AS DECLADAÇÕES
		PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		
		stmt.setInt(1, contato.getId());
		stmt.setString(2, contato.getNome());
		stmt.setString(3, contato.getTelefone());
		stmt.setDate(4, new Date (contato.getData_nascimento().getTime()));
		stmt.setString(5, contato.getIdade());
		
		// Execute e close
		stmt.execute();
		stmt.close();
		connection.close();
	}

}
