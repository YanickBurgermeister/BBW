package ch.bbw.yb;

/**
 * Car
 * @author Yanick Burgermeister
 * @version 13.09.2022
 */

public class Car {
    private String marke;
    private String beschleunigung;
    private String preis;
    private String geschwindigkeit;

    public Car(String marke, String beschleunigung, String preis, String geschwindigkeit){
        this.marke = marke;
        this.beschleunigung = beschleunigung;
        this.preis = preis;
        this.geschwindigkeit = geschwindigkeit;

    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getBeschleunigung() {
        return beschleunigung;
    }

    public void setBeschleunigung(String beschleunigung) {
        this.beschleunigung = beschleunigung;
    }

    public String getPreis() {
        return preis;
    }

    public void setPreis(String preis) {
        this.preis = preis;
    }

    public String getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(String geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marke='" + marke + '\'' +
                ", beschleunigung=" + beschleunigung +
                ", preis=" + preis +
                ", Geschwindigkeit=" + geschwindigkeit +
                '}';
    }
}
