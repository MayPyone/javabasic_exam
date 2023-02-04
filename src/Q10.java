public class Q10 {

        public static void main(String[] args) {
            int arr[]={1,3,46,3,23,56,67};
            int a=arr[0];
            for(int i=0;i<arr.length;i++){
                if (arr[0] < arr[i+1]) {
                    arr[0]=arr[i+1];
                    System.out.println(arr[0]);
                }


        }
    }

}
