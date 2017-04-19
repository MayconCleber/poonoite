/*
 * Aulas professor Maromo.
 */
package projetolivraria;

/**
 *
 * @author maromo
 */
public class GerenciarEstoque {
    private double total;
    
    //Construtor para inicializar o total
    public GerenciarEstoque(){
        total = 0.0;
    }
    public double getTotalInventario(){
        return total;
    }
    
    public void sumarizar(Produto p){
        total+= p.getEstoqueDisponivel() * p.getPrecoCusto();
    }
    
    public boolean efetuarVenda(Produto p, int qtd){
        if(p.getEstoqueDisponivel() >= qtd){
            p.setEstoqueDisponivel(p.getEstoqueDisponivel()-qtd);
            return true;
        }
        return false;
    }
    public void efetuarCompra(Produto p, int qtd){
        p.setEstoqueDisponivel(p.getEstoqueDisponivel()+ qtd);
    }
    
}
