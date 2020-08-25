import java.io.IOException;
public class App{
    public static void main(String args[]){
        Catalogo c = new Catalogo();
        try {
			c.carregaDados("Veiculos.txt");
		} catch (IOException e) {
			  System.out.println("Não foi possível ler veiculos.dat!");
		}
        c.imprime();
    }

}