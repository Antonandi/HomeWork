package _111009;

import java.util.Scanner;

public class If_Else {



    static void speed(int speed) {
        if ( speed > 400){
            System.out.println("!Danger!");
        } else if (speed >260 && speed < 400) {
            System.out.println("Be careful");
        } else if (speed >=120 && speed < 260) {
            System.out.println("Its funny");
        } else System.out.println("Bored...");
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько вам лет?");
        int age = scanner.nextInt();
        if (age>=18)
            System.out.println("Отлично");
        else System.out.println("Маловато");
        System.out.println("С какой скоростью вы ездете?");
        speed(scanner.nextInt());

    }
}