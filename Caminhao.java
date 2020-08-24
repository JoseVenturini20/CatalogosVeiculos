public class Caminhao implements Veiculo{
    private String placa;
    private String ano;
    private String marca;
    private Double potencia;
    private TiposCaminhao tipo;
	
	public Caminhao(String placa, String ano, String marca, Double potencia, TiposCaminhao tipo) {
		this.placa = placa;
		this.ano = ano;
		this.marca = marca;
		this.potencia = potencia;
		this.tipo = tipo;
	}

    @Override
    public String getPlaca(){
        return this.placa;
    }

    @Override
    public String getAno(){
        return this.ano;
    }

    @Override
    public String getMarca() {
		return this.marca;
    }


    @Override
	public double getPotencia() {
		return this.potencia;
    }

    public TiposCaminhao getTipo(){
        return this.tipo;
    }

    @Override
    public String toString() {
        return "{" +
            " placa='" + getPlaca() + "'" +
            ", ano='" + getAno() + "'" +
            ", potencia='" + getPotencia() + "'" +
            ", marca='" + getMarca() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }
    


}