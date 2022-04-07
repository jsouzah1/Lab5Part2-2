package Numbers;

public class Main {

    public static void main(String[] args) {
        Start();
    }
    public static void Start(){
        System.out.println("Name");

        book Book1 = new book("A","B",1,16.99);
        book Book2 = new book("C","D",4,16.99);

        System.out.println("your book info is" + " " + Book1.getAuthorofBook() + " " + Book1.getTitleofBook() + " " + Book1.getPriceofBook() + " " +Book1.getBookPageNumber());
        System.out.println("your book info is" + " " +Book2.getAuthorofBook() + " " +Book2.getTitleofBook() + " " +Book2.getPriceofBook() + " " +Book2.getBookPageNumber());

    }
}
