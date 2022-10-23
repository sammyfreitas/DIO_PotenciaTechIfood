// Desafio
// Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']'
// determine se uma determinada string é válida. 


// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 



import java.util.*;

public class ValidacaoDeParenteses {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());
        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        String[] letras = s.split("");
        String[] tags = {"(",")","{","}","[","]"};
        boolean b = false;

        for(int i = 0; i < tags.length; i++){
            if (letras[0].equals(tags[i]) && letras[letras.length-1].equals(tags[i + 1])){
                b = true ;
            } 
        }
        return b;
    }
}