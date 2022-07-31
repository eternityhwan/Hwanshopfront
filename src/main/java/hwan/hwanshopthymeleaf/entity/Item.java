package hwan.hwanshopthymeleaf.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Item {

    @Id // primary key 값을 생성
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String itemName;
    @Column(name = "stock")
    private String itemNumber;
}

