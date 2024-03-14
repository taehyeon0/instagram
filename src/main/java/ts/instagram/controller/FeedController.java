package ts.instagram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/feeds")
@Controller
public class FeedController {

    @GetMapping
    public String feeds(ModelMap map) {
        return "feeds/index";
    }
}
