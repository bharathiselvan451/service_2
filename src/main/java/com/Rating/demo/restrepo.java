package com.Rating.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="rest",path="rest")
public interface restrepo extends JpaRepository<restmodel, String> {

}
