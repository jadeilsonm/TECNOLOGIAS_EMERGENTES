package view;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.ContatoDao;
import model.Contato;

public class Principal {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		
		Contato contato = new Contato();
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date data = formato.parse("23/01/200");

		contato.setNome("Vitoria");
		contato.setTelefone("8199991111");
		contato.setData_nascimento(data);
		contato.setIdade("20");
		
		ContatoDao.inserir(contato);
	}

}
