import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int totalPar = 0, totalImpar = 0,numero;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=10; i++) {
            System.out.println("Digite o "+i+" numero");
             numero = sc.nextInt();
            if (numero%2 == 0) {
                totalPar++;
            } else  {
                totalImpar++;
            }
        }
        System.out.println("Numero de pares: " +totalPar);
        System.out.println("Numero de impares: " +totalImpar);



        sc.close();
    }
}
