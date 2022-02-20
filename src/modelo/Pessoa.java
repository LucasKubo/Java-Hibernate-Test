package modelo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "pessoas")
@Inheritance(strategy= InheritanceType.JOINED) //Indica a herança e qual será a estratégia utilizada
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Indica a geração automática do Id
	protected int id;
	
	@Column(length = 255, nullable = false)
	protected String nomePessoa;
	
	@Column(length = 255)
	protected String enderecoPessoa;

	protected long cepPessoa;
	
	@Column(length = 19) // +55 (11) 91111-1111
	protected String telefonePessoa;
	
	protected double rendaPessoa;
	
	protected byte situacaoPessoa;
	
	@ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY) //Define o relacionamento entre as tabelas (n:n), cascade-> cascata quando a tupla é excluída, fetch -> Quando fz uma consulta, não faz consulta de cada contaComum associada ao retorno da consulta
	protected Collection<ContaComum> contas;
	
	public Pessoa() {
		this.situacaoPessoa = 0;
	}
	
	public Pessoa(String nomePessoa, String enderecoPessoa, long cepPessoa, String telefonePessoa,
			double rendaPessoa) {
	
		this.nomePessoa = nomePessoa;
		this.enderecoPessoa = enderecoPessoa;
		this.cepPessoa = cepPessoa;
		this.telefonePessoa = telefonePessoa;
		this.rendaPessoa = rendaPessoa;
		this.situacaoPessoa = 0;
	}

	public int getIdPessoa() {
		return id;
	}

	public void setIdPessoa(int idPessoa) {
		this.id = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getEnderecoPessoa() {
		return enderecoPessoa;
	}

	public void setEnderecoPessoa(String enderecoPessoa) {
		this.enderecoPessoa = enderecoPessoa;
	}

	public long getCepPessoa() {
		return cepPessoa;
	}

	public void setCepPessoa(long cepPessoa) {
		this.cepPessoa = cepPessoa;
	}

	public String getTelefonePessoa() {
		return telefonePessoa;
	}

	public void setTelefonePessoa(String telefonePessoa) {
		this.telefonePessoa = telefonePessoa;
	}

	public double getRendaPessoa() {
		return rendaPessoa;
	}

	public void setRendaPessoa(double rendaPessoa) {
		this.rendaPessoa = rendaPessoa;
	}

	public byte getSituacaoPessoa() {
		return situacaoPessoa;
	}

	public void setSituacaoPessoa(byte situacaoPessoa) {
		this.situacaoPessoa = situacaoPessoa;
	}
}
