import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Clothes clothes = new Coat();
        Clothes whiteCoat = new WhiteColor(new Coat());
        Clothes whiteJacket = new WhiteColor(new Jacket());
        Clothes blackJacket = new BlackColor(new Jacket());


        System.out.println("What is the weather today?");
        System.out.println("1 if windy day");
        System.out.println("2 if windy but shiny day"); //
        System.out.println("3 if rainy but shiny day");
        System.out.println("4 if rainy and cloudy day");



        Scanner myObj = new Scanner(System.in);
        String temp = myObj.nextLine();
        if(temp.equals("1")){
            System.out.println("Today is a windy day");
            clothes.wear();
        }
        else if(temp.equals("2")){
            System.out.println("Today is a windy but shiny day");
            whiteCoat.wear();
        }
        else if(temp.equals("3")){
            System.out.println("Today is rainy but shiny day");
            whiteJacket.wear();
        }
        else if(temp.equals("4")){
            System.out.println("Today is rainy and cloudy day");
            blackJacket.wear();
        }
        else{
            System.out.println("I will sit at home");
        }









    }
}