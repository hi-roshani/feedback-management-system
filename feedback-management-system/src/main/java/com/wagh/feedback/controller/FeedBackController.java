package com.wagh.feedback.controller;

import com.wagh.feedback.dto.FeedBackDTO;
import com.wagh.feedback.dto.ResponseDTO;
import com.wagh.feedback.entity.FeedBackEntity;
import com.wagh.feedback.repository.FeedBackRepository;
import com.wagh.feedback.service.FeedBackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class FeedBackController {

    @Autowired
    private FeedBackService feedBackService;

    @Autowired
    private FeedBackRepository feedBackRepository;

    @GetMapping("/feedback/get")
    public List<FeedBackEntity> getFeedBack(){
        log.info("getting all feedbacks");
        return feedBackService.getFeedBacks();
    }

    @GetMapping("/feedback/get/{id}")
    public List<FeedBackEntity> getByID(@PathVariable long id){
        log.info("getting all feedbacks with id=" + id);
        return feedBackRepository.findById(id);
    }

    @PostMapping("/feedback/write")
    public ResponseDTO createFeedBack(@RequestBody FeedBackDTO feedBackDTO){
        log.info("Writing feedback");
        return feedBackService.createFeedBack(feedBackDTO);
    }
}
