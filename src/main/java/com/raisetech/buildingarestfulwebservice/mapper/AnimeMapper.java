package com.raisetech.buildingarestfulwebservice.mapper;

import com.raisetech.buildingarestfulwebservice.entity.Anime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnimeMapper {

  @Select("SELECT * FROM anime")
  List<Anime> findAll();
}
