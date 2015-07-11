package com.hireartists.core.repository

import java.lang.Long

import com.hireartists.core.domain.Artist
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Created by prayagupd
 * on 7/10/15.
 */

@Repository
trait ArtistRepository extends CrudRepository[Artist, Long]{

}
