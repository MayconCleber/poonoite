package revisao.exercicio1;

public class Funcionario {
    private int idFunc;
    private String nomeFunc;
    private String departamento;
    private String dataContratacao;
    private double salario;
    private String documento;
    private boolean ativo;
    
    public Funcionario(){
        this.ativo = true;
    }
    public void atualizaSalario(double valor){
        this.salario += valor;
    }
    public void demiteFuncionario(){
        this.ativo = false;
    }
    public void imprimir(){
        System.out.println("Dados do Funcionario");
        System.out.println("Id: " + idFunc);
        System.out.println("Nome: " + nomeFunc);
        System.out.println("Salario: " + salario);
        if(ativo){
            System.out.println("Funcionário Ativo no quadro");
        }else{
            System.out.println("Funcionário Inativo");
        }
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}
