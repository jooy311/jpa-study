package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Getter @Setter
public class MemberTest {

    @Id @GeneratedValue
    private Long id;
    private String username;

}
