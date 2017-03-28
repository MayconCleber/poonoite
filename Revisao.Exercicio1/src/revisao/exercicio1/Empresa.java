/*
 * Aulas professor Maromo.
 */
package revisao.exercicio1;

/**
 *
 * @author maromo
 */
public class Empresa {
    private int idEmpresa;
    private String razaoSocial;
    private String cnpj;
    private Funcionario[] empregado;
    
    public void adicionaEmpregado(Funcionario f, int posicao){
        empregado[posicao] = f;
    }
    public void mostrarEmpregado(){
        for (Funcionario item : empregado) {
            if(item!=null)item.imprimir();
        }
    }
    public boolean contemFuncionario(Funcionario f){
        for (Funcionario item : empregado) {
            if(item.getIdFunc()==f.getIdFunc()){
                return true;
            }
        }
        return false;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Funcionario[] getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Funcionario[] empregado) {
        this.empregado = empregado;
    }
}
