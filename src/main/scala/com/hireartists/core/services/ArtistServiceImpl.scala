package com.hireartists.core.services

import com.hireartists.core.repository.ArtistRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

trait ArtistService {
  def getArtists: String
}

@Service
class ArtistServiceImpl extends ArtistService { //@Autowired() (artistRepository: ArtistRepository) {

  def getArtists = {
    "Porcupine Tree"
  }
}
