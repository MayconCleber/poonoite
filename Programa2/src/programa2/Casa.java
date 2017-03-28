/*
 * Aulas professor Maromo.
 */
package programa2;

/**
 *
 * @author maromo
 */
public class Casa {
    private String cor;
    private Janela janela1;
    private Janela janela2;
    private Janela janela3;

    public Casa(){
        this.janela1 = new Janela();
        this.janela2 = new Janela();
        this.janela3 = new Janela();
    }
    public Casa(Janela j1, Janela j2, Janela j3){
        this.janela1 = j1;
        this.janela2 = j2;
        this.janela3 = j3;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Janela getJanela1() {
        return janela1;
    }

    public void setJanela1(Janela janela1) {
        this.janela1 = janela1;
    }

    public Janela getJanela2() {
        return janela2;
    }

    public void setJanela2(Janela janela2) {
        this.janela2 = janela2;
    }

    public Janela getJanela3() {
        return janela3;
    }

    public void setJanela3(Janela janela3) {
        this.janela3 = janela3;
    }
    
    public void pintaCasa(String cor){
        this.cor = cor;
    }
    public int quantasJanelasAbertas(){
        int total = 0;
        if (this.janela1.estaAberta()) total++;
        if(this.janela2.estaAberta()) total++;
        if(this.janela3.estaAberta()) total++;
        return total;
    }
    
}
