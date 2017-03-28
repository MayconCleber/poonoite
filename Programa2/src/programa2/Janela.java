package programa2;

public class Janela {
    private boolean aberta;
    private String cor;
    private int dimX;
    private int dimY;
    private int dimZ;

    public String getCor() {
        return cor;
    }
    public int getDimX() {
        return dimX;
    }
    public void setDimX(int dimX) {
        this.dimX = dimX;
    }
    public int getDimY() {
        return dimY;
    }
    public void setDimY(int dimY) {
        this.dimY = dimY;
    }
    public int getDimZ() {
        return dimZ;
    }

    public void setDimZ(int dimZ) {
        this.dimZ = dimZ;
    }
    
    public void abre(){
        aberta  = true;
    }
    public void fecha(){
        aberta = false;
    }
    public boolean estaAberta(){
        return aberta;
    }
    public void pinta(String cor){
        this.cor = cor;
    }
}
