public class Circle extends Shape{

    public double radius;

    Circle(){
        this.setRadius(radius = 1.0);
        this.setArea(area= 3.14 * (radius*radius));
        this.setPerimeter(perimeter = 3.14 * 2 * radius);
    }

    Circle(double radius){
       this.setRadius(radius);
        this.setArea(area= 3.14 * (radius*radius));
        this.setPerimeter(perimeter = 3.14 * 2 * radius);
    }

    Circle(double radius, String color, Boolean filled){
        this.setColor(color);
        this.setRadius(radius);
        this.setFilled(filled);
        this.setArea(area= 3.14 * (radius*radius));
        this.setPerimeter(perimeter = 3.14 * 2 * radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArea(double area){

        this.area=area;
    }
    public double getArea(){


        return this.area;
    }

    public void setPerimeter(double perimeter){

        this.perimeter = perimeter;
    }
    public double getPerimeter(){
        return this.perimeter;
    }



    public String toString(){
        return String.format("Circle[Color= %s, Filled= %b, Radius= %f, Perimeter= %f, Area= %f]",this.getColor(),this.isFilled(),this.getRadius(),this.getPerimeter(),this.getArea());
    }


}
