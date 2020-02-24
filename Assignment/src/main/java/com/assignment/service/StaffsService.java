package com.assignment.service;

import com.assignment.model.Staffs;

import java.util.Optional;

public interface StaffsService {
    Iterable<Staffs> findAll();

    Optional<Staffs> findById(String id);

    void save(Staffs staffs);

    void remove(String id);
}
