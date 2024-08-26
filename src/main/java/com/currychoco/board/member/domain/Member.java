package com.currychoco.board.member.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {
    private String id;
    private String password;
    private String name;
}
