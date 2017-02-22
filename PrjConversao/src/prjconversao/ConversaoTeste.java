package prjconversao;

public class ConversaoTeste {

    // Comentário de uma linha
    public static void main(String[] args) {
        int a, b;
        float c;
        /*
        Exemplos de conversão de tipo
        String para outros
        Outros para String
        Comentário de várias linhas
        */
        String valor = "10";
        a = Integer.parseInt(valor);
        b = 15;
        b+= a;
        System.out.println("Valor de b: " + b);
        valor = String.valueOf(b);
        valor+= " quilos";
        System.out.println(valor);
        
        //Exemplo de for
        for (int i = 0; i < 10; i++) {
            if(i % 5 == 0) break;
            System.out.println(i);
        }
        while(b<30){
            System.out.println(++b);
        }
        do{
            a++;
            System.out.println("Valor de a: " + a);
        }while(a!=33);
    }
    
}
