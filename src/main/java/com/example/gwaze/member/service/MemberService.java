package com.example.gwaze.member.service;

import com.example.gwaze.member.dto.MemberCreateRequest;
import com.example.gwaze.member.dto.MemberCreateResponse;
import com.example.gwaze.member.dto.MemberGetResopnse;
import com.example.gwaze.member.entity.Member;
import com.example.gwaze.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberCreateResponse save(MemberCreateRequest request) {
        Member member = new Member(request.getName());
        Member savedMember = memberRepository.save(member);
        return new MemberCreateResponse(savedMember.getId(), savedMember.getName());
    }

    @Transactional(readOnly = true)
    public List<MemberGetResopnse> findAll() {
        List<Member> members = memberRepository.findAll();
        List<MemberGetResopnse> dtos = new ArrayList<>();
        for (Member member : members) {
            MemberGetResopnse dto = new MemberGetResopnse(member.getId(), member.getName());
            dtos.add(dto);
        }
        return dtos;
    }

    @Transactional
    public MemberGetResopnse findOne(Long memberId) {
        Member member = memberRepository.findById(memberId).orElseThrow(
                () -> new IllegalStateException("없는 멤버입니다.")
        );
        return new MemberGetResopnse(member.getId(), member.getName());
    }
}
