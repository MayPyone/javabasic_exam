import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        System.out.println("Choose one nuber for your luck!1 or 2 or 3");
        Scanner scanner=new Scanner(System.in);
        Integer str=scanner.nextInt();
        switch(str){
            case 1:
                System.out.println("You choosed "+str+" Get panda bear");break;
            case 2:
                System.out.println("You choosed "+str+" Get polar bear");break;
            case 3:
                System.out.println("You choosed "+str+" Get Parrot");break;
            default:
                System.out.println(" out of our content");break;
        }
    }
}
