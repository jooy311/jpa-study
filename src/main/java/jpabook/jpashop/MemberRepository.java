package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member); //이게 뭐하는 역할이지?
        return member.getId();
    }

    public Member find(Long id){
        return em.find(Member.class, id);
    }
}
