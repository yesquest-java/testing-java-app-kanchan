package com.main.repo;

import com.main.model.MyMainModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyMainRepo extends JpaRepository<MyMainModel,Long> {
}
