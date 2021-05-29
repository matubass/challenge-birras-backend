package com.santander.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santander.models.Meet;

public interface MeetRepository extends JpaRepository<Meet, Long> {

}