package com.example.miniprojectboard.repository.querydsl;

import java.util.List;

public interface ArticleRepositoryCustom {
    List<String> findAllDistincHashtag();
}
