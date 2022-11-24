public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "red", false);
        Shape s2 = new Circle(); //cargar usando setters
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        Shape s4 = new Square(6.6);


        s2.setFilled(true);
        s2.setColor("blue");

        System.out.println(String.format("Esta lleno=%b\nColor=%s\nRadio=%f\nPerimetro del circulo=%f\nArea del circulo=%f", s1.isFilled(),s1.getColor(), ((Circle) s1).getRadius(),s1.getPerimeter(),s1.getArea()));

    }
}
