package prjscanner;

import java.util.Scanner;


public class ScannerTeste {


    public static void main(String[] args) {
        int valor1, valor2;
        String sexo;
        //Utilizando a classe Scanner para leitura
        //Pacote java.util
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite valor 1:");
        valor1 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite m (masc) f (fem): ");
        sexo = sc.nextLine();
        System.out.println("Digite valor 2: ");
        valor2 = Integer.parseInt(sc.nextLine());
        int soma = valor1 + valor2;
        System.out.println("Soma: " + soma);
        System.out.println("Sexo: " + sexo);
    }
    
}
