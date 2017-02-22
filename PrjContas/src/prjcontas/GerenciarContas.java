package prjcontas;


public class GerenciarContas {

 
    public static void main(String[] args) {
        //Definir o valor do atributo estático
        ContaCorrente.cpmf = 0.0038;
       //Definir duas contas
        ContaCorrente c1, c2;
        //Instanciar a primeira conta e atribuir dados
        c1= new ContaCorrente();
        c1.numConta = 1;
        c1.nomeCorrentista = "João";
        c1.saldo = 500;
        c1.imprimir();
        
      
        //Instanciar a segunda conta e atribuir dados
        c2 = new ContaCorrente();
        c2.numConta = 2;
        c2.nomeCorrentista = "Maria";
        c2.saldo = 800;
        c2.imprimir();
        
            
             
    }
    
}
