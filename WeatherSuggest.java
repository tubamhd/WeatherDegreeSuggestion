import java.util.Scanner;

public class WeatherSuggest {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("What Is The Degree of Weather? :  ");
        heat = input.nextInt();
        if (heat <= 5){
            System.out.println("You can go for Skiing!");
        }
        if (heat > 5 && heat <= 14){
            System.out.println("You can go to Cinema!");
        }
        if (heat >= 15 && heat <= 24){
            System.out.println("You can go to Picnic!");
        }
        else{
            System.out.println("You can go for Swimming!");
        }
    }
}
