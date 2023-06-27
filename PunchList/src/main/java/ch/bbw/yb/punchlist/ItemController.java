package ch.bbw.yb.punchlist;

import ch.bbw.yb.punchlist.model.PunchListItem;
import ch.bbw.yb.punchlist.model.PunchListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @autor Yanick Burgermeister
 * @version 26.06.23
 */

@Controller
public class ItemController {

    @Autowired
    private PunchListService punchListService;

    @GetMapping("/")
    @RequestMapping(value = {"/", "/addEntry"}, method = RequestMethod.GET)
    public String addEntry(Model model) {
        model.addAttribute("item", new PunchListItem());
        model.addAttribute ( "punchlist" , punchListService.getList());
        return ("punchlistview");
    }

    @GetMapping("/showList")
    public String showList(Model model) {
        model.addAttribute("item", new PunchListItem());
        model.addAttribute ( "punchlist" , punchListService.getList());
        return ("listview");
    }

    @PostMapping("/addEntry")
    private String addEntryPost(@ModelAttribute("item")PunchListItem item, Model model){
        punchListService.getList().add(item);
        model.addAttribute("item", new PunchListItem());
        model.addAttribute ( "punchlist" , punchListService.getList());
        return ("redirect:/");
    }
}
