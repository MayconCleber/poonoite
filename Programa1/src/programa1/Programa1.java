/*
 * Aulas professor Maromo.
 */
package programa1;

/**
 *
 * @author maromo
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa();
        p.setNome("Chiquinho");
        p.setIdade(22);
        p.fazAniversario();
        p.fazAniversario();
        System.out.println("Idade: ");
        System.out.println(p.getIdade());
    }
    
}
