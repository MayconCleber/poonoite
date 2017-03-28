/*
 * Aulas professor Maromo.
 */
package programa1;

/**
 *
 * @author maromo
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void fazAniversario(){
        idade++;
    }
}
