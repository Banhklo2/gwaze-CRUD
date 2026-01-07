package com.example.gwaze.memo.dto;

import lombok.Getter;

@Getter
public class MemoCreateResponse {

    private final Long id;
    private final String text;

    public MemoCreateResponse(Long id, String text) {
        this.id = id;
        this.text = text;
    }
}
