package com.projectboard.boardproject.repository;

import com.projectboard.boardproject.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}
