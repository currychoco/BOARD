package com.currychoco.board.member.repository;

import com.currychoco.board.member.domain.MemberJoinDto;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final SqlSessionTemplate sqlSession;

    public void save(MemberJoinDto member) {
        sqlSession.insert("member.save", member);
    }
}
