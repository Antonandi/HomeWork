import java.util.Scanner;

public class Homework2209 {
    public static int generateRandomNumber(int rn) {
        if (rn < 0) {
            throw new IllegalArgumentException();
        }
        return (int) (Math.random() * (rn + 1));
    }


    static int inNum1(int vn, int num1) {
        return vn * num1;
    }

    static int getMulti(int rn, int vn, int inNum1) {
        return rn * vn * inNum1;
    }

    static int getSum(int rn, int vn, int inNum1) {
        return rn + vn + inNum1;
    }

    static int getSub(int rn, int vn, int inNum1) {
        return vn - rn - inNum1;
    }

    static int getDiv(int rn, int vn, int inNum1) {
        return vn / rn / inNum1;
    }

//Сделал странноватую инру, но не понял как мне вернуть значение после сравнения.
// Хотел использовать его опять же для сравнения чтобы можно было поздравить с выйгрышом.
// Мне кажеться я сделал костыль, и не факт что рабочий)


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String name = scanner.nextLine();
        System.out.println("Привет " + name);
        int rn = 6;
        System.out.println("Загадай число");
        int vn = scanner.nextInt();

        for (int i = 0; i < 1; i++) {
//            System.out.println(generateRandomNumber(rn));
        }
        if (generateRandomNumber(rn) == 1) {
            System.out.println("Выпало 1, кидай еще раз");
        } else if (generateRandomNumber(rn) == 2) {
            System.out.println("Выпало 2");
            System.out.println(getMulti(rn, vn, inNum1(vn, 23)) == 1000);
            System.out.println("Ты взорвался");

        } else if (generateRandomNumber(rn) == 3) {
            System.out.println("Выпало 3");
            System.out.println(getDiv(rn, vn, inNum1(vn, 23)) == 1000);
            System.out.println("Ты взорвался");
        } else if (generateRandomNumber(rn) == 4) {
            System.out.println("Выпало 4");
            System.out.println(getSub(rn, vn, inNum1(vn, 23)) == 1000);
            System.out.println("Ты взорвался");
        } else if (generateRandomNumber(rn) == 5) {
            System.out.println("Выпало 5");
            System.out.println(getSum(rn, vn, inNum1(vn, 23)) == 1000);
            System.out.println("Ты взорвался");
        } else if (generateRandomNumber(rn) == 6) {
            System.out.println("Выпало 6, кидай еще раз");
        } else if (generateRandomNumber(rn) == 0) {
            System.out.println("Ты взорвался");
        } else {
            System.out.println("Поздравляю, ты прошел игру");

        }
    }
}
