package ch.bbw.pr.crowdfunding.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * DonationService
 * Service with a list of Donations
 * @author Yanick Burgermeister
 * @version 27.06.2023
 */
@Service
public class DonationService {
   //the list of donations
   private List<Donation> donations = new ArrayList<>(Arrays.asList(
         new Donation("Black Widow", 120.55, "Female"),
         new Donation("Iron man", 240.99, "Male")
   ));

   public List<Donation> getDonations() {
      if (donations.isEmpty()) {
         return null;
      }
      return donations;
   }

   public void addDonation(Donation value) {
      donations.add(value);
   }

   public String getAmount() {
      double amount = 0.0;
      //TODO Aufgabe 4: implement calculation of amount
      for (Donation donation: donations){
         amount += donation.getAmount();
      }
      System.out.println(amount);
      return Double.toString(amount);
   }
}
