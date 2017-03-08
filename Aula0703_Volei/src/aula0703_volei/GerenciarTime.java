package aula0703_volei;

import java.util.Scanner;

public class GerenciarTime {

    public Jogador[] jogadores;
    public int posicao; //para controlar cadastros

    //Método construtor
    public GerenciarTime() {
        this.jogadores = new Jogador[5];
        this.posicao = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        GerenciarTime gt = new GerenciarTime();
        while (opc != 9) {
            System.out.println("Menu");
            System.out.println("1.. Cadastrar Jogador");
            System.out.println("2.. Localizar Jogador");
            System.out.println("3.. Listar Jogadores");
            System.out.println("9.. FIM");
            System.out.println("Escolha sua opcao: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    gt.execCadastrar();
                    break;
                case 2:
                    gt.execProcurar();
                    break;
                case 3:
                    gt.execListarTime();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    public void execCadastrar() {
        if (posicao < 5) {
            Scanner sc = new Scanner(System.in);
            this.jogadores[posicao] = new Jogador();
            System.out.println("Digite o numero: ");
            int numero = Integer.parseInt(sc.nextLine());
            this.jogadores[posicao].setNumero(numero);
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            this.jogadores[posicao].setNome(nome);
            System.out.println("Digite a posicao do jogador: ");
            String pos = sc.nextLine();
            this.jogadores[posicao].setPosicao(pos);
            this.posicao++;
        } else {
            System.out.println("Não há espaço para cadastrar");
        }
    }

    public void execProcurar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero do jogador a procurar:");
        int proc = Integer.parseInt(sc.nextLine());
        for (Jogador item : jogadores) {
            if (item != null) {
                if (item.getNumero() == proc) {
                    System.out.println(item.listarJogadores());
                    return;
                }
            }
        }
    }

    public void execListarTime() {
        for (Jogador item : jogadores) {
            if (item != null) {
                System.out.println(item.listarJogadores());
                System.out.println("--------------------");
            }
        }
    }

}
