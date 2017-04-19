/*
 * Aulas professor Maromo.
 */
package projetolivraria;

/**
 *
 * @author maromo
 */
public abstract class Produto {
    private String descricao;
    private String genero;
    private int estoqueDisponivel;
    private double precoCusto;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    
    //Sobrescrita do método toString() da classe
    //Object
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Descrição do produto").append("\n");
        sb.append("Desc: ").append(descricao).append("\n");
        sb.append("Gênero: ").append(genero).append("\n");
        sb.append("Preço Custo: ").append(precoCusto).append("\n");
        sb.append("Estoque: ").append(estoqueDisponivel).append("\n");
        return sb.toString();
    }
    //Método com chamada polimórfica.
    
    
}
