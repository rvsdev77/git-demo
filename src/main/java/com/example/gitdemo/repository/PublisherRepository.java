package com.example.gitdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.gitdemo.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
