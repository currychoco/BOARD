package com.currychoco.board.member.service;

import com.currychoco.board.member.domain.MemberJoinDto;
import com.currychoco.board.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void saveMember(MemberJoinDto member) {
        String hashedPassword = DigestUtils.sha256Hex(member.getPassword());
        MemberJoinDto memberJoinDto =  new MemberJoinDto(member.getId(), hashedPassword, member.getNickname());
        memberRepository.save(memberJoinDto);
    }
}
