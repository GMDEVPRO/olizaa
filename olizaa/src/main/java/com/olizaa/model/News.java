package com.olizaa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tb_news")
public class News extends BaseItem{

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private  Long id;


    private  String icon;


    private  String description;


}
