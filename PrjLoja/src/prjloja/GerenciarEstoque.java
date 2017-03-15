/*
 * Aulas professor Maromo.
 */
package prjloja;

/**
 *
 * @author maromo
 */
public class GerenciarEstoque {
/**
 * 
 * @param eq Equipamento a ser comprado
 * @param qtd Quantidade a ser comprada
 */
    public void comprar(Equipamento eq, int qtd) {
        eq.setQuantidade(eq.getQuantidade() + qtd);
        System.out.println("Quantidade em estoque atualizada");
        System.out.println("Total disponível: " + eq.getQuantidade());
    }
/**
 * 
 * @param eq Equipamento a ser vendido
 * @param qtd  Quantidade a ser vendida
 */
    public void vender(Equipamento eq, int qtd) {
        if (qtd <= eq.getQuantidade()) {
            eq.setQuantidade(eq.getQuantidade() - qtd);
            System.out.println("Quantidade em estoque atualizada");
            System.out.println("Total disponível: " + eq.getQuantidade());
        }else{
            System.out.println("Não possui quantidade suficiente");
        }
    }
/**
 * 
 * @param eq Equipamento a ser exibido.
 */
    public void mostrarEstoque(Equipamento eq) {
        System.out.println("Total em Estoque do Produto: " + eq.getDescricao());
        System.out.println("Quantidade: " + eq.getQuantidade());
        System.out.println("Preço Unitáiro: " + eq.getValor());
        System.out.println("Total Inventariado do item: " + eq.getValor() * eq.getQuantidade());
        System.out.println("------------------------------------------------------------------");
    }
    /**
     * 
     * @param equips Vetor equipamentos
     * 
     * @return o Valor do inventário total
     */
    public double inventario(Equipamento[] equips){
        double total=0.0;
        for (Equipamento item : equips) {
            if(item!=null){
                total+= item.getQuantidade() * item.getValor();
            }
        }
        return total;
    }
}
