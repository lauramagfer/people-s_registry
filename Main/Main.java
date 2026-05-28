package Main;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String name = "";
        String oldestPerson = "";
        int age = 0;
        int fixedAge = 0;
        int numberOfAdults = 0;
        int numberOfPeople;
        int men = 0;
        int women = 0;
        double averageAge = 0.00;
        double sumOfAges = 0.00;
        char gender = ' ';

        System.out.println("\n======CADASTRO DE PESSOAS======");
        System.out.println("\nQuantas pessoas você deseja cadastrar? ");
        numberOfPeople = sc.nextInt();

        for (int i = 1; i <= numberOfPeople; i++){

            System.out.println("------------------------");
            System.out.println("Pessoa " + i);
            System.out.println("\nDigite o nome: ");
            name = sc.next();
            System.out.println("Digite a idade: ");
            age = sc.nextInt();

            if (age > fixedAge ){
                oldestPerson = name;
            }

            if (age >= 18){
                numberOfAdults += 1;
            }

            fixedAge = age;
            sumOfAges += fixedAge;
            System.out.println("Informe o gênero: M/F");
            gender = sc.next().charAt(0);

            if ( gender == 'M'){
                men += 1;
            } else {
                women += 1;
            }

        }

        averageAge = sumOfAges/numberOfPeople;

        System.out.println("\n========RESULTADOS========");
        System.out.printf("A média das idades é %.2f\n", averageAge);
        System.out.println("Pessoa mais velha: " + oldestPerson);
        System.out.println("Quantidade de pessoas com mais de 18 anos: " + numberOfAdults);
        System.out.println("Quantidade de homens: " + men);
        System.out.println("Quantidade de mulheres: " + women);
        sc.close();
    }
}