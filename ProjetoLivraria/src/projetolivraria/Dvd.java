/*
 * Aulas professor Maromo.
 */
package projetolivraria;

/**
 *
 * @author maromo
 */
public class Dvd extends Produto {
    private String diretor;
    private String duracao;
    private String censura;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Diretor: ").append(diretor).append("\n");
        sb.append("Duração: ").append(duracao).append("\n");
        sb.append("Censura: ").append(censura).append("\n");
        return sb.toString();
    }
    
}
