import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String str[]={"apple","pineapple"};
        System.out.println("Choose one sort of juice..");
        Scanner scanner=new Scanner(System.in);
        String fruitinputs=scanner.next();
        if(fruitinputs.equals(str[0])){
            System.out.println("You chose "+ str[0]);
        }
        else if (fruitinputs.equals(str[1])) {
            System.out.println("You chose "+ str[1]);

        }
        else System.out.println("You haven't chosen anything  we have yet!");


    }
}
