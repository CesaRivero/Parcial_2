public class Square extends Rectangle{



    Square(){

    }

    Square(double side){
        this.setSide(side);
    }

    Square(double side,String color, boolean filled){
        this.setSide(side);
        this.setColor(color);
        this.setFilled(filled);
    }

    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    public double getSide() {
        return this.getSide();
    }

    public void setLength(double side) {
        this.length=side;

    }

    public void setWidth(double side) {
        this.width = side;
    }

}
