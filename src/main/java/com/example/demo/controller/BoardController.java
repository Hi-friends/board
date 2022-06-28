package com.example.demo.controller;

import com.example.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/v1/boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    /**
     * 게시판 목록 조회
     *
     * @author hjkim
     * @param
     * @return List<String> 게시판 목록
     */
    @GetMapping(value="")
    public List<String> getBoardList() {

        return boardService.getBoardList();
    }
}
