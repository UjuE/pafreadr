package com.ujuezeoke.postcodefinder

import com.google.gson.Gson

/**
  * Created by Obianuju Ezeoke on 06/07/2017.
  *
  * Postcode 1 Alphanumeric 8 1
  * Post Town 1 Alphanumeric 30 1
  * Dependent Locality 1 Alphanumeric 35 1
  * Double Dependent Locality 1 Alphanumeric 35 1
  * Thoroughfare & Descriptor 1 Alphanumeric 80 1
  * Dependent Thoroughfare &
  * Descriptor
  * 1 Alphanumeric 80 1
  * Building Number 1 Numeric 4 1
  * Building Name 1 Alphanumeric 50 1
  * Sub Building Name 1 Alphanumeric 30 1
  * PO Box 1 Alphanumeric 6 1
  * Department Name 1 Alphanumeric 60 1
  * Organisation Name 1 Alphanumeric 60 1
  * UDPRN 1 Numeric 8 1
  * Postcode Type 1 Alphanumeric 1 1 (a)
  * SU Organisation Indicator 1 Alphanumeric 1 1 (b)
  * Delivery Point Suffix 1 Alphanumeric 2 1
  */
case class AddressDetail(postcode: String, postTown: String, dependentLocality: String,
                         doubleDependentLocality: String, thouroughFareAndDescriptor: String,
                         dependentThoroughFareAndDescriptor: String, buildingNumber: Option[Int], buildingName: String,
                         subBuildingName: String, pOBox: String, departmentName: String,
                         organisationName: String, udprn: Option[Int], postCodeType: String, suOrganisationIndicator: String,
                         deliveryPointSuffix: String) {
  override def toString: String = new Gson().toJson(this)
}
