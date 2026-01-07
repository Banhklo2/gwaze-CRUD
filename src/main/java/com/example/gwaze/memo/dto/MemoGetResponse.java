package com.example.gwaze.memo.dto;

import lombok.Getter;

@Getter
public class MemoGetResponse {

    private final Long id;
    private final String text;
    private final Long memberId;
    private final String memberName;

    public MemoGetResponse(Long id, String text, Long memberId, String memberName) {
        this.id = id;
        this.text = text;
        this.memberId = memberId;
        this.memberName = memberName;
    }
}
