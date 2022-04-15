import java.util.Scanner;

public class ClassAverage {
    
    public static void main(String[] args) {

        int Mathematics, Physics, Chemical, Turkish, Music, average = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Your Mathematics Grade : ");

        Mathematics = input.nextInt();

        System.out.print("Your Physics Grade : ");

        Physics = input.nextInt();

        System.out.print("Your Chemical Grade : ");

        Chemical = input.nextInt();

        System.out.print("Your Turkish Grade : ");

        Turkish = input.nextInt();

        System.out.print("Your Music Grade : ");

        Music = input.nextInt();


        if (Mathematics >= 0 && Mathematics <= 100){

            average = average + Mathematics;

        }

        if (Physics >= 0 && Physics <= 100){

            average = average + Physics;

        }

        if (Chemical >= 0 && Chemical <= 100){

            average = average + Chemical;

        }

        if (Turkish >= 0 && Turkish <= 100){

            average = average + Turkish;

        }

        if (Music >= 0 && Music <= 100){

            average = average + Music;

        }


        average = average / 5;

        if(average <= 55){

            System.out.println("You Failed The Class. Try Again !");

        } else {

            System.out.println("You Passed The Class. Congratulations !");

        }

        System.out.println("Your Average : " + average);
    }
}
