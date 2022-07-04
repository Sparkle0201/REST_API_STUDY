package com.kr.test.paper.mapper;

import com.kr.test.paper.model.PaperVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaperMapper {
      void insertaa(PaperVO vo);
}
