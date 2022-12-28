package proj.projspring.repository;

import proj.projspring.domain.Member;

import java.util.List;

public interface MemberRepository {
    Member save(Member member);
    List<Member> findAll();
}
