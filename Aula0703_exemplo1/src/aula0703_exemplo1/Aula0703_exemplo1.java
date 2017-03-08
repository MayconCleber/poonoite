package aula0703_exemplo1;

import java.util.Arrays;

public class Aula0703_exemplo1 {

    public static void main(String[] args) {
        int valores[] = new int[10];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = i + 1;
        }
        for (int boladavez : valores) {
            System.out.println(boladavez);
        }
        int valores2[] = new int[10];
        System.arraycopy(valores, 3, valores2, 6, 4);
        for (int w : valores2) {
            System.out.println(w);
        }
        int[] valores3 = new int[20];
        Arrays.fill(valores3, 37);
        System.out.println("Vetor valores 3");
        for (int w : valores3) {
            System.out.println(w);
        }
        Aluno lista[] = new Aluno[5];
        lista[0] = new Aluno();
        lista[0].ra = 111;
        lista[0].nome = "Chico";
        lista[0].email = "email@email.com";
        lista[1] = new Aluno();
        lista[1].ra = 222;
        lista[1].nome = "Carlos";
        lista[1].email = "carlos@email.com";

        for (Aluno aluno : lista) {
            if (aluno != null) {
                aluno.imprimir();
            } else {
                break;
            }
        }

    }

}
