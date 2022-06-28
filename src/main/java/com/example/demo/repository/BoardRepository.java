package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {
    List<String> getBoardList();
}
