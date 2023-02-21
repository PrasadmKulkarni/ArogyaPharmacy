package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.FeedBack;

@Repository
public interface FeedBackRepository extends JpaRepository<FeedBack, Integer>{

}
