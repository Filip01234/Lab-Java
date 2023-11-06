package Lab5;

public class Main {

    public static void main(String[]args){
        Cat firstCat = new Cat("Tom", "grey",5);
        Cat secondCat = new Cat("Garfield", "orange", 8);

        firstCat.play();
        firstCat.feed();
        firstCat.sleep();

        firstCat.miau();
    }
}
