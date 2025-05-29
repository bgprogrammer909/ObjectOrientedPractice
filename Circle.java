public class Circle {
double radius;

public double getRadius(){
    return this.radius;
}

public void setRadius(double radius){
    this.radius=radius;
}

public double area(){
    return (this.radius)*(this.radius)*22/7;
}
public double circumference(){
    return this.radius*2*22/7;
}

}
// see run.java for execution