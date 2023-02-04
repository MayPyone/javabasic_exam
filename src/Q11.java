import java.util.Arrays;

public class Q11 {
    int arr[]={1,2,3};
    public static void main(String[] args) {
   int []old={1,2,3,4};
   int []Newarray = new int[old.length];
   int a=2;
   for(int i=0;i< old.length;i++){
       if (a!=old[i]){
           Newarray[a]=old[i];
       }

   }
        System.out.println("new array" + Arrays.toString(Newarray));

    }
}
