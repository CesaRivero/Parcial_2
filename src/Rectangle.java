public class Rectangle extends Shape{

    public double width;
    public double length;

    Rectangle(){
        this.setWidth(width = 1.0);
        this.setLength(length = 1.0);
        this.setArea(area = width * length);
        this.setPerimeter(perimeter = (2*width) + (2*length));
    }
    Rectangle(double width,double length){
        this.setWidth(width);
        this.setLength(length);
        this.setArea(area = width * length);
        this.setPerimeter(perimeter = (2*width) + (2*length));
    }
    Rectangle(double width,double length,String color, boolean filled){
        this.setWidth(width);
        this.setLength(length);
        this.setColor(color);
        this.setFilled(filled);
        this.setArea(area = width * length);
        this.setPerimeter(perimeter = (2*width) + (2*length));
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

        return this.area;
    }
    public void setArea(double area){

        this.area=area;
    }

    public double getPerimeter(){
        return this.perimeter;
    }
    public void setPerimeter(double perimeter){

        this.perimeter = perimeter;
    }

    public String toString(){
        return String.format("Rectangle[color=%s,filled=%b,width=%f,length=%f, Perimeter= %f, Area= %f]",this.getColor(),this.isFilled(),this.getWidth(),this.getLength(),this.getPerimeter(),this.getArea());
    }



}
