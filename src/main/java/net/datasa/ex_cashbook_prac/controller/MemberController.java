package net.datasa.ex_cashbook_prac.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datasa.ex_cashbook_prac.domain.dto.MemberDTO;
import net.datasa.ex_cashbook_prac.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("member")
@Slf4j
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("join")
    public String joinEnter() {
        log.debug("joinEnter method called.");
        return "joinForm";
    }

    @PostMapping("join")
    public String join(
            @ModelAttribute MemberDTO dto
            ) {
        log.debug("join method called.");
        log.debug("dto: {}", dto);
        memberService.join(dto);
        return "redirect:/";
    }

    // ============================
    // ==== LOGIN ====
    @GetMapping("loginForm")
    public String LoginFormEnter() {
        log.debug("loginFormEnter method called.");
        return "loginForm";
    }
    // ==== LOGIN ====
    // ============================
}
