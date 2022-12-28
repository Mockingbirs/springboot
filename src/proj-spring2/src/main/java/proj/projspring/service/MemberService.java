package proj.projspring.service;

import proj.projspring.domain.Member;

import java.util.List;

public interface MemberService {

    public Long join(Member member);
    public List<Member> findAll();
}
