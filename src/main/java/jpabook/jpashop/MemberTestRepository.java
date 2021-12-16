package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberTestRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(MemberTest member) {
        em.persist(member); //이게 뭐하는 역할이지?
        return member.getId();
    }

    public MemberTest find(Long id){
        return em.find(MemberTest.class, id);
    }
}
