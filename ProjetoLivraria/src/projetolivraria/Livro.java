/*
 * Aulas professor Maromo.
 */
package projetolivraria;

/**
 *
 * @author maromo
 */
public class Livro extends Produto {
    private String autor;
    private String editora;
    private String edicao;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Autor: ").append(autor).append("\n");
        sb.append("Editora: ").append(editora).append("\n");
        sb.append("Edição: ").append(edicao).append("\n");
        return sb.toString();
    }
    
}
