package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
@Table(name = "Category")
public class Categories {

    @Id @GeneratedValue
    @Column(name = "category_id")
    private Long id;
    private String name;
    //private
}
