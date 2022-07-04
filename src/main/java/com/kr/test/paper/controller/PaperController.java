package com.kr.test.paper.controller;

import com.kr.test.paper.model.PaperVO;
import com.kr.test.paper.service.PaperService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController //@Controller + ResponseBody가 합쳐진 어노테이션. JSON형태로 객체 데이터 반환
@RequestMapping("/home") //  /home  URI 요청이 들어오면 맵핑
@Slf4j //로깅 라이브러리에 상관없이 같은방법으로 로그남길수있음
public class PaperController {

    @Qualifier("paperService") //
    @Autowired //
    private PaperService paperService;

    @PostMapping("/post")   //  /post URI요청시 맵핑. @RequestMapping(method=RequestMethod.POST,path="/post") 를 줄여서 표현한것
    public void postTest(@RequestBody PaperVO vo){

        paperService.insert(vo);
    }

    @GetMapping("/get/{id}") //  /get/{id} URI요청시 맵핑. @RequestMapping(method=RequestMethod.GET,path="/get") 를 줄여서 표현한것
    public List<PaperVO> getTest(@PathVariable String id){
        return paperService.select(id);
    }

    @PutMapping("/put/{id}/{name}") //  /put/{id} URI요청시 맵핑. @RequestMapping(method=RequestMethod.PUT,path="/put") 를 줄여서 표현한것
    public void putTest(@PathVariable String id, @PathVariable String name){
        paperService.update(id,name);

    }
    @DeleteMapping("/delete/{id}")//  /delete/{id} URI요청시 맵핑. @RequestMapping(method=RequestMethod.DELETE,path="/delete") 를 줄여서 표현한것
    public void deleteTest(@PathVariable String id){
        paperService.delete(id);


    }
}
