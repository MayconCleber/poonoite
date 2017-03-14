package prjfuncionarios;

import java.util.Scanner;

public class PrincipalFuncionarios {

    private final int T;
    private Funcionario[] funcionarios;
    private int indice;
    
     public PrincipalFuncionarios() {
        this.T = 10;
        this.funcionarios = new Funcionario[T];
        this.indice = 0;
    }
    
    
    public static void main(String[] args) {
        int opc=0;
        Scanner sc = new Scanner(System.in);
        PrincipalFuncionarios emp = new PrincipalFuncionarios();
        while(opc!=4){
            System.out.println("Menu");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Bonificar");
            System.out.println("");
            System.out.println("4. FIM");
            System.out.println("");
            System.out.println("OPÇÃO: ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:
                    emp.execCadastro();
                    break;
                case 2:
                    emp.execConsulta();
                    break;
                case 3:
                    emp.execBonificacao();
                    break;
                case 4:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        }
       
    }
    public void execBonificacao(){
    Scanner sc = new Scanner(System.in);
        //Optou-se pela busca pelo RG
        System.out.println("Digite o RG a Ser procurado");
        String rgProc = sc.nextLine();
        for (Funcionario funcionario : funcionarios) {
            if(funcionario!=null){
                if(funcionario.getRg().equals(rgProc)){
                    System.out.println("Funcionário Encontrado");
                    System.out.println("Digite o valor do aumento");
                    double aumento = Double.parseDouble(sc.nextLine());
                    funcionario.bonificar(aumento);
                    System.out.println("Salário aumentado");
                    System.out.println("Salário Atual: " + 
                            funcionario.getSalario());
                }
            }
        }
    }
    public void execCadastro(){
        if(indice<10){
            funcionarios[indice] = new Funcionario();
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome: ");
            funcionarios[indice].setNome(sc.nextLine());
            System.out.println("Digite o departamento: ");
            funcionarios[indice].setDepartamento(sc.nextLine());
            System.out.println("Digite o RG: ");
            funcionarios[indice].setRg(sc.nextLine());
            System.out.println("Digite o salario: ");
            double salario = Double.parseDouble(sc.nextLine());
            funcionarios[indice].setSalario(salario);
            funcionarios[indice].setEstaNaEmpresa(true);
            indice++;
            System.out.println("Funcionario Cadastrado com sucesso");
        }else{
            System.out.println("Não há mais espaço no vetor");
        }
    }
    public void execConsulta(){
        Scanner sc = new Scanner(System.in);
        //Optou-se pela busca pelo RG
        System.out.println("Digite o RG a Ser procurado");
        String rgProc = sc.nextLine();
        for (Funcionario funcionario : funcionarios) {
            if(funcionario!=null){
                if(funcionario.getRg().equals(rgProc)){
                    funcionario.imprimir();
                    return;
                }
            }
        }
    }

   
}
