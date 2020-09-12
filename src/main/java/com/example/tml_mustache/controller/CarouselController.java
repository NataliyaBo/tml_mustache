package com.example.tml_mustache.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class CarouselController {

    @GetMapping("/carousel")
    public ModelAndView workTimeList(Map<String, Object> model) {

        List<String> carouselList = new ArrayList<>();
        carouselList.add("img/shmel12a.jpg");
        carouselList.add("img/shmel1a.jpg");
        carouselList.add("img/shmel3a.jpg");
        carouselList.add("img/shmel6a.jpg");
        carouselList.add("img/shmel9a.jpg");
        carouselList.add("img/shmel10a.jpg");
        model.put("carouselList", carouselList);

        return new ModelAndView("carousel", model);
    }
}
