package edu.colorado.cires.mgg.aws.cf.bucketdrain;

public class EmptyBucketProperties {

  private String bucketName;

  public String getBucketName() {
    return bucketName;
  }

  public EmptyBucketProperties setBucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

}
