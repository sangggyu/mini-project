package com.example.miniprojectboard.repository.querydsl;

import java.util.List;

public interface HashtagRepositoryCustom {
    List<String> findAllHashtagNames();
}