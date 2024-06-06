import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0, totalmenor=0, totalmaior=0;
        while (idade>=0){
            System.out.println("Digite uma idade");
             idade = sc.nextInt();
             if (idade < 21 && idade>=0){
                 totalmenor++;
             } else if (idade > 50){
                 totalmaior++;
             }
        }
        System.out.println("Total de pessoas menores de 21 anos: " +totalmenor);
        System.out.println("TOtal de pessoas maiores de 50 anos: " +totalmaior);

        sc.close();
    }
}
