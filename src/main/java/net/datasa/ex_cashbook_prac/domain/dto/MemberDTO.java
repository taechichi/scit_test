package net.datasa.ex_cashbook_prac.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDTO {
    private String memberId;
    private String memberPw;
}
