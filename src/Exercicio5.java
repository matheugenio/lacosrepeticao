import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int total = 0;
        do {
            System.out.print("Digite um numero: ");
            num = sc.nextInt();
            if (num > 0)
                total+=num;
        } while (num != 0);
        System.out.println("A soma dos numeros positivos é: "+total);

        sc.close();
    }
}
