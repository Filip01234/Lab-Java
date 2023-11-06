class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Student extends Person {
    private int[] grades;

    public Student(String name, String email, int[] grades) {
        super(name, email);
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}

class Professor extends Person {
    private String[] courses;

    public Professor(String name, String email, String[] courses) {
        super(name, email);
        this.courses = courses;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}

public class Main {
    public static void main(String[] args) {
        // Crearea unei instanțe de Person
        Person person = new Person("John Doe", "john@example.com");

        // Crearea unei instanțe de Student
        int[] grades = {90, 85, 78};
        Student student = new Student("Alice Smith", "alice@example.com", grades);

        // Crearea unei instanțe de Professor
        String[] courses = {"Math", "Physics"};
        Professor professor = new Professor("Dr. Johnson", "johnson@example.com", courses);

        // Afișarea informațiilor despre fiecare obiect
        System.out.println("Informații despre persoana:");
        System.out.println("Nume: " + person.getName());
        System.out.println("Email: " + person.getEmail());

        System.out.println("\nInformații despre student:");
        System.out.println("Nume: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Note: " + java.util.Arrays.toString(student.getGrades()));

        System.out.println("\nInformații despre profesor:");
        System.out.println("Nume: " + professor.getName());
        System.out.println("Email: " + professor.getEmail());
        System.out.println("Cursuri predate: " + java.util.Arrays.toString(professor.getCourses()));
    }
}
