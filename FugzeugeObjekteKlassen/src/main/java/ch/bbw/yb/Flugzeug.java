package ch.bbw.yb;
/**
 * Flugzeug
 * @author Yanick Burgermeister
 * @version 26.09.2022
 */
public class Flugzeug {
    private String model;
    private String maxGeschwindigkeit;
    private String maxFlughöhe;

    public Flugzeug(String model, String maxGeschwindigkeit, String maxFlughöhe) {
        this.model = model;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.maxFlughöhe = maxFlughöhe;

    }

    public Flugzeug() {
        model = "";
        maxGeschwindigkeit = "";
        maxFlughöhe = "";
    }
    public String getmodel() {
        return model;
    }

    public void setmodel(String minStartbahnlänge) {
        this.model = minStartbahnlänge;
    }

    public String getMaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }

    public void setMaxGeschwindigkeit(String maxGeschwindigkeit) {
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public String getMaxFlughöhe() {
        return maxFlughöhe;
    }

    public void setMaxFlughöhe(String maxFlughöhe) {
        this.maxFlughöhe = maxFlughöhe;
    }


    @Override
    public String toString() {
        return   "\nModel: " + model + "\nHöchstgeschwindigkeit: " + maxGeschwindigkeit +"km/h"+ "\nMaximale Flughöhe: " + maxFlughöhe + "m\n";
    }
}
