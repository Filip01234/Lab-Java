class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter pentru proprietatea "name"
    public String getName() {
        return name;
    }

    // Setter pentru proprietatea "name"
    public void setName(String name) {
        this.name = name;
    }

    // Getter pentru proprietatea "breed"
    public String getBreed() {
        return breed;
    }

    // Setter pentru proprietatea "breed"
    public void setBreed(String breed) {
        this.breed = breed;
    }
}

public class Main {
    public static void main(String[] args) {
        // Crearea a două instanțe ale clasei Dog și inițializarea lor
        Dog dog1 = new Dog("Rex", "Golden Retriever");
        Dog dog2 = new Dog("Buddy", "Labrador");

        // Afișarea informațiilor inițiale despre câini
        System.out.println("Informații inițiale despre câinele 1:");
        System.out.println("Nume: " + dog1.getName());
        System.out.println("Rasă: " + dog1.getBreed());

        System.out.println("\nInformații inițiale despre câinele 2:");
        System.out.println("Nume: " + dog2.getName());
        System.out.println("Rasă: " + dog2.getBreed());

        // Modificarea proprietăților folosind setter-urile
        dog1.setName("Max");
        dog2.setBreed("German Shepherd");

        // Afișarea modificărilor folosind getter-urile
        System.out.println("\nInformații actualizate despre câinele 1:");
        System.out.println("Nume: " + dog1.getName());
        System.out.println("Rasă: " + dog1.getBreed());

        System.out.println("\nInformații actualizate despre câinele 2:");
        System.out.println("Nume: " + dog2.getName());
        System.out.println("Rasă: " + dog2.getBreed());
    }
}
