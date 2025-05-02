// Create a method to print the multiplication tables from 1 to 10
public class Work13 {
    public static void mul() {
        for(int i=1;i<=10;i++){
            System.out.println("Table of "+i+" is");
            for(int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
    public static void main(String[] args) {
        mul();
    }
}
