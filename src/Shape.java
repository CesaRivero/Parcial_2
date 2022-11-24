public abstract class Shape {
    public String color;
    public boolean filled;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    Shape(){
        this.color = "red";
        this.filled = true;
    }

    Shape(String color,boolean filled){
      this.setColor(color);
      this.setFilled(filled);

    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString(){
      return String.format("Shape[color=%s,filled=%b]",this.getColor(),this.isFilled());
    }

}
