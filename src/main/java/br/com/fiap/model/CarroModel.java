package br.com.fiap.model;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

public class CarroModel {
	private long id;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private String motor;
	private String combustivel;
	private String cambio;
	private String consumoMedio;
	private double preco;
	private String descricao;

	public CarroModel() {
		super();
	}
	
	public CarroModel(long id, String marca, String modelo, int anoFabricacao, String motor, String combustivel,
			String cambio, String consumoMedio, double preco, String descricao) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.motor = motor;
		this.combustivel = combustivel;
		this.cambio = cambio;
		this.consumoMedio = consumoMedio;
		this.preco = preco;
		this.descricao = descricao;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Size(min = 2, max = 15, message = "Marca deve ter no minímo 2 e 15 caracteres")
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	@Size(min = 2, max = 15, message = "Modelo deve ter no minímo 2 e 15 caracteres")
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@DecimalMin(value = "1903", message = "Ano de fabricação deve ser acima de 1903")
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	@Size(min = 2, max = 10, message = "Motor deve ter no minímo 2 e 10 caracteres")
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	@Size(min = 2, max = 10, message = "Combustível deve ter no minímo 2 e 10 caracteres")
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	@Size(min = 2, max = 10, message = "Câmbio deve ter no minímo 2 e 10 caracteres")
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	
	@Size(min = 2, max = 26, message = "Consumo médio deve ter no minímo 2 e 26 caracteres")
	public String getConsumoMedio() {
		return consumoMedio;
	}
	public void setConsumoMedio(String consumoMedio) {
		this.consumoMedio = consumoMedio;
	}
	
	@DecimalMin(value = "1000.0", message = "Preço deve ser acima de R$1000.0")
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Size(min = 2, max = 1000, message = "Consumo médio deve ter no minímo 2 e 1000 caracteres")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
