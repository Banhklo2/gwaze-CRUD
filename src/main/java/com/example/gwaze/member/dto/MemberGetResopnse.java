package com.example.gwaze.member.dto;

import lombok.Getter;

@Getter
public class MemberGetResopnse {

    private final Long id;
    private final String name;

    public MemberGetResopnse(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
