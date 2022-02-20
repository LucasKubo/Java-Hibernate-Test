package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table (name = "contasComuns")
public class ContaComum implements Serializable{
	
	//propriedade que define a versão da classe. Trata possíveis erros devido à alteração da classe e não atualização no Banco de dados
	private static final long serialVersionUID = 1L;
	
	@Id
	protected long numero;
	
	@Column(name = "data_abertura", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	protected Date abertura;
	
	@Column(name = "data_fechamento")
	@Temporal(TemporalType.TIMESTAMP)
	protected String fechamento;
	
	protected byte situacao;
	
	protected int senha;
	
	protected double saldo;
	
	private Random ranNum;
	
	public ContaComum(String fechamento, int senha) {
		this.numero = ranNum.nextLong();
		this.abertura = new Date();
		this.fechamento = fechamento;
		this.situacao = 1;
		this.senha = senha;
		this.saldo = 0;
	}
	
	public ContaComum(String fechamento, int senha, double saldo) {
		this.numero = ranNum.nextLong();
		this.abertura = new Date();
		this.fechamento = fechamento;
		this.situacao = 1;
		this.senha = senha;
		this.saldo = saldo;
	}

	public long getNumero() {
		return numero;
	}

	public Date getAbertura() {
		return abertura;
	}

	public String getFechamento() {
		return fechamento;
	}

	public void setFechamento(String fechamento) {
		this.fechamento = fechamento;
	}

	public byte getSituacao() {
		return situacao;
	}

	public void setSituacao(byte situacao) {
		this.situacao = situacao;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
