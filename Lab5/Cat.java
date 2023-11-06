package Lab5;

public class Cat {

    private String name;

    private String colour;

    private Integer age;

    private Integer energylevel;

    private Integer hungerlevel;

    private Integer moodlevel;

    public Cat() {

    }

    public Cat(String name, String colour, Integer age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.energylevel = 3;
        this.hungerlevel = 3;
        this.moodlevel = 3;
    }

    public  void play() {
        this.moodlevel++;
        this.energylevel--;
        this.miau();
    }

    public  void feed() {
        this.moodlevel++;
        this.hungerlevel--;
        this.miau();
    }

    public  void sleep() {
        this.energylevel++;
        this.hungerlevel++;
        this.miau();
    }

    public void miau() {
        System.out.println("Meouw");


    }


}
