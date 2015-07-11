package com.hireartists.core.domain

import java.lang.Long
import javax.persistence.Entity

import org.springframework.data.jpa.domain.AbstractPersistable

/**
 * Created by prayagupd
 * on 7/10/15.
 */

@Entity
class Artist(name_ : String) extends AbstractPersistable[Long]{

  val name = name_

  def this() = {
    this(null)
  }
}
