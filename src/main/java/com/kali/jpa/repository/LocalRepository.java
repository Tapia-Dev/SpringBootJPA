package com.kali.jpa.repository;

import com.kali.jpa.Entity.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends JpaRepository<Local,Long> {
}
