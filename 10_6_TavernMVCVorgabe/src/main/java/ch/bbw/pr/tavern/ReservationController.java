package ch.bbw.pr.tavern;

import ch.bbw.pr.tavern.model.Reservation;
import ch.bbw.pr.tavern.model.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ReservationController
 *
 * @author Peter Rutschmann
 * @version 23.03.2022
 */
@Controller
public class ReservationController {

   @Autowired
   ReservationService service ;

   @GetMapping("/addreservation")
   public String addReservation(Model model){
      Reservation newReservation = new Reservation("your name", "your prename",
              "option1", "Ihr Wunsch");
      model.addAttribute("reservation", newReservation );
      System.out.println("ReservationController.addReservation");
      return "reservationview";
   }

   @PostMapping("/addreservation")
   public String addReservationPost(@ModelAttribute("reservation") Reservation reservation){
      System.out.println("ReservationController.addReservationPost");
      service.getReservationList().add(reservation);
      return "redirect:/reservationlist";
   }

}
