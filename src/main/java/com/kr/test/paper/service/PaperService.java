package com.kr.test.paper.service;

import com.kr.test.paper.mapper.PaperMapper;
import com.kr.test.paper.model.PaperVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaperService {

    @Autowired
    private PaperMapper paperMapper;

    public void insert(PaperVO vo) {

        System.out.println("test");
        paperMapper.insertaa(vo);

    }

}
