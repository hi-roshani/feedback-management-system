package com.wagh.feedback.controller;

import com.wagh.feedback.dto.FeedBackDTO;
import com.wagh.feedback.dto.ResponseDTO;
import com.wagh.feedback.entity.FeedBack;
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
    public List<FeedBack> getFeedBack(){
        log.info("getting all feedbacks");
        return feedBackService.getFeedBacks();
    }

    @GetMapping("/feedback/get/{id}")
    public List<FeedBack> getByID(@PathVariable long id){
        return feedBackRepository.findAllById(id);
    }

    @PostMapping("/feedback/write")
    public ResponseDTO createFeedBack(@RequestBody FeedBackDTO feedBackDTO){
        log.info("Writing feedback");
        return feedBackService.createFeedBack(feedBackDTO);
    }
}
