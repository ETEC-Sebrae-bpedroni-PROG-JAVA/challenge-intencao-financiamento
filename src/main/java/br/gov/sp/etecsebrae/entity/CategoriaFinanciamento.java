package br.gov.sp.etecsebrae.entity;

public enum CategoriaFinanciamento {
	IMOBILIARIO("Imobiliário"), AUTO("Auto");

	public String valor;

	CategoriaFinanciamento(String valor) {
		this.valor = valor;
	}
    
    public String getCategoriaFinanciamento() {
        return valor;
    }
}
