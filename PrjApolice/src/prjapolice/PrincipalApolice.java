package prjapolice;

public class PrincipalApolice {

    public static void main(String[] args) {
        //Instanciar um objeto do tipo Apolice
        Apolice apolice = new Apolice();
        //Atribuir valores aos campos (atributos)
        apolice.setNomeSegurado("João Carlos");
        apolice.setIdade(34);
        apolice.setValorPremio(1200.89f);
        //Invocar o método imprimir
        apolice.imprimir();
        
    }
    
}
