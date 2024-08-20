package com.currychoco.board.log.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Member {
    private String id;
    private String password;
    private String name;
}
