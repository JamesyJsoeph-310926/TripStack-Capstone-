package com.capstone.security;

import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class BolaBookingTest {
  @Test
  public void shouldRejectCrossUserBookingAccess() {
    Response response = given()
        .header("Authorization", "Bearer second-user-token")
        .when()
        .get("/api/bookings/PNR-123");

    response.then().statusCode(403).body("error", equalTo("forbidden"));
  }
}
