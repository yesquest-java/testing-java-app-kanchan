package com.main.repo;

import com.main.dto.SiteContacts;
import com.main.model.SiteAlertContacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SiteAlertContactsRepository extends JpaRepository<SiteAlertContacts,Long> {
   @Query(value = "SELECT a.id,a.email FROM site_alert_contacts s,alert_contacts a WHERE s.site_id=:siteId AND s.alert_id=a.id",nativeQuery = true)
    List<SiteContacts> findBySiteId(Long siteId);

}
