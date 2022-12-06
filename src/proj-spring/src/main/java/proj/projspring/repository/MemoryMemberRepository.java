package proj.projspring.repository;

import proj.projspring.domain.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{
    private Map<Long, Member> store = new HashMap<>();
    private long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
