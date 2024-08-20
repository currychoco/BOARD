package com.currychoco.board.log.controller;

import com.currychoco.board.log.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LogController {

    @GetMapping("/join")
    public String join() {
        return "join";
    }

    @ResponseBody
    @PostMapping("/join")
    public void joinMember(@RequestBody Member member) {

    }
}
