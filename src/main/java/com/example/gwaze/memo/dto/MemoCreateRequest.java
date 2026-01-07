package com.example.gwaze.memo.dto;

import lombok.Getter;

@Getter
public class MemoCreateRequest {

    private String text;
    private Long memberId;
}
