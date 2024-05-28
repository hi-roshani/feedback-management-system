package com.wagh.feedback.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name="feedback")
public class FeedBackEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="user_id", nullable = false)
    private Long userId;

    @Column(name="comment")
//    @Size(min = 5, message = "Comment should have at least 5 characters")
//    @Size(max = 200, message = "Character limit exceeded")
    private String comments;

    @Column(name="ratings", nullable = false)
    private Integer ratings;
}
