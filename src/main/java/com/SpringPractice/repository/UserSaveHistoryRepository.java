package com.SpringPractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringPractice.entity.UserSaveHistory;

public interface UserSaveHistoryRepository extends JpaRepository<UserSaveHistory, Integer> {

}
