import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bomb;
        double timer;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1 - Выставить таймер бомбы");
            System.out.println("2 - Активировать бомбу");
            System.out.println("0 - Выход");

            bomb = scanner.nextInt();
            if (bomb == 1) {
                System.out.println("Введите время в секундах");
                timer = scanner.nextDouble();
                for (int i = (int) timer; i != 0; i--) {
                    if (i <= 5) {
                        System.out.println("Беги , сука  ");
                    } else
                        System.out.println("До взрыва осталось " + i);


                }
            }
            if (bomb == 2) {
                for (int i = 60; i != 0; i--){
                    System.out.println("До взрыва осталось " +i);
                    if(i == 1) {
                        System.out.println("Бум");
                    }

                }

            }


        }
        while (bomb != 0);

    }

}