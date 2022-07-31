package hwan.hwanshopthymeleaf.contoller;

import hwan.hwanshopthymeleaf.entity.Item;
import hwan.hwanshopthymeleaf.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ItemController {


    @Autowired
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping(value = "")
    public String homePage(Model model) {
        model.addAttribute("item", new Item());
        return "makeItem";
    }

    @RequestMapping(value = "/finditem")
    public String getItem(Model model) {
        model.addAttribute("items",itemService.getAllItem());
        return "result";
    }

    @RequestMapping(value = "/item", method = RequestMethod.POST )
    public String addItem(@ModelAttribute Item item, Model model) {
        itemService.createItem(item);
        model.addAttribute("items",itemService.getAllItem());
        return "result";
    }

    @RequestMapping(value = "/person/delete/{id}")
    public String deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
        return "/redirect:/item";
    }
}

