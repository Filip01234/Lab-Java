public class Rectangle {
    private double width;
    private double length;

    // Constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Getter pentru proprietatea "width"
    public double getWidth() {
        return width;
    }

    // Setter pentru proprietatea "width"
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter pentru proprietatea "length"
    public double getLength() {
        return length;
    }

    // Setter pentru proprietatea "length"
    public void setLength(double length) {
        this.length = length;
    }

    // Metodă pentru calculul ariei
    public double calculateArea() {
        return width * length;
    }

    // Metodă pentru calculul perimetrului
    public double calculatePerimeter() {
        return 2 * (width + length);
    }

    public static void main(String[] args) {
        // Crearea unei instanțe de Rectangle și inițializarea ei
        Rectangle myRectangle = new Rectangle(5.0, 3.0);

        // Afișarea ariei și perimetrului
        System.out.println("Aria: " + myRectangle.calculateArea());
        System.out.println("Perimetru: " + myRectangle.calculatePerimeter());

        // Modificarea lățimii și a lungimii utilizând setter-ele
        myRectangle.setWidth(6.0);
        myRectangle.setLength(4.0);

        // Afișarea ariei și perimetrului actualizate
        System.out.println("Aria actualizată: " + myRectangle.calculateArea());
        System.out.println("Perimetru actualizat: " + myRectangle.calculatePerimeter());
    }
}
