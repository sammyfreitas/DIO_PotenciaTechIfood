// Desafio
// Neste desafio, você terá que criar uma função que faça um número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz". 
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {

    Scanner number = new Scanner(System.in);

    int num = number.nextInt();

    if (num % 3 == 0 && num % 5 == 0) {
        System.out.println("FizzBuzz");
    } else if (num % 3 == 0 || num % 5 == 0) {
        if (num % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println("Buzz");
        }
    } else {
        System.out.println(num);
    }
}
}