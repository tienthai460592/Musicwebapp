package com.example.demo.Controllers;

import com.example.demo.Model.DataProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/musiclibrary/genre")
public class GenreController {

    @Autowired
    private DataProvider dataProvider;

    @GetMapping(path = "")
    public String genreAll(Model model) {
        model.addAttribute("genres0", dataProvider.getGenreByPos(4, 0));
        model.addAttribute("genres1", dataProvider.getGenreByPos(4, 1));
        model.addAttribute("genres2", dataProvider.getGenreByPos(4, 2));
        model.addAttribute("genres3", dataProvider.getGenreByPos(4, 3));
        return "genre_page";
    }

    @GetMapping("/{name}")
    public String getOneGenre(@PathVariable("name") String name, Model model) {
        model.addAttribute("genreOne", dataProvider.findGenreByName(name));
        return "one_genre_page";
    }
}
