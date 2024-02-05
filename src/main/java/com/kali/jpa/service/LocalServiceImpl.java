package com.kali.jpa.service;

import com.kali.jpa.Entity.Local;
import com.kali.jpa.projection.interfacebased.open.LocalOpenView;
import com.kali.jpa.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalServiceImpl implements  LocalService {

    @Autowired
    LocalRepository localRepository;
    @Override
    public List<Local> findAll() {

        return localRepository.findAll();
    }

    @Override
    public List<LocalOpenView> findBy() {
        return localRepository.findBy();
    }
}
