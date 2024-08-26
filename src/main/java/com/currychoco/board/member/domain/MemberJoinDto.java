package com.currychoco.board.member.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberJoinDto {
    private String id;
    private String password;
    private String name;
}
