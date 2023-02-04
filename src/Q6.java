import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        String str[] = {"apple", "pineapple"};

        System.out.println("Choose one sort of juice..");
        Scanner scanner = new Scanner(System.in);
        String fruitinputs = scanner.next();
        switch (fruitinputs) {
            case "apple":
                System.out.println("You chose " + str[0]);
                break;
            case "pineapple":
                System.out.println("You chose " + str[1]);
                break;
            default:
                System.out.println("You haven't chosen anything  we have yet!");
                break;
        }
    }
}