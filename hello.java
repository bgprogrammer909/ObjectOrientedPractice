public class hello {
    public void alu(){
        System.out.println("hi");
    }
    
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.print("This is my first program \n");
        System.out.print("I am on module STW4003CEM \n");
        System.out.print("A \"quoted \" String is \n 'much' better if you learn the rules \n of \"escape sequences. \n \"Also \"\" represents an empty \n String. Don't forget:use \\ \" instead of \"!\" is not same as \"");
        System.out.println("\n*\n**\n***\n****\n*****");
        System.out.println("\n*********\n*********\n*********\n*********\n*********");
        System.out.println("A well-formed Java program has a main method with { and } braces.\nA System.out.println statement has ( and ) and usually a String that starts and ends with a \" character. (But we type \\\" instead!)\n \"What is the difference between\r\n a ' and a \"?  Or between a \" and a \\\"? \" One is what we see when we're typing our program. The other is what appears on the \"console.\" ");
        new hello().alu();
    }
    
}
