package com.kr.test.paper.service;

import com.kr.test.paper.mapper.PaperMapper;
import com.kr.test.paper.model.PaperVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperService {

    @Autowired
    private PaperMapper paperMapper;

    public void insert(PaperVO vo) {

        paperMapper.insert(vo);
    }

    public List<PaperVO> select(String id) {

        return paperMapper.select(id);
    }

    public void update(String id, String name) {

        paperMapper.update(id, name);
    }

    public void delete(String id) {
        paperMapper.delete(id);
    }
}
