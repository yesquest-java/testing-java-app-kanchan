package com.main.repo;

import com.main.model.UpTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpTimeRepository extends JpaRepository<UpTime,Long> {
}
