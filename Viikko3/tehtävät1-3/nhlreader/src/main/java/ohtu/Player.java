
package ohtu;

public class Player implements Comparable {
    private String name;
    private int assists;
    private int goals;
    private String nationality;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getScore(){
        return goals+assists;
    }

    @Override
    public String toString() {
        return name+" syötöt:"+assists+" maalit:"+goals+" tehot:"+(goals+assists);
    }

    @Override
    public int compareTo(Object t) {
        int comparescore=((Player)t).getScore();
        
        return comparescore-this.getScore();    }

      
}
