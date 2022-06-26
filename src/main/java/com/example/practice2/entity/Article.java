package com.example.practice2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity // DB가 해당 객체를 인식 가능 (해당 클래스가 테이블을 만든다)
@AllArgsConstructor
@ToString
@NoArgsConstructor // 디폴트 생성자 추가
@Getter
public class Article {


    @Id // 대표값 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    public void patch (Article article) {
        if (article.title != null) {
            this.title = article.title;
        }
    }

}
