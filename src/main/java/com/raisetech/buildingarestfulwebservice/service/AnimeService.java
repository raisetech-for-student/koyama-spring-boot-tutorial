package com.raisetech.buildingarestfulwebservice.service;

import com.raisetech.buildingarestfulwebservice.entity.Anime;
import com.raisetech.buildingarestfulwebservice.mapper.AnimeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

  private final AnimeMapper animeMapper;

  public AnimeService(AnimeMapper animeMapper) {
    this.animeMapper = animeMapper;
  }

  public List<Anime> getAllAnime() {
    List<Anime> animeList = animeMapper.findAll();
    return animeList;
  }
}
