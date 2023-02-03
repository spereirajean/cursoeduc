package cursojavaeduc;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DesafioCalculadora {
    public static void main (String[] args) {
        Scanner valor = new Scanner(System.in);
        int valor1, valor2;
        char operador;

        System.out.println("Digite um valor:");
        valor1 = valor.nextInt();

        System.out.println("Digite outro valor:");
        valor2 = valor.nextInt();

        System.out.println("Digite um operador(+,-,/,*)");
        operador = valor.next().charAt(0);

        if (operador == '+'){
            System.out.println("A soma dos dois valores é igual a :" + (valor1 + valor2));
        }else if (operador == '-'){
            System.out.println("A subtração dos dois valores é igual a: " + (valor1 - valor2));
        }else if ( operador == '/'){
            System.out.println("A divisão dos dois valores é igual a: " + (valor1 / valor2));
        }else if (operador == '*'){
            System.out.println("A multiplicação dos dois valores é igual a: " + (valor1 * valor2));
        }else{
            System.out.println("Operador inválido");
        }
    }
}