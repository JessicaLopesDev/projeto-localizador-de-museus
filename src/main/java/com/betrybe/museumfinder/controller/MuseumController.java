package com.betrybe.museumfinder.controller;

import com.betrybe.museumfinder.dto.MuseumCreationDto;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MuseumController.
 */
@RestController
@RequestMapping("/museums")
public class MuseumController {

  private MuseumServiceInterface service;

  public MuseumController(MuseumServiceInterface service) {
    this.service = service;
  }

  /**
   * PostMuseum.
   */
  @PostMapping
  public ResponseEntity<Museum> createMuseum(@RequestBody MuseumCreationDto newMuseum) {
    Museum museum =
    newPodcast.setId(new Random().nextInt(0, 1000));

    return ResponseEntity.status(HttpStatus.CREATED).body(newPodcast);
  }
}
