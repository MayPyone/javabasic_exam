import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter index 0 to 9");
        Scanner scanner=new Scanner(System.in);
        int sc=scanner.nextInt();

        System.out.println("The index number "+sc +" is "+arr[sc]);
    }
}
