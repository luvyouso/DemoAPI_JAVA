package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRespository extends JpaRepository<Account, Integer> {

    List<Account> findByUsernameContainingOrPasswordContaining(String text, String textAgain);

	Account findByUsernameAndPassword(String username, String password);

    boolean existsByUsername(@Param("username") String username);

}