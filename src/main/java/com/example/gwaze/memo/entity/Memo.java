package com.example.gwaze.memo.entity;

import com.example.gwaze.member.entity.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "memos")
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    public Memo(String text, Member member) {
        this.text = text;
        this.member = member;
    }
}
