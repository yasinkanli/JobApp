package com.yasinkanli.jobapp.service;

import com.yasinkanli.jobapp.model.JobPost;
import com.yasinkanli.jobapp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JobService {


    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobpost){
        repo.addJobPost(jobpost);

    }

    public List<JobPost> getAllJobs(){
        return repo.returnAllJobPosts();
    }
}
