import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        float total = 0,contador=0;
        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            if (num%3 == 0 && num!=0){
                total+=num;
                contador++;
            }
        } while (num != 0);
        float media = total/contador;
        System.out.println("A média de todos os números múltiplos de 3 é: "+media);

        sc.close();

    }
}
