package com.gitch.s3sdkusage;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.amazonaws.services.s3.model.Bucket;
import com.gitch.s3sdkusage.service.S3Buckets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller{

    @Autowired
    S3Buckets s3Buckets;
    @GetMapping(value="/listbuckets")
    public List<Bucket> getMethodName() {
        return s3Buckets.getBuckets();
    }
    
}