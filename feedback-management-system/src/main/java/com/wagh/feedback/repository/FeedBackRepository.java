package com.wagh.feedback.repository;

import com.wagh.feedback.entity.FeedBack;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedBackRepository extends JpaRepository<FeedBack, Long> {
    List<FeedBack> findAllById(long id);
}
