package com.example.bankapp.repository;

import com.example.bankapp.entity.Account;
import com.fasterxml.jackson.core.format.InputAccessor.Std;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
  }

