package com.quiz.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author  Alaa Yehia and ali tarek
 * @implNote this Generic Repository for extend this for any repository
 * @param <T> this for every entity extend this repo
 */
@NoRepositoryBean
public interface GenericRepository<T> extends JpaRepository<T,Long> , JpaSpecificationExecutor<T> {
}
