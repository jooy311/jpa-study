package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "orderItem_id")
    private Long id;
    private Item item;

    @OneToMany
    private Order order;

    private int orderPrice;
    private int count;

}
