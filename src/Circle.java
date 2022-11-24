public class Circle extends Shape{

    public double radius;

    Circle(){
        this.setRadius(radius = 1.0);
    }

    Circle(double radius){
       this.setRadius(radius);
    }

    Circle(double radius, String color, Boolean filled){
        this.setColor(color);
        this.setRadius(radius);
        this.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
      double area = 3.14 * (radius*radius);
      return this.getArea();
    }

    public double getPerimeter(){
        double perimeter = 3.14 * 2 * radius;
        return this.getPerimeter();
    }

    public String toString(){
        return String.format("Circle[color=%s,filled=%b,radius=%f]",this.getColor(),this.isFilled(),this.getRadius());
    }


}
