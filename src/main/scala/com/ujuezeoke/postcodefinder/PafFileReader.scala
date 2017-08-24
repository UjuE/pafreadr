package com.ujuezeoke.postcodefinder

import scala.io.Source

/**
  * Created by Obianuju Ezeoke on 06/07/2017.
  */
trait PafFileReader {
  protected lazy val pafEntries: String => Stream[String] =
    urlOfFile => {
      val source = Source.fromURL(urlOfFile)
      source.getLines().toStream
    }
}
