package a.com.controller;

import a.com.po.Items;
import a.com.service.ItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Resource
    private ItemsService itemsService;

    //查询所有商品并回显到itemsList.jsp页面
    @RequestMapping("/itemsList.do")
    public String itemsList(Model model) {
        List<Items> list = itemsService.findAllItems();
        model.addAttribute("itemsList", list);
        return "itemsList";
    }

    //跳转到修改页面
    @RequestMapping("/edit.do")
    public String edit(Integer id, Model model) {
        Items items = itemsService.findItemsById(id);
        model.addAttribute("item",items);
        return "editItem";
    }

    @RequestMapping("/saveAndUpdata.do")
    public String saveAndUpdata(Items item){
        itemsService.saveAndUpdata(item);
        return "redirect:itemsList.do";
    }
}
