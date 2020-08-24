import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Veiculo> veiculos;

    public Catalogo() {
        this.veiculos = new ArrayList<Veiculo>();
    }

    public void addCaminhao(String placa, String ano, String marca, double potencia, TiposCaminhao tipo){
        veiculos.add(new Caminhao(placa, ano, marca, potencia, tipo));
    }
}