package com.example.demo.Controllers;

import com.example.demo.Model.DataProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/musiclibrary/artist")
public class ArtistController {
    @Autowired
    private DataProvider dataProvider;

    @GetMapping(path = "")
    public String artistAll(Model model) {
        model.addAttribute("artists0", dataProvider.getArtistByPos(4, 0));
        model.addAttribute("artists1", dataProvider.getArtistByPos(4, 1));
        model.addAttribute("artists2", dataProvider.getArtistByPos(4, 2));
        model.addAttribute("artists3", dataProvider.getArtistByPos(4, 3));
        return "artist_page";
    }

    @GetMapping("/{name}")
    public String getOneArtist(@PathVariable("name") String name, Model model) {

        model.addAttribute("artistOne", dataProvider.findArtistByName(name));
        model.addAttribute("artistAlbums", dataProvider.findArtistByName(name).getAlbums());
        model.addAttribute("artistSingles", dataProvider.findArtistByName(name).getSingles());

        return "one_artist_page";
    }


}
