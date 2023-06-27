package ch.bbw.pr.crowdfunding.model;

/**
 * Donation
 * A single donation (Spende)
 * @author Yanick Burgermeister
 * @version 27.06.2023
 */
public class Donation {
   private String donor = "none";
   private double amount = 0.0;
   private String gender;

   public Donation() {
      super();
   }

   public Donation(String donor, double amount, String gender) {
      this.donor = donor;
      this.amount = amount;
      this.gender = gender;
   }

   public String getDonor() {
      return donor;
   }

   public void setDonor(String donor) {
      this.donor = donor;
   }

   public double getAmount() {
      return amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }



   @java.lang.Override
   public java.lang.String toString() {
      return "Donation{" +
            "donor='" + donor + '\'' +
            ", amount=" + amount +
            '}';
   }
}
