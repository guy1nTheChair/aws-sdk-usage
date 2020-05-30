package com.gitch.s3sdkusage.service;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;

import org.springframework.stereotype.Component;

@Component
public class S3BucketsImpl implements S3Buckets {
    
    AmazonS3 s3Client = AmazonS3ClientBuilder.standard().build();

    @Override
    public List<Bucket> getBuckets() {
        List<Bucket> buckets = s3Client.listBuckets();
        return buckets;
    }

    @Override
    public List<String> getContentsOfBucket(String bucketName) {
        ObjectListing objectListing = s3Client.listObjects(bucketName);
        List<String> objects = new ArrayList<>();
        objectListing.getObjectSummaries().forEach(object -> objects.add(object.getKey()) );
        return objects;
    }

}