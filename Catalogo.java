import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.util.*;

public class Catalogo {
    private ArrayList<Veiculo> veiculos;

    public Catalogo() {
        this.veiculos = new ArrayList<Veiculo>();
    }

    public void addCaminhao(String placa, String ano, String marca, double potencia, TiposCaminhao tipo){
        veiculos.add(new Caminhao(placa, ano, marca, potencia, tipo));
    }

    public void addCarro(String placa, String ano, String marca, double potencia, TiposCarros tipo){
        veiculos.add(new Carro(placa, ano, marca, potencia, tipo));
    }

    public void addMoto(String placa, String ano, String marca, double potencia, TiposMotos tipo){
        veiculos.add(new Moto(placa, ano, marca, potencia, tipo));
    }

    public void carregaDados(String nomeArq) throws IOException {
        Path path = Paths.get(nomeArq);
        File file = new File(nomeArq);
        try (Scanner sc = new Scanner(file,StandardCharsets.UTF_8.name())) {
            sc.useDelimiter("[;\n]");
            String header = sc.nextLine(); 
            String placa,ano,marca,potencia,tipo;
            while (sc.hasNext()) {
                tipo="";
                placa = sc.next();
                ano = sc.next();
                marca = sc.next();
                potencia = sc.next();
                tipo = sc.next();
                tipo.replaceAll(" ","");
                double potenciaDouble = Double.parseDouble(potencia);
          
                switch (tipo) {
                    case "TRESPORQUATRO":
                        addCaminhao(placa,ano,marca,potenciaDouble,TiposCaminhao.TRESPORQUATRO);
                        System.out.println("aaaaaa");
                        break;
                    case "SEMIPESADO":
                        addCaminhao(placa,ano,marca,potenciaDouble,TiposCaminhao.SEMIPESADO);
                        break;
                    case "PESADO":
                        addCaminhao(placa,ano,marca,potenciaDouble,TiposCaminhao.PESADO);
                        break;
                    case "ESPORTIVO":
                        addCarro(placa,ano,marca,potenciaDouble,TiposCarros.ESPORTIVO);
                        break;
                    case "SEDAN":
                        addCarro(placa,ano,marca,potenciaDouble,TiposCarros.SEDAN);
                        break;
                    case "VAN":
                        addCarro(placa,ano,marca,potenciaDouble,TiposCarros.VAN);
                        break;
                    case "STREET":
                        addMoto(placa,ano,marca,potenciaDouble,TiposMotos.STREET);
                        break;
                    case "SCOOTER":
                        addMoto(placa,ano,marca,potenciaDouble,TiposMotos.SCOOTER);
                        break;
                    case "TOURING":
                        addMoto(placa,ano,marca,potenciaDouble,TiposMotos.TOURING);
                        break;
                    default:
                       // System.out.println("Erro");
                        break;
                }
            }
        }
    }

    public void imprimeCarro(){
        for(Veiculo v:veiculos){
            if(v.getTipoVeiculo() == "carro"){
                System.out.println(v);
            }
        }
    }
    public void imprimeMoto(){
        for(Veiculo v:veiculos){
            if(v.getTipoVeiculo() == "moto"){
                System.out.println(v);
            }
        }
    }
    public void imprimeCaminhao(){
        for(Veiculo v:veiculos){
            if(v.getTipoVeiculo() == "caminhao"){
                System.out.println(v);
            }
        }
    }
    public void imprimeTudo(){
        for(Veiculo v:veiculos){
            System.out.println(v);
        }
    }
    

}