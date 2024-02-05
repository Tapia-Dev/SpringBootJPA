package com.kali.jpa.repository;

import com.kali.jpa.Entity.Local;
import com.kali.jpa.projection.interfacebased.open.LocalOpenView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalRepository extends JpaRepository<Local,Long> {

    List<LocalOpenView>findBy();
}
