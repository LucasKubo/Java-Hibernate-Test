package program;

import java.sql.Date;

import modelo.PessoaFisica;
import modelo.repositorio.Repositorio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica pf = new PessoaFisica("Lucas","Brazil",1823849,"(11) 90000-1111",20000,1928375241,new Date(2002-1900,01,30));
		Repositorio<PessoaFisica> repoPF = new Repositorio<PessoaFisica>();
		repoPF.criar(pf);
	}

}
