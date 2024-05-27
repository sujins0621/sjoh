package com.framework.service;

import com.framework.model.Member;
import com.framework.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(final MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long createMember(final MemberRequest request) {
        Member member = new Member(request.getEmail(), request.getName(), request.getPassword());
        return memberRepository.save(member).getId();
    }

    public MemberResponse getMemberById(final Long id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(NoSuchMemberException::new);

        return new MemberResponse(member);
    }
}