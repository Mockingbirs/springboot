package proj.projspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.projspring.domain.Member;
import proj.projspring.repository.MemoryMemberRepository;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemoryMemberRepository repository;
    @Override
    public Long join(Member member) {

        repository.save(member);
        return member.getId();
    }

    @Override
    public List<Member> findAll() {
        repository.findAll();
        return null;
    }


}
