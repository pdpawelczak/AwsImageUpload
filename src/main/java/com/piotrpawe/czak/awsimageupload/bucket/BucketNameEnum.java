package com.piotrpawe.czak.awsimageupload.bucket;

public enum BucketNameEnum {

    PROFILE_IMAGE("piotrpawelczak-image-upload");

    private final String bucketNameEnum;

    BucketNameEnum(String bucketNameEnum) {
        this.bucketNameEnum = bucketNameEnum;
    }

    public String getBucketNameEnum() {
        return bucketNameEnum;
    }
}
