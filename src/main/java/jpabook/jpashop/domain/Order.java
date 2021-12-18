package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    private List<OrderItem> orderItems = new ArrayList<>();
    private Delivery delivery;
    private LocalDate orderDate;//하이버 네이트가 자동으로 변경해준다함
    private  OrderStatus status;
}
