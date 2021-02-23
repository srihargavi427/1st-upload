package com.org.hpp.controller;

import com.org.hpp.model.Subject;
import com.org.hpp.repository.SubjectRepo;
import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Subject")
public class SubjectController<subid> {
    @Autowired
    SubjectRepo subjectRepo;
    @PostMapping("/create")
    public void createSubjectController(@RequestBody Subject c) {
        subjectRepo.save(c);
    }
        //@GetMapping("/allsubject")
              //  public List<Subject>getAllSubject(){
            //List<Subject>all=subjectRepo.findAll();
           // return all;
      //  }
        @PutMapping("/updateRecord")
    public  void updateTheDetails(){
        List<Subject>all=subjectRepo.findAll();
        for(int i=0;i<all.size();i++){
            Subject subject=all.get(i);
            if (subject.getSubSalary()>20000){
                subject.setSubDesignation("seniorsw");
                subjectRepo.save(subject);
            }
        }
        }

    //@DeleteMapping("/delete/{name}")
   // public void deleteBySubjectRecord(@PathVariable String name) {


       // SubjectRepo.deleteBySubName(name);
   // }


    }


