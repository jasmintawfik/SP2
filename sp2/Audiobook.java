package sp2;

 public class Audiobook extends Title  {
    int durationlnMinutes;

    public Audiobook(String title, String literatureType, int copies, int durationlnMinutes) {
        super(title, literatureType, copies);
        this.durationlnMinutes = durationlnMinutes;
        this.rate = 0.067574;

    }

     @Override
     protected double calculatePoints() {
         return (durationlnMinutes * 0.5) * calculateLiteraturePoints() * copies;
     }

     protected double calculateLiteraturePoints(){
        switch (getLiteratureType()) {
            case "BI":
                return 1.5;
            case  "FAG":
                return 0.5;
                default:
                    return 0.067574;
        }
    }
}
