package com.ujuezeoke.postcodefinder

import scala.util.control.Exception.allCatch

/**
  * Created by Obianuju Ezeoke on 06/07/2017.
  */
trait AddressFinder {
  private val parseToInt: String => Option[Int] =
    string => allCatch opt string.toInt

  protected lazy val addressDetails: Stream[String] => Stream[AddressDetail] =
    sourceStream => sourceStream.map(line => line.split(","))
      .map(stringArray => AddressDetail(
        stringArray.apply(0), stringArray.apply(1), stringArray.apply(2), stringArray.apply(3),
        stringArray.apply(4), stringArray.apply(5), parseToInt(stringArray.apply(6)), stringArray.apply(7),
        stringArray.apply(8), stringArray.apply(9), stringArray.apply(10), stringArray.apply(11),
        parseToInt(stringArray.apply(12)), stringArray.apply(13), stringArray.apply(14), stringArray.apply(15)))


}
