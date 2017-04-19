/*
 * Aulas professor Maromo.
 */
package projetolivraria;

/**
 *
 * @author maromo
 */
public class Cd extends Produto {
    private String artista;
    private String gravadora;
    private String paisOrigem;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Artista: ").append(artista).append("\n");
        sb.append("Gravadora: ").append(gravadora).append("\n");
        sb.append("Pais Origem: ").append(paisOrigem).append("\n");
        return sb.toString();
    }
    
}
