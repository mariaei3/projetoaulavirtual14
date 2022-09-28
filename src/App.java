import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o seu rendimento de hoje (peso dos peixes) : ");
        double pesopeixe = sc.nextDouble();

        double pesomaximo = pesopeixe - 50;
        double multa = pesomaximo * 4;

        System.out.println("Limite diario execido : " + pesomaximo);

        System.out.println("O valor da multa é: " + multa);

    }
}
