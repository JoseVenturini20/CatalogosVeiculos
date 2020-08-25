import java.io.IOException;
import java.util.Scanner;
public class App{
    public static void main(String args[]){
        Catalogo c = new Catalogo();
        try {
			c.carregaDados("Veiculos.txt");
		} catch (IOException e) {
			  System.out.println("Não foi possível ler veiculos.dat!");
        }
        System.out.println("Digite: ");
        System.out.println("1: Carro");
        System.out.println("2: Moto ");
        System.out.println("3: Caminhão ");
        System.out.println("outro numero: Todos ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 1){
            c.imprimeCarro();
        }else if(n == 2){
            c.imprimeMoto();
        }else if(n == 3){
            c.imprimeCaminhao();
        }else{
            c.imprimeTudo();
        }
    }

}