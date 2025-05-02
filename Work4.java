// Write a method to count the number of words in a given string
import java.util.Scanner;
public class Work4 {
    public static void countWords(String sentence){
        int count=0;
        for(int i=0;i<sentence.length();i++){
            char seg=sentence.charAt(i);
            if (seg==' '){
                count+=1;
            }
        }
        System.out.println("Number of words is "+(count+1));
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String word=sc.nextLine();
        countWords(word);
        sc.close();
    }
}