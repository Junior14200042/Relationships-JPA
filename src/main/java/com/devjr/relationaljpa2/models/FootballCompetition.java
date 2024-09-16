package com.devjr.relationaljpa2.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FootballCompetition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name="start_date", columnDefinition = "DATE")
    private LocalDate startDate;
    @Column(name="end_date",columnDefinition = "DATE")
    private LocalDate endDate;


}
