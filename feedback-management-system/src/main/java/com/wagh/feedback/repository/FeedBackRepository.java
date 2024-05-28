package com.wagh.feedback.repository;

import com.wagh.feedback.entity.FeedBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FeedBackRepository extends JpaRepository<FeedBack, Long> {

    @Query(value = "select * from feedback where id = ?1", nativeQuery = true)
    List<FeedBack> findById(long id);
}
