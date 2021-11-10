package AbsctractFactoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which do you prefer?");
        System.out.println("1 SpecialEdition");
        System.out.println("2 StandartEdition");



        Scanner scanner = new Scanner(System.in);
        short choice = scanner.nextShort();
        if (choice == 1) {
            System.out.println("1 Magazine");
            System.out.println("2 Newspaper");
            short choice2 = scanner.nextShort();

            if (choice2 == 1) {
                PrintingPress press = new SpecialEdition();
                Magazine starM = press.printMagazine();
                starM.sell();
            }
            if (choice2 == 2) {
                PrintingPress press =  new SpecialEdition();
                Newspaper worldN = press.printNewsPaper();
                worldN.sell();
            }
        }


        if (choice == 2) {
            System.out.println("1 Magazine");
            System.out.println("2 Newspaper");
            short choice2 = scanner.nextShort();

            if (choice2 == 1) {
                PrintingPress press =  new StandartEdition();
                Magazine sportM = press.printMagazine();
                sportM.sell();
            }
            if (choice2 == 2) {
                PrintingPress press =  new StandartEdition();
                Newspaper dailyN = press.printNewsPaper();
                dailyN.sell();
            }

        }

    }


}
