public class Functions {
    // access , object or not,return type, name of function
    public static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void multiply(int a,int b){
        int product=a*b;
        System.out.println(product);
    }
    public static void hello( ) {
        System.out.println("hello world");
        
    }
    //to access thiss you need to make an object
    public void hi(){
        System.out.println("hi");
    }
    
    public static void main(String[] args) {
        int sum=add(1,2);
        multiply(8,8);
        System.out.println(sum);
        hello();
        Functions obj=new Functions();
        obj.hi();
        


    }
}