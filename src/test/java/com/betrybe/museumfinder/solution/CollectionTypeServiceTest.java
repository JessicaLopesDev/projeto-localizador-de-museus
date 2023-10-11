package com.betrybe.museumfinder.solution;

import com.betrybe.museumfinder.service.MuseumService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * CollectionTypeServiceTest.
 */
@SpringBootTest
public class CollectionTypeServiceTest {
  @Autowired
  MuseumService museumService;

  @Test
  @DisplayName("Must return the closest Museum")
  public void testGetClosestMuseum() {
  }
}
