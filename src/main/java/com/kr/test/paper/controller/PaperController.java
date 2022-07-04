package com.kr.test.paper.controller;

import com.kr.test.paper.model.PaperVO;
import com.kr.test.paper.service.PaperService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


@RestController //@Controller + RequestBody가 합쳐진 어노테이션. JSON형태로 객체 데이터 반환
@RequestMapping("/home")
@Slf4j
public class PaperController {

    @Qualifier("paperService")
    @Autowired
    private PaperService paperService;

    @PostMapping("/post")
    public void postTest(@RequestBody PaperVO vo){

        paperService.insert(vo);

//        return hm;
    }
}
