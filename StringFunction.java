import java.util.Arrays;

public class StringFunction {
    public static void main(String[] args) {
        String name="myname";
        String name1=new String("myname");//name 1 and name is same
        String name2=name+name1;
        String name3=name.concat(name2);
        char val=name.charAt(1);
        System.out.println(name+name1+"\n"+name2+name3);
        System.out.println(val);
        //printing length of a string
        System.out.println(name.length());
        String value=name.substring(1,4);
        System.out.println("substring is "+value);
        System.out.println(name.equalsIgnoreCase("myname"));
        name.contains("Name");
        name.startsWith("MY");
        name.endsWith("e");
        name.indexOf("m");
        name.lastIndexOf("n");
        name.toLowerCase();
        name.toUpperCase();
        String val1=" jello ".trim();
        name.replace('a','b');
        String stringToSplit="abc.def.ghi";
        //splits strings by the value
        String[] seq=stringToSplit.split("\\.");
        System.out.println(Arrays.toString(seq));
        int number=1;
        //turns number into string
        String numString=String.valueOf(number);
        System.out.println(numString);
    }
}
