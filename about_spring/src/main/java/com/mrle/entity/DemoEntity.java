package com.mrle.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "T_MENU")
@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DemoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seq;

    @Enumerated
    @Column(nullable = false)
    private Color color;


}
