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
@AllArgsConstructor
@NoArgsConstructor

/**
 * @author Kanchan
 * @version 1.0.0
 * @since 1.0.0
 * @apiNote This class is meant to be used by the user to create a new instance of the site.
 *
 */
public class Sites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ipOrUrl;

    private Long userId;

    private boolean status=true;//run ay paused

    private Long  reportDuration;//in day

}
