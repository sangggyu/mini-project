package com.example.miniprojectboard.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@ToString
@Table
public class Article {
    private Long id;
    private String title;
    private String content;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAy;
    private String modifiedBy;

}
