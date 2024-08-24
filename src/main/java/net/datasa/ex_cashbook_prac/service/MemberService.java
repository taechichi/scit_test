package net.datasa.ex_cashbook_prac.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import net.datasa.ex_cashbook_prac.domain.dto.MemberDTO;
import net.datasa.ex_cashbook_prac.domain.entity.MemberEntity;
import net.datasa.ex_cashbook_prac.repository.MemberRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final BCryptPasswordEncoder passwordEncoder;
    private final MemberRepository memberRepository;

    // ===============================================
    // ==== Join ====
    public void join(MemberDTO dto) {
        MemberEntity entity = MemberEntity.builder()
                .memberId(dto.getMemberId())
                .memberPw(passwordEncoder.encode(dto.getMemberPw()))
                .build();


        memberRepository.save(entity);
    }
    // ==== Join ====
    // ===============================================
}
