package sp2;

public class LibararyRoyalityCalculator {
    public static void main(String[] args) {
        Author author = new Author("HC.andersen");
        Title audibook = new Audiobook("Mine første år", "BI", 50, 150);
        Title printedbook = new PrintedBook("O.T a danish", "FAG", 400, 350);
        Title printedbook2 = new PrintedBook("hcandersen", "FAG", 400, 300);

        author.addTitle(audibook);
        author.addTitle(printedbook);
        author.addTitle(printedbook2);


        author.calculateTotalPay();

        System.out.println("payment for the auhthor titles : " + author.calculateTotalPay() + "kr");
    }
}