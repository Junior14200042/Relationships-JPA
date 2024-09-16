package com.devjr.relationaljpa2.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(targetEntity = Coach.class,cascade = CascadeType.PERSIST)
    private Coach coach;

    @OneToMany(targetEntity = Player.class,fetch = FetchType.LAZY,mappedBy = "club")
    private List<Player> players;

    @ManyToOne(targetEntity = FootballAsociation.class)
    @JoinColumn(name="id_footballAsociation")
    private FootballAsociation footballAsociation;

    @ManyToMany(targetEntity = FootballCompetition.class, fetch = FetchType.LAZY)
    @JoinTable(name = "club_competitions")

    private List<FootballCompetition> footballCompetitions;
}
