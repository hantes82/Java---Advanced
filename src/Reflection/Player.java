/**
 * Created by OskarPraca on 2017-03-29.
 */
public class Player {
    public int score;
    public String name;
    private String lastname;

    @UsingInternet(internetGetway = "WIFI")
    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    @UsingInternet(internetGetway = "3G")
    public void setName(String name) {
        this.name = name;
    }

    public void printScore(String s) {
          System.out.println("to klasa "  + s);
    }
}
