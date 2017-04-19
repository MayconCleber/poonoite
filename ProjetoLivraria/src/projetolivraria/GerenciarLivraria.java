/*
 * Aulas professor Maromo.
 */
package projetolivraria;

/**
 *
 * @author maromo
 */
public class GerenciarLivraria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livro l1 = new Livro();
        l1.setDescricao("Código da Vinci");
        l1.setAutor("Dan Brown");
        l1.setEditora("Editora Doidona");
        l1.setGenero("Drama");
        l1.setPrecoCusto(121.00);
        l1.setEstoqueDisponivel(1000);
        System.out.println(l1.toString());
        Dvd d1 = new Dvd();
        d1.setDescricao("A volta do ze colmeia");
        d1.setCensura("Livre");
        d1.setDiretor("Salsicha");
        d1.setEstoqueDisponivel(1000);
        d1.setPrecoCusto(52.00);
        System.out.println(d1.toString());
        System.out.println("");
        //Gerenciar o estoque
        GerenciarEstoque ge = new GerenciarEstoque();
        ge.efetuarCompra(l1, 50);
        ge.efetuarCompra(d1, 100);
        boolean tem = ge.efetuarVenda(l1, 2000);
        if(!tem) System.out.println("Não Vendeu");
        ge.sumarizar(d1);
        ge.sumarizar(l1);
        System.out.println("Total do Inventário: ");
        System.out.println(ge.getTotalInventario());
        
        
    }
    
}
