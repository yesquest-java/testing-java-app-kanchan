package com.main.repo;

import com.main.model.Sites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SitesRepository extends JpaRepository<Sites,Long> {
    List<Sites> findByUserId(Long userId);
}
