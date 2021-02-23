package com.org.hpp.repository;

import com.org.hpp.model.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public interface SubjectRepo extends MongoRepository<Subject,Integer> {
    public static void deleteBySubName(String subname) {

    }

}
