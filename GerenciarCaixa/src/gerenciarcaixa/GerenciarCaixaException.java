/*
 * Aulas professor Maromo.
 */
package gerenciarcaixa;

/**
 *
 * @author maromo
 */
public class GerenciarCaixaException extends Exception {
    
    @Override
    public String toString(){
        return "Valor inválido para Saque";
    }
}
