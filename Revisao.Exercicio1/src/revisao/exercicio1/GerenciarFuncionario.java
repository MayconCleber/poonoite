package revisao.exercicio1;

import java.util.Scanner;


public class GerenciarFuncionario {
    public int posicao = 0;
    public final int TAM = 3;
    
    public static void main(String[] args) {
//        Funcionario func = new Funcionario();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite o id: ");
//        func.setIdFunc(Integer.parseInt(sc.nextLine()));
//        System.out.println("Nome do Func: ");
//        func.setNomeFunc(sc.nextLine());
//        System.out.println("Digite Salario : ");
//        func.setSalario(Double.parseDouble(sc.nextLine()));
//        func.atualizaSalario(100.0);
//        func.imprimir();
//        func.demiteFuncionario();
//        System.out.println("");
//        func.imprimir();
          Funcionario f1, f2, f3;
          f1 = new Funcionario();
          f2 = new Funcionario();
          f3 = new Funcionario();
          f1.setIdFunc(1);
          f1.setNomeFunc("Douglas");
          f1.setSalario(3000.0);
          f1.setAtivo(true);
          
          f2.setIdFunc(2);
          f2.setNomeFunc("PC");
          f2.setSalario(15000.0);
          f2.setAtivo(true);
          
          f3.setIdFunc(3);
          f3.setNomeFunc("Sadam");
          f3.setSalario(2000.0);
          f3.setAtivo(true);
          
          //Instaciar a propria classe
          GerenciarFuncionario gf = new GerenciarFuncionario();
          Empresa emp = new Empresa();
          emp.setEmpregado(new Funcionario[gf.TAM]);
          if(gf.posicao<gf.TAM)
            emp.adicionaEmpregado(f1, gf.posicao++);
          if(gf.posicao<gf.TAM)
            emp.adicionaEmpregado(f2, gf.posicao++);
          if(gf.posicao<gf.TAM)
            emp.adicionaEmpregado(f3, gf.posicao++);
          
          boolean t = emp.contemFuncionario(f3);
          if(t) 
              System.out.println("Tem funcionario");
          else
              System.out.println("Nao tem o funcionario");
          
          emp.mostrarEmpregado();
    }
    
}
