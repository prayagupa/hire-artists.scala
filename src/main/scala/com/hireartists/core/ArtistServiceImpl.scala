package com.hireartists.core

import org.springframework.stereotype.Service

trait ArtistService {
  def name: String
}

@Service
class ArtistServiceImpl extends ArtistService {

  def name = "Porcupine Tree"

}
