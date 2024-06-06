import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        String continua = "S";
        int idade, genero, stack;
        int totalBack = 0, totalFrontMCisTrans = 0, totalHCisTransMobile40 = 0, totalNbfull30 = 0, total = 0;
        float totalIdade = 0;
        Scanner sc = new Scanner(System.in);
        while (continua.equals("S") ) {
            System.out.println("Digite sua idade");
            idade = sc.nextInt();
            System.out.printf("""
                    Identidade de Gênero:
                    1 – Mulher Cis
                    2 – Homem Cis
                    3 – Não Binário
                    4 – Mulher Trans
                    5 – Homem Trans
                    6 – Outros
                    """);
            genero = sc.nextInt();
            System.out.printf("""
                    Pessoa desenvolvedora: 
                    1 – Backend
                    2 – Frontend
                    3 – Mobile
                    4 – FullStack
                                        
                    """);
            stack = sc.nextInt();
            System.out.println("Deseja continuar? (S/N)");
            continua = sc.next();
            if (!continua.equals("N") && !continua.equals("S")){
                System.out.println("Por favor digite S ou N Maiusculoo");
            } else {
                if (stack == 1)
                    totalBack++;
                if ((genero == 1 || genero == 4) && stack == 2)
                    totalFrontMCisTrans++;
                if ((genero == 2 || genero == 5) && idade > 40 && stack == 3)
                    totalHCisTransMobile40++;
                if (genero == 3 && idade < 30 && stack == 4)
                    totalNbfull30++;
                total++;
                totalIdade += idade;
            }
        }
        sc.close();
        System.out.println("Total de desenvolvedores Back end: "+totalBack);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: "+totalFrontMCisTrans);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+totalHCisTransMobile40);
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+totalNbfull30);
        System.out.println("O número total de pessoas que responderam à pesquisa: "+total);
        System.out.printf( "A média de idade das pessoas que responderam à pesquisa: %.2f ",totalIdade/total);
    }
}
