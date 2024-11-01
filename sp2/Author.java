package sp2;


import java.util.ArrayList;


public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();

    }

     public void addTitle(Title title){
        this.titles.add(title);
     }

     public float calculateTotalPay(){
     double pay = 0;
     for(Title title : titles){
         pay += title.calculateRoyalty();
     }
     return (float) (Math.round(pay * 100.0) / 100.0);

     }


}



