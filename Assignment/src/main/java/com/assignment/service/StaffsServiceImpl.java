package com.assignment.service;

import com.assignment.model.Staffs;
import com.assignment.responsitory.StaffResponsitory;
import com.assignment.service.StaffsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
public class StaffsServiceImpl implements StaffsService {
    @Autowired
    private StaffResponsitory staffResponsitory;

    @Override
    public Iterable<Staffs> findAll() {
        return staffResponsitory.findAll();
    }

    @Override
    public Optional<Staffs> findById(String Id) {
        return staffResponsitory.findById(Id);
    }

    @Override
    public void save(Staffs staffs) {
        staffResponsitory.save(staffs);
    }

    @Override
    public void remove(String Id) {
        staffResponsitory.deleteById(Id);
    }
}
