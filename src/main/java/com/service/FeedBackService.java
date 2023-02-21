package com.service;

import java.util.Optional;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.FeedBack;
import com.repository.FeedBackRepository;

@Service 
public class FeedBackService {
@Autowired

FeedBackRepository feedBackRepository;

public String GiveFeedback(FeedBack feedback)
{
	Optional<FeedBack>op=feedBackRepository.findById(feedback.getFid());
	if(op.isPresent())
	{
		return "Feedback Already Available......!";
	}
	else
	{
		feedBackRepository.save(feedback);
		return "Feedback Store Successfully";
	}
}
}
