package com.sanismail.movieweb.model.entity;


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
@Table(schema = "main", name = "image")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name = "idSeqImage", sequenceName = "main.image_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSeqImage")
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "image", nullable = false)
    private Byte[] image;
    @Column(name = "movie_id", nullable = false)
    private Integer movieId;
}
