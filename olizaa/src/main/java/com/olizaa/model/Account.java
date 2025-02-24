package com.olizaa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private  String number;


    private String agency;

    @Column(scale = 13, precision = 2)
    private  String balance;

    @Column(name = "addicional_limit", scale = 13, precision = 2)
    private BigDecimal limit;


}
