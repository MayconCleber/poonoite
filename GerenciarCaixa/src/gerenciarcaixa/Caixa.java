package gerenciarcaixa;


public class Caixa {
    private double saldo;
    
    public String depositar(double valor){
        if(valor>0){
            saldo += valor;
            return "Depósito efetuado com sucesso";
        }
        return "Valor inválido para depósito";
    }
    public String sacar(double valor){
        if((valor > 0) && (valor <= saldo)){
            saldo-= valor;
            return "Saque efetuado com sucesso";
        }
        return "Valor inválido ou saldo insuficiente";
    }
    public double getSaldo(){
        return saldo;
    }
}
