package com.kr.test.paper.mapper;

import com.kr.test.paper.model.PaperVO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface PaperMapper {
      void insert(PaperVO vo);

      List<PaperVO> select(String id);

      void update(String id, String name);

      void delete(String id);
}
