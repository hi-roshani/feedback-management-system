package com.wagh.feedback.repository;

import com.wagh.feedback.entity.FeedBackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface FeedBackRepository extends JpaRepository<FeedBackEntity, Long> {

    @Query(value = "(SELECT * FROM feedback f WHERE f.id = ?1)", nativeQuery = true)
    List<FeedBackEntity> findById(long id);
}
