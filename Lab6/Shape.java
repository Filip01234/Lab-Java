package Lab6;

public abstract class Shape {
    protected Integer l;

    public Shape(Integer l) {
        this.l = 1;
    }

    public abstract Double area();
    public abstract Integer perimeter();

    public void desen() {
        System.out.println("Area of shape" + area());
        System.out.println("Drawing shape" + perimeter());
    }

    public abstract void methodExemplu();

    public void desen(String culoare) {
        System.out.println("Area of shape" + area());
        System.out.println("Drawing shape" + perimeter());
        System.out.println("Color shape" + culoare);
}
