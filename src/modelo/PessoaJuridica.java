package modelo;

import javax.persistence.*;

@Entity
@Table(name = "pessoasjuridicas")
@PrimaryKeyJoinColumn(name = "id")

public class PessoaJuridica extends Pessoa{
	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private long cnpj;
	
	@Column(name = "nome_fantasia", length = 255)
	private String nomeFantasia;
	
	public PessoaJuridica(String nomePessoa, String enderecoPessoa, long cepPessoa, String telefonePessoa,
			double rendaPessoa, long cnpj, String nomeFantasia) {
		super(nomePessoa, enderecoPessoa, cepPessoa, telefonePessoa, rendaPessoa);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	
	public long getCnpj() {
		return cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
}
