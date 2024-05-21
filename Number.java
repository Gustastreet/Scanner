import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o seu número? / What's your number?");
        int número = scanner.nextInt();
        int éPor5 = número % 5;
        int éPor3 = número % 3;
        int éPelos2 = éPor3 + éPor5;
        
        if (éPelos2 == 0) {
            System.out.println("BuzzFizz");
        } else if (éPor5 == 0) {
            System.out.println("Buzz");
        } else if (éPor3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println("FizzBuzz");
        }
    }
}
