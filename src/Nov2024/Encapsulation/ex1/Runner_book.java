package Nov2024.Encapsulation.ex1;

public class Runner_book {
    public static void main(String[] args) {
        Book b1= new Book();
        b1.setAuthor("David williams");
        b1.setPrice(-98.45);
        b1.setTitle("Mad son");
        System.out.println("the Book details are:");
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPrice());
        System.out.println(b1.getTitle());
    }
}
