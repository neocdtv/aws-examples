package io.neocdtv;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.ListObjectsV2Request;
import software.amazon.awssdk.services.s3.model.ListObjectsV2Response;
import software.amazon.awssdk.services.s3.model.S3Object;
import software.amazon.awssdk.services.s3.paginators.ListObjectsV2Iterable;

public class ReadS3Test {
  public static void start() {

    S3Client client = S3Client.builder().region(Region.US_EAST_1).build();
    //ListObjectsV2Request request = ListObjectsV2Request.builder().bucket("the-bucket").prefix("the-prefix").build();
    ListObjectsV2Request request = ListObjectsV2Request.builder().bucket("wellthisisfinebucket").build();
    ListObjectsV2Iterable response = client.listObjectsV2Paginator(request);

    for (ListObjectsV2Response page : response) {
      page.contents().forEach((S3Object object) -> {
        // TODO: Consume `object` the way you need
        System.out.println(object.key());
      });
    }
  }
}
