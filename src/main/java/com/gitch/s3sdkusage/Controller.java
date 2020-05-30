package com.gitch.s3sdkusage;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.amazonaws.services.s3.model.Bucket;
import com.gitch.s3sdkusage.service.S3Buckets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller {

    @Autowired
    S3Buckets s3Buckets;

    @GetMapping(value = "/listBuckets")
    public List<Bucket> getMethodName() {
        return s3Buckets.getBuckets();
    }

    @GetMapping(value = "/getBucketContents")
    public List<String> getMethodName(@RequestParam String bucketName) {
        return s3Buckets.getContentsOfBucket(bucketName);
    }

}