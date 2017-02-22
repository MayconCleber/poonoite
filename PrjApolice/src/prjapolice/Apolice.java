package prjapolice;

public class Apolice {
    //Atributos
    private String nomeSegurado;
    private int idade;
    private float valorPremio;
    
    /**
     * Método imprimir() - método responsável por fazer a impressão dos dados
     */
    public void imprimir(){
        System.out.println("Nome: " + getNomeSegurado());
        System.out.println("Idade: " + getIdade());
        System.out.println("Valor do Premio: " + getValorPremio());
    }

    /**
     * Método que retorna o nome do segurado da apólice
     * @return nomeSegurado (atributo nome do segurado)
     */
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
