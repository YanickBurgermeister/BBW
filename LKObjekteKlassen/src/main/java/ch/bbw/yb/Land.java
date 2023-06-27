package ch.bbw.yb;

/**
 * Land
 * @author Yanick Burgermeister
 * @version 04.10.2022
 *
 */
public class Land {
    public String fläche;
    public int alter;
    public String name;

    public Land(String fläche, int alter, String name) {
        this.fläche = fläche;
        this.alter = alter;
        this.name = name;
    }

    public Land(){
        fläche = "";
        alter = 0;
        name = "";
    }

    public String getFläche() {
        return fläche;
    }

    public void setFläche(String fläche) {
        this.fläche = fläche;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nName: "+name+"\nFläche: "+fläche+"\nAlter: "+alter+"\n";
    }
}
