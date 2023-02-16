package com.sanismail.movieweb.model.entity;


import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(schema = "main", name = "genre")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Genre {
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name = "idSeqGenre", sequenceName = "main.genre_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSeqGenre")
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(
            schema = "main",
            name = "movie_genre",
            joinColumns = @JoinColumn(name = "genre_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    Set<Movie> movies;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Genre{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
//        sb.append(", movies=").append(movies);
        sb.append('}');
        return sb.toString();
    }
}
