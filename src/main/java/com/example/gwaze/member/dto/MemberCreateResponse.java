package com.example.gwaze.member.dto;

import lombok.Getter;

@Getter
public class MemberCreateResponse {

    private final Long id;
    private final String name;

    public MemberCreateResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
