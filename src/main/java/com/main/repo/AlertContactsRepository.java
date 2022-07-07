package com.main.repo;

import com.main.model.AlertContacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlertContactsRepository extends JpaRepository<AlertContacts,Long> {
    List<AlertContacts> findByUserId(Long userId);
}
