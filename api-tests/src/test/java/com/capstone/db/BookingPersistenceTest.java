package com.capstone.db;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class BookingPersistenceTest {
  @Test
  public void shouldExposeBookingQuerySupport() throws Exception {
    DbClient dbClient = new DbClient();
    int count = dbClient.countBookings();
    assertNotNull(count);
    assertTrue(count >= 0);
  }
}
