package cn.awalol.blrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author awalo
 * @date 2021/2/23
 */
@Controller
public class IndexController {

    @GetMapping({"/","/index","/index.html"})
    public String index(Model model){
        model.addAttribute("page","index");
        model.addAttribute("image","http://i0.hdslb.com/bfs/live/202102/a73ff9e74b39c4fba52d83ae6bbcf1d9b4c19669.jpg");
        return "index";
    }
}
