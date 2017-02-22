package projetoacampamento;


public class Acampamento {
    public String nome;
    public String equipe;
    public int idade;
    
    public void imprimir(){
        System.out.println("Nome do Membro: " + nome);
        System.out.println("Idade do Membro: " + idade);
        System.out.println("Equipe: " + equipe);
    }
    
    public void separarGrupo(){
        if(idade<6){
            equipe = "-";
            return;
        }
        if(idade<10){
            equipe = "A";
            return;
        }
        if(idade<=20){
            equipe = "B";
        }else{
            equipe = "C";
        }
    }
}
