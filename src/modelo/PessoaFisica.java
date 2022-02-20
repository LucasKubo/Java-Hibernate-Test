package modelo;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "pessoasfisicas")
@PrimaryKeyJoinColumn(name = "id") //Indica qual a é a coluna que será a FK para a PK da tabela mãe

public class PessoaFisica extends Pessoa{
	
	private static final long serialVersionUID = 1L;
	
	@Column (nullable = false)
	private long cpf;
	
	@Column (name = "data_nascto")
	@Temporal (TemporalType.DATE)
	private Date nascto;
	
	public PessoaFisica() {}

	public PessoaFisica(String nomePessoa, String enderecoPessoa, long cepPessoa, String telefonePessoa,
			double rendaPessoa, long cpf, Date nascto) {
		super(nomePessoa, enderecoPessoa, cepPessoa, telefonePessoa, rendaPessoa);
		this.cpf = cpf;
		this.nascto = nascto;
	}

	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public Date getNascto() {
		return nascto;
	}

	public void setNascto(Date nascto) {
		this.nascto = nascto;
	}
}
