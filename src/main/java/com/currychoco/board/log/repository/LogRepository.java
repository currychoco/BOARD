package com.currychoco.board.log.repository;

import lombok.AllArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class LogRepository {

    private final SqlSessionTemplate sqlSessionTemplate;
}
