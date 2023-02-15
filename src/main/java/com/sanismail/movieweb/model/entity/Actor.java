package com.sanismail.movieweb.model.entity;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(schema = "main", name = "actor")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name = "idSeqActor", sequenceName = "main.actor_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSeqActor")
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "date_birth")
    private Date dateBirth;
    @Column(name = "sex", nullable = false)
    private String sex;
}
