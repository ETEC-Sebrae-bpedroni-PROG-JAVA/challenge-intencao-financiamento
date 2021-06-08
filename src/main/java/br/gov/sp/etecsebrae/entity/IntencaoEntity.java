package br.gov.sp.etecsebrae.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_intencoes")
public class IntencaoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nome_cliente", nullable = false)
	private String nomeCliente;

	@Column(nullable = false)
	private String cpf;

	@Column(nullable = false)
	private String rg;

	@Column(name = "data_nascimento", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "tel_residencial", nullable = false)
	private String telefoneResidencial;

	@Column(name = "tel_celular", nullable = false)
	private String telefoneCelular;

	@Column(name = "endereco_lograd", nullable = false)
	private String enderecoLogradouro;

	@Column(name = "endereco_numero", nullable = false)
	private String enderecoNumero;

	@Column(name = "endereco_cidade", nullable = false)
	private String enderecoCidade;

	@Column(name = "endereco_estado", nullable = false)
	private String enderecoEstado;

	@Column(name = "endereco_cep", nullable = false)
	private String enderecoCep;

	@Column(name = "categ_financiamento", nullable = false)
	@Enumerated(EnumType.STRING)
	private CategoriaFinanciamento categoriaFinanciamento;

	@Column(name = "qtd_parcelamento", nullable = false)
	private int quantidadeParcelamento;

	@Column(name = "valor_intencao", nullable = false)
	private double valorIntencao;

	@Column(name = "valor_salario", nullable = false)
	private double salario;

	public IntencaoEntity() {
		super();
	}

	public IntencaoEntity(int id, String nomeCliente, String cpf, String rg, Date dataNascimento, String email,
			String telefoneResidencial, String telefoneCelular, String enderecoLogradouro, String enderecoNumero,
			String enderecoCidade, String enderecoEstado, String enderecoCep,
			CategoriaFinanciamento categoriaFinanciamento, int quantidadeParcelamento, double valorIntencao,
			double salario) {
		super();
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.telefoneResidencial = telefoneResidencial;
		this.telefoneCelular = telefoneCelular;
		this.enderecoLogradouro = enderecoLogradouro;
		this.enderecoNumero = enderecoNumero;
		this.enderecoCidade = enderecoCidade;
		this.enderecoEstado = enderecoEstado;
		this.enderecoCep = enderecoCep;
		this.categoriaFinanciamento = categoriaFinanciamento;
		this.quantidadeParcelamento = quantidadeParcelamento;
		this.valorIntencao = valorIntencao;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getEnderecoLogradouro() {
		return enderecoLogradouro;
	}

	public void setEnderecoLogradouro(String enderecoLogradouro) {
		this.enderecoLogradouro = enderecoLogradouro;
	}

	public String getEnderecoNumero() {
		return enderecoNumero;
	}

	public void setEnderecoNumero(String enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}

	public String getEnderecoCidade() {
		return enderecoCidade;
	}

	public void setEnderecoCidade(String enderecoCidade) {
		this.enderecoCidade = enderecoCidade;
	}

	public String getEnderecoEstado() {
		return enderecoEstado;
	}

	public void setEnderecoEstado(String enderecoEstado) {
		this.enderecoEstado = enderecoEstado;
	}

	public String getEnderecoCep() {
		return enderecoCep;
	}

	public void setEnderecoCep(String enderecoCep) {
		this.enderecoCep = enderecoCep;
	}

	public CategoriaFinanciamento getCategoriaFinanciamento() {
		return categoriaFinanciamento;
	}

	public void setCategoriaFinanciamento(CategoriaFinanciamento categoriaFinanciamento) {
		this.categoriaFinanciamento = categoriaFinanciamento;
	}

	public int getQuantidadeParcelamento() {
		return quantidadeParcelamento;
	}

	public void setQuantidadeParcelamento(int quantidadeParcelamento) {
		this.quantidadeParcelamento = quantidadeParcelamento;
	}

	public double getValorIntencao() {
		return valorIntencao;
	}

	public void setValorIntencao(double valorIntencao) {
		this.valorIntencao = valorIntencao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
