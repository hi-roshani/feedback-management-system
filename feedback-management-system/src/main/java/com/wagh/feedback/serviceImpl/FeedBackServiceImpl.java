package com.wagh.feedback.serviceImpl;

import com.wagh.feedback.dto.FeedBackDTO;
import com.wagh.feedback.dto.ResponseDTO;
import com.wagh.feedback.entity.FeedBack;
import com.wagh.feedback.repository.FeedBackRepository;
import com.wagh.feedback.service.FeedBackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
public class FeedBackServiceImpl implements FeedBackService {

    @Autowired
    FeedBackRepository feedBackRepository;

    @Override
    public List<FeedBack> getFeedBacks() {
        return feedBackRepository.findAll();
    }

    @Override
    public ResponseDTO createFeedBack(FeedBackDTO feedBackDTO) {
        FeedBack feedBack = new FeedBack();

        feedBack.setUserId(feedBackDTO.getUserId());
        feedBack.setComments(feedBackDTO.getComments());
        feedBack.setRatings(feedBack.getRatings());
        feedBackRepository.save(feedBack);

        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Feedback sent successfully");
        responseDTO.setStatus(200);
        return responseDTO;
    }

    }

