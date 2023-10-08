package com.betrybe.museumfinder.service;

import com.betrybe.museumfinder.database.MuseumFakeDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MuseumService.
 */
@Service
public class MuseumService implements MuseumServiceInterface {
  private MuseumFakeDatabase museumFakeDatabase;

  @Autowired
  public MuseumService(MuseumFakeDatabase museumFakeDatabase) {
    this.museumFakeDatabase = museumFakeDatabase;
  }
}
