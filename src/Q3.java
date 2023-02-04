public class Q3 {
    public static void main(String[] args) {
        int arr[]={23 ,24 ,12 ,78 ,62,123};
        for(int i=1;i< arr.length;i++){
            if(arr[i]>arr[0]){
                arr[0]=arr[i];
            }
        }
        System.out.println("The largest number is "+arr[0]);

    }
}
