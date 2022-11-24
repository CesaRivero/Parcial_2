public class Rectangle extends Shape{

    public double width;
    public double length;

    Rectangle(){
        this.setWidth(width = 1.0);
        this.setLength(length = 1.0);
    }

    Rectangle(double width,double length){
        this.setWidth(width);
        this.setLength(length);
    }

    Rectangle(double width,double length,String color, boolean filled){
        this.setWidth(width);
        this.setLength(length);
        this.setColor(color);
        this.setFilled(filled);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        double area = width * length;
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
