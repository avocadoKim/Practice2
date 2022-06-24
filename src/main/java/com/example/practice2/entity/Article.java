package com.example.practice2.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // DB가 해당 객체를 인식 가능
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Article {

    @Id // 대표값 지정
    @GeneratedValue // 자동 생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;


}
