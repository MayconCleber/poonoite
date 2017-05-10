package controledeestoque.model;


public class Produto {
    private int codigo;
    private String descricao;
    private int quantidade;
    private double preco;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    //Métodos para entrada e saída
    public String entrada(int qtd){
        if(qtd > 0){
            this.quantidade += qtd;
            return "Entrada efetuada com sucesso";
        }
        return "Valor inválido";
    }
    
    public String saida(int qtd){
        if((qtd > 0) && (qtd < this.quantidade)){
            this.quantidade -= qtd;
            return "Saída de produto efetuada com sucesso";
        }
        return "Valor inválido ou Saldo insuficiente";
    }
}
