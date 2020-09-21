package com.example.tml_mustache.controller;

import com.example.tml_mustache.entity.Href;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class ShmeleController {

    @GetMapping("/shmele")
    public ModelAndView workTimeList(Map<String, Object> model) {

        model.put("topImage", "img/shmelik1.jpg");

        //
        List<Href> topMenu = new ArrayList<>();

        Href href = new Href();
        href.setHref("#");
        href.setText("Главная");
        topMenu.add(href);

        href = new Href();
        href.setHref("#");
        href.setText("О шмелях");
        topMenu.add(href);

        href = new Href();
        href.setHref("#");
        href.setText("Место в истории");
        topMenu.add(href);

        href = new Href();
        href.setHref("#");
        href.setText("Галерея");
        topMenu.add(href);

        href = new Href();
        href.setHref("#");
        href.setText("Координаты");
        topMenu.add(href);

        href = new Href();
        href.setHref("#");
        href.setText("Стать бжж");
        topMenu.add(href);

        model.put("topMenu", topMenu);

        //
        List<Href> leftMenu = new ArrayList<>();

        href = new Href();
        href.setHref("#");
        href.setText("Летучесть");
        leftMenu.add(href);

        href = new Href();
        href.setHref("#");
        href.setText("Навигационная система");
        leftMenu.add(href);

        href = new Href();
        href.setHref("#");
        href.setText("Сбор нектара и урожайность растений");
        leftMenu.add(href);

        href = new Href();
        href.setHref("#");
        href.setText("Грузоподъемность");
        leftMenu.add(href);

        model.put("leftMenu", leftMenu);

        //
        if (5 < (Math.random() * 10)) {
            String congratulation = "Соседняя колония, что за ромашковыми клумбами чуть южнее рябин, принимает поздравления в связи с пополнением!";
            model.put("congratulation", congratulation);
        }

        //
        String mainText = "<h1>Кто они, полосатые и пушистые насекомые</h1><br/>\n" +
                "                <p>Всего ученые насчитали более 300 видов шмелей. Появились они на Земле около 30 млн. лет назад!\n" +
                "                    Живут в северной части Евразии и Африки, в Северной Америке. Не так давно этих мохнатых насекомых\n" +
                "                    завезли в Австралию и Новую Зеландию. Они прекрасно себя чувствуют и в горах, и в лесах, и в\n" +
                "                    полях.</p>\n" +
                "                <p>Шмели — одни из самых холодостойких видов насекомых: они способны, быстро и часто сокращая мышцы\n" +
                "                    груди, ускоренно разогреть своё тело до необходимых 40 °C. Это позволяет им вылетать рано утром и собирать\n" +
                "                    первый нектар, когда воздух ещё недостаточно прогрелся. К тому же быстрое повышение температуры тела\n" +
                "                    даёт шмелям определённое конкурентное преимущество перед другими видами насекомых. Помогает шмелю\n" +
                "                    греться его «шерсть» — она уменьшает теплопотери в два раза.</p>\n" +
                "                <img class=\"img\" src=\"img/shmel9.jpg\" alt=\"bamblebee\">\n" +
                "                <fieldset class=\"sign\">Фото 1.</fieldset><br/>\n" +
                "                <br/><p>Окраска шмелей, как правило, жёлто-чёрная, часто в полоску. Кроме того, встречаются виды шмелей с\n" +
                "                    красными или оранжевыми полосами, а некоторые виды окрашены в сплошной чёрный цвет. Предполагается,\n" +
                "                    что окрас шмелей связан с необходимостью баланса между мимикрией (маскировочной или предупреждающей)\n" +
                "                    и терморегуляцией.</p>\n" +
                "                 <p>Из-за малой агрессивности шмели могут широко использоваться на садово-дачных участках.\n" +
                "                    Существует даже отрасль такая под названием <i>шмелеводство</i> — разведение шмелей для опыления сельскохозяйственных\n" +
                "                    культур с целью повышения их урожайности.</p>\n" +
                "                <p>Время появления шмелей точно не известно. Самые ранние окаменелости рода Bombus датируются\n" +
                "                    Олигоценом (38 – 26 млн лет), но время возникновения группы пока точно неизвестно. Окаменелость шмеля является\n" +
                "                    очень редкой находкой, поскольку попасть в смолу такому большому насекомому, чтобы полностью потом\n" +
                "                    быть окутанным ею и отвердеть в янтарь, очень сложно. Находки указывают на Азию, как место, где\n" +
                "                    впервые появились шмели. До сих пор в этой части света обитает наибольшее разнообразие шмелей.</p>";
        model.put("mainText", mainText);

        //
        List<Href> rightMenu = new ArrayList<>();

        href = new Href();
        href.setHref("#");
        href.setText("Полеты временно приостановленны. Прогноз не утешителен на следующие двое суток!");
        rightMenu.add(href);

        href = new Href();
        href.setHref("#");
        href.setText("Очередной рекорд дня поставил Ветролет, опередив Тягача.");
        rightMenu.add(href);

        href = new Href();
        href.setHref("#");
        href.setText("Будьте внимательны и остороржны! Через два дня стартует сезон человеков, созрела малина.");
        rightMenu.add(href);

        model.put("rightMenu", rightMenu);

        //
        List<Href> winners = new ArrayList<>();

        if (5 < (Math.random() * 10)){
            href = new Href();
            href.setHref("#");
            href.setText("Вертолет");
            winners.add(href);

            href = new Href();
            href.setHref("#");
            href.setText("Тягач");
            winners.add(href);

            href = new Href();
            href.setHref("#");
            href.setText("Обжора");
            winners.add(href);

            href = new Href();
            href.setHref("#");
            href.setText("Молния");
            winners.add(href);

            href = new Href();
            href.setHref("#");
            href.setText("Комета");
            winners.add(href);

            href = new Href();
            href.setHref("#");
            href.setText("Болтушка");
            winners.add(href);
        }

        model.put("winners", winners);

        return new ModelAndView("shmele", model);
    }
}
