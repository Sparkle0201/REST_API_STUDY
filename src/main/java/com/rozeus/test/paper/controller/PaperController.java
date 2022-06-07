package com.rozeus.test.paper.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/image")
public class PaperController {

    @PostMapping(path="")
    public void imageBlur(@RequestParam("image") List<MultipartFile> files){

        System.out.println("aaaaaaaaaaaaaaaaaaa");

    }

    @GetMapping(path="")
    public void getImageBlur(){

        System.out.println("aaaaaaaaaaaaaaaaaaa");

    }



}
