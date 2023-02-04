public class oopexercisevariables {
    int obj=9;
    public static void main(String[] args) {
        System.out.println(new oopexercisevariables().obj);// obj
        System.out.println(oopexercisevariables.test());
        oopexercisevariables op=new oopexercisevariables();
   //     op.Test();

        System.out.println(op.caculator(4,9));
    }
  static   public String test(){
        return "Testing method";
    }
   public void Test(){
       System.out.println("One two three");
   }
   public int caculator(int a, int b){
        int c=a+b;
       System.out.println("The answer is "+c);
       return c;
   }


}
