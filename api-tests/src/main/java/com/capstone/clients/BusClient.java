package com.capstone.clients;

import com.capstone.config.EnvConfig;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BusClient {
  private final RequestSpecification spec;

  public BusClient() {
    this.spec = new RequestSpecBuilder()
        .setBaseUri(EnvConfig.require("BASE_URL"))
        .setContentType(ContentType.JSON)
        .build();
  }

  public RequestSpecification spec() {
    return spec;
  }
}
