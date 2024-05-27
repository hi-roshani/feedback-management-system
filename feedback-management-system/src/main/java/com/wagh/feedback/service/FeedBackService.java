package com.wagh.feedback.service;

import com.wagh.feedback.dto.FeedBackDTO;
import com.wagh.feedback.dto.ResponseDTO;
import com.wagh.feedback.entity.FeedBack;

import java.util.List;

public interface FeedBackService {
    List<FeedBack> getFeedBacks();

    ResponseDTO createFeedBack(FeedBackDTO feedBackDTO);
}
