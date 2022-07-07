package com.main.repo;

import com.main.model.SiteAlertContacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteAlertContactsRepository extends JpaRepository<SiteAlertContacts,Long> {
}
