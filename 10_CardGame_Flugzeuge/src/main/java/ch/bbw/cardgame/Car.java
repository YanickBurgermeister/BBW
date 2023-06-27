package ch.bbw.cardgame;

/**
 * Car
 *    Fachklasse für ein Auto
 * @author Peter Rutschmann
 * @date 26.08.2021
 */
public class Car {
    private String imageUrl;
    private String tradeName;
    private String model;
    private double prize;
    private double velocity;
    private int baujahr;

    public Car(String imageUrl, String tradeName, String model, double prize, double velocity, int baujahr) {
        this.imageUrl = imageUrl;
        this.tradeName = tradeName;
        this.model = model;
        this.prize = prize;
        this.velocity = velocity;
        this.baujahr = baujahr;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

   public double getVelocity(){return velocity;}

    public void setVelocity(double velocity){this.velocity = velocity;}

    public int getBaujahr(){return baujahr;}

    public void setBaujahr(int baujahr){this.baujahr = baujahr;}
}
