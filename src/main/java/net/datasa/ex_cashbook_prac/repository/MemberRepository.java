package net.datasa.ex_cashbook_prac.repository;

import net.datasa.ex_cashbook_prac.domain.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, String> {
}
