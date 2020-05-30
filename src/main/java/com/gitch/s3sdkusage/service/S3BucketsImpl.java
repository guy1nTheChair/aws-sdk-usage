package com.gitch.s3sdkusage.service;

import java.util.List;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

import org.springframework.stereotype.Component;

@Component
public class S3BucketsImpl implements S3Buckets {

    @Override
    public List<Bucket> getBuckets() {
        AmazonS3 s3Client = AmazonS3ClientBuilder.standard().build();
        List<Bucket> buckets = s3Client.listBuckets();
        return buckets;
    }

}