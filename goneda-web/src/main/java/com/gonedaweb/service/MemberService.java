package com.gonedaweb.service;

import com.gonedacore.model.Member;
import com.gonedacore.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Long signUp(Member member) {
        System.out.println("signUp Start!");
        return memberRepository.save(member).getId();
    }
}
