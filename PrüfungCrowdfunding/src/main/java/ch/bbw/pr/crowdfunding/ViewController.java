package ch.bbw.pr.crowdfunding;

import ch.bbw.pr.crowdfunding.model.Donation;
import ch.bbw.pr.crowdfunding.model.DonationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * ViewController
 * The controller for the requests
 * @author Yanick Burgermeister
 * @version 27.06.2023
 */
@Controller
public class ViewController {
   @Autowired
   private DonationService donationService;

   @RequestMapping(value = {"/", "/newdonation"}, method = RequestMethod.GET)
   public String getDonation(Model model) {
      System.out.println("ViewController.getDonation: " + donationService.getDonations());
      model.addAttribute("item", new Donation());
      model.addAttribute ( "donationlist" , donationService.getDonations());
      model.addAttribute ( "amount" , donationService.getAmount());
      return "crowdfunding";
   }

   @PostMapping("/newdonation")
   public String postDonation(@ModelAttribute("item")Donation item, Model model) {
      System.out.println("ViewController.postDonation");
      donationService.getDonations().add(item);
      model.addAttribute("item", new Donation());
      model.addAttribute ( "donationlist" , donationService.getDonations());
      model.addAttribute ( "amount" , donationService.getAmount());
      return "crowdfunding";
   }

   @GetMapping("/deleteLast")
   public String deleteLast(Model model){
      System.out.println("delete");
      donationService.getDonations().remove(donationService.getDonations().size() - 1);
      model.addAttribute("item", new Donation());
      model.addAttribute ( "donationlist" , donationService.getDonations());
      model.addAttribute ( "amount" , donationService.getAmount());
      return "crowdfunding";
   }
}
