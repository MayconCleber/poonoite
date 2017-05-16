package projetoexception;

public class ProjetoException {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int a = 10;
            int b = 0;
            int c = 0;
            c = a / b;
            int valor = Integer.parseInt("Maria") + c;
            
            System.out.println("Valor de c: " + c);
            System.out.println("Valor de Valor: " + valor);
       }catch (ArithmeticException e) {
           System.out.println("Não é possível dividir por zero");
            //gravar Log
        } catch(NumberFormatException ex){
            System.out.println("Erro de conversão de dados");
        } catch(Exception err){
            System.out.println("Contate o Adm, erro: " + err.getMessage());
        }

    }

}
