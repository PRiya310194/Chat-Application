package com.example.chatApplication.service;

import com.example.chatApplication.dao.StatusRepository;
import com.example.chatApplication.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {
    @Autowired
    private StatusRepository statusRepository;

    public int saveStatus(Status status) {
        Status statusObj = statusRepository.save(status);
        return statusObj.getStatusId();
    }
}