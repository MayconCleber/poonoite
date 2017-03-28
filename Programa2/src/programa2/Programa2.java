/*
 * Aulas professor Maromo.
 */
package programa2;

/**
 *
 * @author maromo
 */
public class Programa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Janela j = new Janela();
        j.abre();
        j.fecha();
        j.pinta("Azul");
        j.pinta("Amarelo");
        System.out.println("Cor: " + j.getCor());
        if(j.estaAberta()){
            System.out.println("Janela Aberta");
        }else{
            System.out.println("Janela Fechada");
        }
        
       
        Janela outroJ = new Janela();
        Janela feia = new Janela();
        
         Casa casa = new Casa(j, outroJ, feia);
        outroJ.abre();
       
        
        System.out.println("Qtd Abertas: " + casa.quantasJanelasAbertas());
    }
    
}
