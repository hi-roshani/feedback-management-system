package com.wagh.feedback;

import com.wagh.feedback.repository.FeedBackRepository;
import com.wagh.feedback.service.FeedBackService;
import com.wagh.feedback.serviceImpl.FeedBackServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import com.wagh.feedback.entity.FeedBackEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@Slf4j
@SpringBootTest
class FeedbackManagementSystemApplicationTests {
	@Mock
	private FeedBackRepository feedBackRepository;

	@InjectMocks
	private FeedBackService feedBackService = new FeedBackServiceImpl();

	private List<FeedBackEntity> feedBackList;

	@BeforeEach
	public void mocks(){
		MockitoAnnotations.openMocks(this);
		feedBackList = new ArrayList<>();
		FeedBackEntity feedBack1 = new FeedBackEntity();
		feedBack1.setId(1L);
		feedBack1.setUserId(1L);
		feedBack1.setComments("Testing Testing");
		feedBack1.setRatings(5);
		feedBackList.add(feedBack1);

	}
	@Test
	void contextLoads() {
		when(feedBackRepository.findAll()).thenReturn(feedBackList);
		List<FeedBackEntity> result = feedBackService.getFeedBacks();
		assertEquals(feedBackList, result);
	}

}
