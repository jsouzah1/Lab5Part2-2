package Numbers;

public class book {
    private String Authorofbook;
    private String TitleofBook;
    private int BookPageNumber;
    private double PriceofBook;

    public book(String Authorofbook, String TitleofBook, int BookPageNumber, double PriceofBook) {
        this.Authorofbook = Authorofbook;
        this.TitleofBook = TitleofBook;
        this.BookPageNumber = BookPageNumber;
        this.PriceofBook = PriceofBook;


        }
    public String getAuthorofBook(){
        return Authorofbook;
    }
    public String getTitleofBook(){
        return TitleofBook;
    }

    public int getBookPageNumber(){
        return BookPageNumber;
    }
    public double getPriceofBook(){
        return PriceofBook;
    }
}
