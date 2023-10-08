package com.betrybe.museumfinder.service;

import com.betrybe.museumfinder.database.MuseumFakeDatabase;
import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.exception.MuseumNotFoundException;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.util.CoordinateUtil;
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

  @Override
  public Museum getClosestMuseum(Coordinate coordinate, Double maxDistance) {
    boolean isValidCoordinate = CoordinateUtil.isCoordinateValid(coordinate);
    if (!isValidCoordinate) {
      throw new InvalidCoordinateException();
    }
    return museumFakeDatabase.getClosestMuseum(coordinate, maxDistance)
        .orElseThrow(() -> new MuseumNotFoundException());
  }

  /**
   * createMuseum.
   */
  public Museum createMuseum(Museum museum) {
    boolean isValidCoordinate = CoordinateUtil.isCoordinateValid(museum.getCoordinate());
    if (!isValidCoordinate) {
      throw new InvalidCoordinateException();
    }
    return museumFakeDatabase.saveMuseum(museum);
  }

  @Override
  public Museum getMuseum(Long id) {
    return null;
  }
}
