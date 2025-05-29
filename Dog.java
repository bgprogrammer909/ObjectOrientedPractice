public class Dog {
    private String name;
    private String breed;

    public Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setBreed(String breed){
    this.breed=breed;
    }

    public String getName(){
        return this.name;
    }

    public String getbreed(){
        return this.breed;
    }
    // see run.java for execution
}
