package proj.projspring.repository;

import org.springframework.stereotype.Repository;
import proj.projspring.domain.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemoryMemberRepository implements MemberRepository{
    //private Map<Long, Member> store = new HashMap<>();
    private List<Member> store = new ArrayList<>();
    private long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        //store.put(member.getId(), member);
        store.add(member);
        return member;
    }

    @Override
    public List<Member> findAll() {
        return store;
    }
}
