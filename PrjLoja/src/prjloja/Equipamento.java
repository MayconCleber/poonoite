package prjloja;

/**
 *
 * @author maromo Classe de Modelagem Equipamento.
 */
public class Equipamento {

    private int equipamentoId;
    private String descricao;
    private int quantidade;
    private double valor;

    public int getEquipamentoId() {
        return equipamentoId;
    }

    public void setEquipamentoId(int equipamentoId) {
        this.equipamentoId = equipamentoId;
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

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     *
     * @return Lista de Todos os Produtos
     */
    public String listarProduto() {
        StringBuilder sb = new StringBuilder();
        sb.append("Detalhes do Produto\n");
        sb.append("Id: ").append(equipamentoId).append("\n");
        sb.append("Descrição: ").append(descricao).append("\n");
        sb.append("Quantidade: ").append(quantidade).append("\n");
        sb.append("Valor: ").append(valor).append("\n");
        return sb.toString();
    }

    /**
     *
     *      * @param valor Valor deve ser informado para alteração.
     */
    public void alterarValor(double valor) {
        this.valor = valor;
    }
}
