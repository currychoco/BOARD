package com.currychoco.board.member.controller;

import com.currychoco.board.member.domain.MemberJoinDto;
import com.currychoco.board.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    @GetMapping("/join")
    public String join() {
        return "join";
    }

    @ResponseBody
    @PostMapping("/join")
    public void joinMember(@RequestBody MemberJoinDto member) {
        memberService.saveMember(member);
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
