package com.capstone.support;

import com.capstone.clients.AuthClient;
import com.capstone.clients.BookingClient;
import com.capstone.clients.BusClient;
import io.restassured.specification.RequestSpecification;

public class SpecFactory {
  private final AuthClient authClient = new AuthClient();
  private final BusClient busClient = new BusClient();
  private final BookingClient bookingClient = new BookingClient();

  public RequestSpecification authSpec() {
    return authClient.spec();
  }

  public RequestSpecification busSpec() {
    return busClient.spec();
  }

  public RequestSpecification bookingSpec() {
    return bookingClient.spec();
  }
}
