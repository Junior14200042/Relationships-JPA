package com.devjr.relationaljpa2.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Column(name="last_name")
    private String lastname;
    private String nationality;
    private Integer age;
    private String position;

    @ManyToOne(targetEntity = Club.class)
    @JoinColumn(name="id_club")
    private Club club;
}
