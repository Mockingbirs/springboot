package proj.projspring.service;

import org.springframework.stereotype.Repository;
import proj.projspring.domain.Member;

import java.util.List;


@Repository
public interface MemberService {

    public Long join(Member member);

    public List<Member> findAll();
}
