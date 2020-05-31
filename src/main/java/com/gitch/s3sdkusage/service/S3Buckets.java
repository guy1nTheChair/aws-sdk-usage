package com.gitch.s3sdkusage.service;

import java.util.List;
import java.util.Map;

import com.amazonaws.services.s3.model.Bucket;

import org.springframework.stereotype.Component;

@Component
public interface S3Buckets {
    
    public List<Bucket> getBuckets();

    public List<String> getContentsOfBucket(String bucketName);

    public List<String> getContentsOfPath(String bucketName, String key);

    public void deleteFile(Map<String, Object> map);
}