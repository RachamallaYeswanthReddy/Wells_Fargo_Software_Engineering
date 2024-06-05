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
public class portfolio {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long portfolioId;

        @ManyToOne
        @JoinColumn(name = "client_id")
        private  client clientId;
}
