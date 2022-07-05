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
public class PaperController { //PaperController 클래스

    @Qualifier("paperService") // 타입이 겹칠시 해당 조건에 만족하는 객체를 주입
    @Autowired // 자동으로 의존성주입. new 키워드를 필요없게해주어서 초기화하지않고 호출할수있게해줌
    private PaperService paperService; //PaperService객체생성

    @PostMapping("/post")   //  /post URI요청시 맵핑. @RequestMapping(method=RequestMethod.POST,path="/post") 를 줄여서 표현한것
    public void postTest(@RequestBody PaperVO vo){ //Body에 담아서 PaperVO타입의 vo매개변수를 받아주는 메소드. void타입이라 return이없음
        paperService.insert(vo); // PaperService클래스의 insert 매소드에 vo 매개변수를 넘겨줌
    }

    @GetMapping("/get/{id}") //  /get/{id} URI요청시 맵핑. @RequestMapping(method=RequestMethod.GET,path="/get") 를 줄여서 표현한것
    public List<PaperVO> getTest(@PathVariable String id){ //List<PaperVO>타입의 getTest메소드임. @PathVariable을 사용하여 URI에 변수를 넣어줌
        return paperService.select(id); // PaperService클래스의 select 매소드에 id 매개변수를 넘겨줌
    }

    @PutMapping("/put/{id}/{name}") //  /put/{id} URI요청시 맵핑. @RequestMapping(method=RequestMethod.PUT,path="/put") 를 줄여서 표현한것
    public void putTest(@PathVariable String id, @PathVariable String name){ //void타입의 putTest메소드임. .@PathVariable을 사용하여 URI에 변수를 넣어줌
        paperService.update(id,name); // PaperService클래스의 update 매소드에 id와 name 매개변수를 넘겨줌

    }
    @DeleteMapping("/delete/{id}")//  /delete/{id} URI요청시 맵핑. @RequestMapping(method=RequestMethod.DELETE,path="/delete") 를 줄여서 표현한것
    public void deleteTest(@PathVariable String id){ //void타입의 deleteTest메소드임 @PathVariable을 사용하여 URI에 변수를 넣어줌
        paperService.delete(id); // PaperService클래스의 delete 매소드에 id 매개변수를 넘겨줌.


    }
}
