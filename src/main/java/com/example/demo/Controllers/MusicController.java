package com.example.demo.Controllers;

import com.example.demo.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/musiclibrary/browse")

public class MusicController {

    @Autowired
    private DataProvider dataProvider;

    @GetMapping(path = "")
    public String getMusic(Model model) {

        model.addAttribute("musics", dataProvider.getMusic());

        return "browsing_page";
    }

    @GetMapping("/")
    public String searchMusic(Model model, @RequestParam("search") String search, HttpServletResponse response) {

        model.addAttribute("searchSongs", dataProvider.searchMusicByName(search));
        response.addCookie(new Cookie("lastsearch", "" + search.replaceAll("\\s+","+")));
        return "search_result_page";
    }


    @GetMapping("/album/{name}")
    public String getAlbum(@PathVariable("name") String name, Model model) {
        Album music = (Album) dataProvider.findMusicByName(name);
        model.addAttribute("albumOne", music);
        return "one_album_page";

    }

    @GetMapping("/single/{name}")
    public String getSingle(@PathVariable("name") String name, Model model) {
        Single music = (Single) dataProvider.findMusicByName(name);
        model.addAttribute("singleOneSong", music);
        return "one_single_page";

    }

}
