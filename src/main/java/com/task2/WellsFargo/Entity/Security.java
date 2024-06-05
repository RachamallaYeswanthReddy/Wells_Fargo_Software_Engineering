package com.task2.WellsFargo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int secuirtyId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private  portfolio portfolioId;


    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private BigDecimal purchasePrice;

    @Column(nullable = false)
    private int quantity;


}
