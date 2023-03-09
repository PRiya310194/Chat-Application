package com.example.chatApplication.dao;

import com.example.chatApplication.model.Status;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepository extends JpaRepository<Status,Integer> {

}
