package com.gitch.s3sdkusage;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.amazonaws.services.s3.model.Bucket;
import com.gitch.s3sdkusage.service.S3Buckets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Controller {

    @Autowired
    S3Buckets s3Buckets;

    @GetMapping(value = "/getBuckets")
    public List<Bucket> getBuckets() {
        return s3Buckets.getBuckets();
    }

    @GetMapping(value = "/getBucketContents/{bucketName}")
    public List<String> getBucketContents(@PathVariable String bucketName) {
       return s3Buckets.getContentsOfBucket(bucketName);
    }

    @GetMapping(value = "/getContentsOfkey/{bucketName}/{key}")
    public List<String> getContentsOfkey(@PathVariable String bucketName, @PathVariable String key) {
        return s3Buckets.getContentsOfPath(bucketName, key);
    }

}