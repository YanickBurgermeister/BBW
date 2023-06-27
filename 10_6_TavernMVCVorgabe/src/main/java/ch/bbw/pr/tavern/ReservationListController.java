package ch.bbw.pr.tavern;

import ch.bbw.pr.tavern.model.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservationListController {

    private final ReservationService service ;
    @Autowired
    public ReservationListController ( ReservationService service) {
        this . service = service;
    }

    @GetMapping("/reservationlist")
    public String showReservationlist(Model model){
        System.out.println("ReservationListController.showReservationlist");
        model.addAttribute("reservationlist", service.getReservationList());
        return "reservationlistview";
    }

}
