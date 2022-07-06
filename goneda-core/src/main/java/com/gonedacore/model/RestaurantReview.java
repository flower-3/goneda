package com.gonedacore.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Entity
public class RestaurantReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(targetEntity = Restaurant.class)
    @JoinColumn(name="restaurant_id")
    private Restaurant restaurant;

    @Column(nullable = false)
    private String reviewDate;

    @Column(nullable = true)
    private String grade;

    @Lob
    @Column(nullable = false)
    private String reviewContent;

    @Column(nullable = false)
    private boolean isUserActualEat;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createAt;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updateAt;

}
