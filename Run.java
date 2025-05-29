public class Run {
   public static void main(String[] args) {
    // 1
        Circle c=new Circle();
        c.setRadius(7);
        System.out.println("the area is :"+c.area());
        System.out.println("the circumference is :"+c.circumference());

    // 2
        SimpleInterest si=new SimpleInterest();
        si.setPrinciple(100000);
        si.setTime(2.5);
        si.setRate(10);
        System.out.println("principle:"+si.getPrinciple());
        System.out.println("time:"+si.getTime());
        System.out.println("Rate"+si.getRate());

    // 3
        Dog a=new Dog("bob","German Sheperd");
        Dog b=new Dog("blacky","husky");
        System.out.println(a.getName()+a.getbreed());
        System.out.println(b.getName()+b.getbreed());
        a.setBreed("cottlie");
        a.setName("Bob");
        a.setName("Blackie");
        b.setBreed("golden retriever");
        System.out.println(a.getName()+a.getbreed());
        System.out.println(b.getName()+b.getbreed());
        
    }
}
