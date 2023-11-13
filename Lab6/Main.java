package Lab6;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

//      Triangle triangle = new Triangle(5);
//      Square square = new Square(6);
//      triangle.desen();
//      square.desen();

        List<Book> listaDeCarti = new ArrayList<>();
        List<String> listaDeStrings = new ArrayList<>();

        listaDeCarti.add(new Book("Book1", "Author1", "12135334"));
        listaDeCarti.add(new Book("Book2", "Author2", "12135335"));
        listaDeCarti.add(new Book("Book3", "Author3", "12135336"));

        Book book1 = listaDeCarti.get(1);

        listaDeCarti.contains(book1);

        listaDeCarti.forEach(element -> {
            System.out.println(element.getName());
            System.out.println(listaDeCarti.indexOf(element));
        });
        listaDeCarti.stream()
                .filter(e -> e.getISBN().length() > 10);
                .map(e -> e.getAuthor());
        .toList();
    }
}
