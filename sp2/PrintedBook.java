package sp2;



public class PrintedBook extends Title {
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
        this.rate = 0.067574;

    }

    @Override
    protected double calculatePoints() {
        return calculateLiteraturePoints() * copies * pages;
    }

    @Override
    protected double calculateLiteraturePoints() {
        switch (getLiteratureType()) {
            case "BI":
                return 1.5;
            case "FAG":
                return 0.5;
            default:
                return 0.067574;

        }
    }
}