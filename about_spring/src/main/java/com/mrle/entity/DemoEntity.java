package com.mrle.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "DemoEntity")
@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DemoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seq;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "type")
    private Type type;


}
