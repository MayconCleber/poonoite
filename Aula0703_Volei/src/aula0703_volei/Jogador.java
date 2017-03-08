package aula0703_volei;

public class Jogador {
    private int numero;
    private String nome;
    private String posicao;

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    
    public String listarJogadores(){
        StringBuilder sb = new StringBuilder();
        sb.append("Numero: ").append(numero);
        sb.append("\n");
        sb.append("Nome: ").append(nome);
        sb.append("\n");
        sb.append("Posicao: ").append(posicao);
        sb.append("\n");
        return sb.toString();
    }
}
