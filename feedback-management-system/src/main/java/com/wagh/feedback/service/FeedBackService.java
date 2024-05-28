package com.wagh.feedback.service;

import com.wagh.feedback.dto.FeedBackDTO;
import com.wagh.feedback.dto.ResponseDTO;
import com.wagh.feedback.entity.FeedBackEntity;

import java.util.List;

public interface FeedBackService {
    List<FeedBackEntity> getFeedBacks();

    ResponseDTO createFeedBack(FeedBackDTO feedBackDTO);
}
