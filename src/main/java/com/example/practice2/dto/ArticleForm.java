package com.example.practice2.dto;

import com.example.practice2.entity.Article;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Setter
public class ArticleForm {
    private Long id;
    private String title;
    private String content;

    public Article toEntity()    {
        return new Article(id, title, content);
    } ; // article을 entity로 변환하는 메서드

    }
