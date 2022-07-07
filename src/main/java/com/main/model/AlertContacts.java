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
 * @apiNote This class is meant to be used by the user to add a new instance of the contact model for user accounts.
 *
 */
public class AlertContacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private Long userId;

}
