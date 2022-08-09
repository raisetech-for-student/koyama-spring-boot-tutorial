package com.raisetech.buildingarestfulwebservice.controller;

import com.raisetech.buildingarestfulwebservice.entity.Anime;
import com.raisetech.buildingarestfulwebservice.service.AnimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/anime")
public class AnimeController {

  private final AnimeService animeService;

  public AnimeController(AnimeService animeService) {
    this.animeService = animeService;
  }

  @GetMapping
  public List<Anime> getAllAnime() {
    return animeService.getAllAnime();
  }

}
