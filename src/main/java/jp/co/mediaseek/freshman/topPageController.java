package jp.co.mediaseek.freshman;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class topPageController implements WebMvcConfigurer{

    @GetMapping("/")
    public String get() {
        return "topPage";
    }
}