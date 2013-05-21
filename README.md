Build status on Travis CI  
[![Build Status](https://travis-ci.org/jeffxor/spring-social-intuit.png?branch=master)](https://travis-ci.org/jeffxor/spring-social-intuit)

## Spring Social Intuit ##
This is an intial start for a Spring Social Connection to Intuit Quickbooks
using there Intuit Partner Platform Data Service for QuickBooks Online. This service
support OAuth version 1 and has been modeled off the Twitter integration provided by
spring.

You can find further documentation of Intuit's QuickBooks Online API at
https://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0050_Data_Services/0400_QuickBooks_Online

Currently supported objects are:-
* Account
* CompanyMetaData
* Customer
* Invoice
* Item
* Payment
* PaymentMethod

To check out the project and build from source, do the following:

` git clone --recursive git://github.com/jeffxor/spring-social-intuit.git  
 cd spring-social-intuit  
 ./gradlew build  
`
===============================================================================
