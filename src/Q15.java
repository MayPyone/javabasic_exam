public class Q15 {
    public static void main(String[] args) {
        int even=0;
        int odd=0;
        int arr[]={1,2,3,4,5,6,7,8,11,21,22};
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
            {
                even++;

            }
            else odd++;
        }
        System.out.println("Total number of even number is "+even +" numbers");
        System.out.println("Total number of odd number is "+odd +" numbers");

    }
}
