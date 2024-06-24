package com.apac.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apac.springboot.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {

}
