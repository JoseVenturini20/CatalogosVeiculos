public class Moto implements Veiculo{
    private String placa;
    private String ano;
    private Double potencia;
    private String marca;
    private TiposMotos tipo;

    public Moto(String placa, String ano,  String marca,Double potencia,  TiposMotos tipo) {
        this.placa = placa;
        this.ano = ano;
        this.potencia = potencia;
        this.marca = marca;
        this.tipo = tipo;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public String getAno() {
        return this.ano;
    }

    @Override
    public double getPotencia() {
        return this.potencia;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    public TiposMotos getTipo() {
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