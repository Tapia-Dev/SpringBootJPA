package com.kali.jpa.service;

import com.kali.jpa.Entity.Local;
import com.kali.jpa.projection.interfacebased.open.LocalOpenView;

import java.util.List;

public interface LocalService {

    List<Local> findAll();
    List<LocalOpenView>findBy();
}
