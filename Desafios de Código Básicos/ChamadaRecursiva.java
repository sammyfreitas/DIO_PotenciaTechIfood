// Desafio
// Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.   
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

public class ChamadaRecursiva {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int N;

        N = numero.nextInt();

        System.out.println(somatorio(N));
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
    
}