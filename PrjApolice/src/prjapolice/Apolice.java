package prjapolice;

public class Apolice {
    //Atributos
    private String nomeSegurado;
    private int idade;
    private float valorPremio;
    
    public void imprimir(){
        System.out.println("Nome: " + getNomeSegurado());
        System.out.println("Idade: " + getIdade());
        System.out.println("Valor do Premio: " + getValorPremio());
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }
    
    
}
