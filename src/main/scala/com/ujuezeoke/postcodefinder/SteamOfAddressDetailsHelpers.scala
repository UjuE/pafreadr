package com.ujuezeoke.postcodefinder

/**
  * Created by Obianuju Ezeoke on 06/07/2017.
  */
object SteamOfAddressDetailsHelpers {
  implicit class SearchableAddressDetails(addressDetails: Stream[AddressDetail]) {
    def searchUsing(query: SearchQuery):  Stream[AddressDetail] =
        query match {
          case PostCodeOnlySearchQuery(postCode) => addressDetails.filter(_.postcode.equalsIgnoreCase(postCode))

          case ThoroughFareAndDescriptorOnlySearchQuery(thouroughFareAndDescriptor) =>
            addressDetails
              .filter(_.thouroughFareAndDescriptor.equalsIgnoreCase(thouroughFareAndDescriptor))

          case PostCodeAndBuildingNumberSearchQuery(postCode, buildingNumber) =>
            addressDetails
              .filter(addressDetail =>
                addressDetail.postcode.equalsIgnoreCase(postCode)
                  && addressDetail.buildingNumber.isDefined && buildingNumber.equals(addressDetail.buildingNumber.get))

          case _ => ???
        }

  }

}
