package com.task2.WellsFargo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column(nullable = false)
    private String clientName;

    @Column(unique = true,nullable = false)
    private String clientEmail;

    @OneToOne
    @JoinColumn(name = "advisior_id")
    private financialAdvisor advisiorId;
}
