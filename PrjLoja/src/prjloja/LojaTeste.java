/*
 * Aulas professor Maromo.
 */
package prjloja;

import java.util.Scanner;

/**
 *
 * @author maromo
 */
public class LojaTeste {

    private final Equipamento equipamentos[];
    private int indice;

    public LojaTeste() {
        this.equipamentos = new Equipamento[4];
        this.indice = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LojaTeste loja = new LojaTeste();
        int opc = 0;
        while (opc != 4) {
            System.out.println("MENU");
            System.out.println("1. Cadastrar equipamento");
            System.out.println("2. Consultar equipamento");
            System.out.println("3. Gerenciar estoque");
            System.out.println("4.. FIM");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    loja.execCadastro();
                    break;
                case 2:
                    loja.execConsulta();
                    break;
                case 3:
                    loja.execGerenciamento();
                    break;
                case 4:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }

    public void execCadastro() {
        if (indice < 4) {
            equipamentos[indice] = new Equipamento();
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o Id: ");
            equipamentos[indice].setEquipamentoId(Integer.parseInt(sc.nextLine()));
            System.out.println("Digite a descrição: ");
            equipamentos[indice].setDescricao(sc.nextLine());
            System.out.println("Digite a Quantidade em estoque: ");
            equipamentos[indice].setQuantidade(Integer.parseInt(sc.nextLine()));
            System.out.println("Digite o preco: ");
            equipamentos[indice].setValor(Double.parseDouble(sc.nextLine()));
            indice++;
            System.out.println("Cadastro efetuado com sucesso...");
        } else {
            System.out.println("Sem posição para cadastro");
        }
    }

    public void execConsulta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Id a ser encontrado:  ");
        int idProc = Integer.parseInt(sc.nextLine());
        for (Equipamento equipamento : equipamentos) {
            if (equipamento != null) {
                if (equipamento.getEquipamentoId() == idProc) {
                    System.out.println(equipamento.listarProduto());
                    return;
                }
            }
        }
    }

    public void execGerenciamento() {
        GerenciarEstoque ge = new GerenciarEstoque();
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        while (escolha != 5) {
            System.out.println("Gerenciar o Estoque");
            System.out.println("1.. Comprar");
            System.out.println("2.. Vender");
            System.out.println("3.. Mostrar estoque do produto");
            System.out.println("4.. Mostrar inventário");
            System.out.println("5.. Sair");
            escolha = Integer.parseInt(sc.nextLine());
            switch (escolha) {
                case 1:
                    System.out.println("Digite o id do Produto a comprar.. ");
                    int idProc = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite a quantidade a comprar.. ");
                    int quantidade = Integer.parseInt(sc.nextLine());
                    for (Equipamento equipamento : equipamentos) {
                        if (equipamento.getEquipamentoId() == idProc) {
                            ge.comprar(equipamento, quantidade);
                            return;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Digite o id do Produto a vender.. ");
                    idProc = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite a quantidade a comprar.. ");
                    quantidade = Integer.parseInt(sc.nextLine());
                    for (Equipamento equipamento : equipamentos) {
                        if (equipamento.getEquipamentoId() == idProc) {
                            ge.vender(equipamento, quantidade);
                            return;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o id do Produto a exibir Saldo.. ");
                    idProc = Integer.parseInt(sc.nextLine());

                    for (Equipamento equipamento : equipamentos) {
                        if (equipamento.getEquipamentoId() == idProc) {
                            ge.mostrarEstoque(equipamento);
                            return;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saída");
                    break;
                case 4:
                    System.out.println("Mostrando o Inventário de Todos os produtos");
                    System.out.println("Inventário Geral: " + ge.inventario(equipamentos));
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }

}
