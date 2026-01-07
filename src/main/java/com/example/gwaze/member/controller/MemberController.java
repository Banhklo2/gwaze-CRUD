package com.example.gwaze.member.controller;

import com.example.gwaze.member.dto.MemberCreateRequest;
import com.example.gwaze.member.dto.MemberCreateResponse;
import com.example.gwaze.member.dto.MemberGetResopnse;
import com.example.gwaze.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/members")
    public ResponseEntity<MemberCreateResponse> create(
            @RequestBody MemberCreateRequest request
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(memberService.save(request));
    }

    @GetMapping("/members")
    public ResponseEntity<List<MemberGetResopnse>> getAll() {
        return ResponseEntity.ok(memberService.findAll());
    }

    @GetMapping("/members/{memberId}")
    public ResponseEntity<MemberGetResopnse> getOne(@PathVariable Long memberId) {
        return ResponseEntity.ok(memberService.findOne(memberId));
    }
}
