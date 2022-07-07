package com.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

/**
 * @author Kanchan
 * @version 1.0.0
 * @since 1.0.0
 * @apiNote This class is meant to be used by the user to getAll contacts  of the site.
 *
 */
public class SiteAlertContacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long siteId;

    private Long alertId;
}
