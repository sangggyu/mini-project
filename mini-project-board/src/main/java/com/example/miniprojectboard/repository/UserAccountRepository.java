package com.example.miniprojectboard.repository;

import com.example.miniprojectboard.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = UserAccountRepository.class)
public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}
