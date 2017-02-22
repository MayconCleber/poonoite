package prjcontas;

public class ContaCorrente {
    public int numConta;
    public String nomeCorrentista;
    public double saldo;
    public static double cpmf;
    
    public void imprimir(){
        System.out.println("Conta: " + numConta);
        System.out.println("Nome: " + nomeCorrentista);
        System.out.println("Saldo: " + saldo);
        System.out.println("CPMF: " + cpmf);
        System.out.println("---------------------------");
    }
}
