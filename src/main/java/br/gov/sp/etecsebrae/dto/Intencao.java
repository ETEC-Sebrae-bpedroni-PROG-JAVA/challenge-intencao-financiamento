package br.gov.sp.etecsebrae.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.gov.sp.etecsebrae.entity.CategoriaFinanciamento;

public class Intencao implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	@NotBlank
	private String nomeCliente;

	@NotBlank
	private String cpf;

	@NotBlank
	private String rg;

	@NotNull
	private Date dataNascimento;

	@NotBlank
	private String email;

	@NotBlank
	private String telefoneResidencial;

	@NotBlank
	private String telefoneCelular;

	@NotBlank
	private String enderecoLogradouro;

	@NotBlank
	private String enderecoNumero;

	@NotBlank
	private String enderecoCidade;

	@NotBlank
	private String enderecoEstado;

	@NotBlank
	private String enderecoCep;

	@NotNull
	private CategoriaFinanciamento categoriaFinanciamento;

	@NotNull
	private int quantidadeParcelamento;

	@NotNull
	private double valorIntencao;

	@NotNull
	private double salario;

	public Intencao() {
		super();
	}

	public Intencao(int id, @NotBlank String nomeCliente, @NotBlank String cpf, @NotBlank String rg,
			@NotNull Date dataNascimento, @NotBlank String email, @NotBlank String telefoneResidencial,
			@NotBlank String telefoneCelular, @NotBlank String enderecoLogradouro, @NotBlank String enderecoNumero,
			@NotBlank String enderecoCidade, @NotBlank String enderecoEstado, @NotBlank String enderecoCep,
			@NotBlank CategoriaFinanciamento categoriaFinanciamento, @NotNull int quantidadeParcelamento,
			@NotNull double valorIntencao, @NotNull double salario) {
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
