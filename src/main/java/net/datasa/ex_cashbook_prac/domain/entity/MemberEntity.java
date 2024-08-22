package net.datasa.ex_cashbook_prac.domain.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "cashbook_member_prac")
public class MemberEntity {

    @Id
    @Column(name = "member_id", length = 30)
    private String memberId;

    @Column(name = "member_pw", length = 100, nullable = false)
    private String memberPw;
}
