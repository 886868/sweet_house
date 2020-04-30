package com.mrle.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private Integer leve;
    private Double age;
}
