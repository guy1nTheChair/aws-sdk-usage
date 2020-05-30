package com.gitch.s3sdkusage.service;

import java.util.List;

import com.amazonaws.services.s3.model.Bucket;

import org.springframework.stereotype.Component;

@Component
public interface S3Buckets {
    
    public List<Bucket> getBuckets();
}