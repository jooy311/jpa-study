package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Getter
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")//얘가 연관관계의 주인
    private Member member;
}
