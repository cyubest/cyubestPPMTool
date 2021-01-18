package com.auca.ProjectRevise.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Celestine on 18/01/2021.
 */
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Projectname;
    private String projectDescription;
    private String projectIdentifier;
    private Date start_Date;
    private Date end_date;

}
