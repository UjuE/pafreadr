package com.ujuezeoke.postcodefinder

/**
  * Created by Obianuju Ezeoke on 06/07/2017.
  */
sealed class SearchQuery {}

case class PostCodeOnlySearchQuery(postCode: String) extends SearchQuery

case class ThoroughFareAndDescriptorOnlySearchQuery(thouroughFareAndDescriptor: String) extends SearchQuery

case class PostCodeAndBuildingNumberSearchQuery(postCode: String, buildingNumber: Int) extends SearchQuery

case class ContainsStringSearchQuery(anyString: String) extends SearchQuery
