package com.gonedaweb.service;

import com.gonedacore.model.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MemberServiceTest {
    @Autowired
    MemberService memberService;

    @Test
    @DisplayName("signUp test")
    void signUp() {
        Member member = new Member("LeeJuHyung");
        Long id = memberService.signUp(member);

        assertThat(id).isEqualTo(1);
    }
}
