package com.task2.WellsFargo.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class financialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int advisiorId;

    @Column(nullable = false)
    private String name;

    @Column(unique = true,nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;

}
