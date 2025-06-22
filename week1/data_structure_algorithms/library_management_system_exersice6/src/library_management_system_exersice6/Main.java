package library_management_system_exersice6;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B101", "Java Programming", "James Gosling"),
            new Book("B102", "Python Basics", "Guido van Rossum"),
            new Book("B103", "Effective Java", "Joshua Bloch"),
            new Book("B104", "C in Depth", "K&R"),
        };

        Library library = new Library(books);

        System.out.println("All Books:");
        library.showAllBooks();

        System.out.println("\nLinear Search for 'Python Basics':");
        Book result1 = library.linearSearchByTitle("Python Basics");
        System.out.println(result1 != null ? result1 : "Not found");

        System.out.println("\nBinary Search for 'Effective Java':");
        Book result2 = library.binarySearchByTitle("Effective Java");
        System.out.println(result2 != null ? result2 : "Not found");
    }
}
