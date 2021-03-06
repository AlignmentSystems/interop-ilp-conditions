/*
 * PDP FSP API (Implementation Friendly Version)
 * DRAFT FOR INTERNAL REVIEW ONLY - Based on API Definition.docx updated on 2017-07-06 - Implementation friendly version. [Changes from pervious version (2.7) - maxLength changed to 48 from 32 for IlpCondition and IlpFulfilment Types.]
 *
 * OpenAPI spec version: 2.8
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ilp.conditions.models.pdp;

import java.util.Objects;

/**
 * Below are the allowed values for the enumeration - PASSPORT A passport number is used as reference to a Party. - NATIONAL_REGISTRATION A national registration number is used as reference to a Party. - DRIVING_LICENSE A driving license is used as reference to a Party. - ALIEN_REGISTRATION An alien registration number is used as reference to a Party. - NATIONAL_ID_CARD A national ID card number is used as reference to a Party. - EMPLOYER_ID A tax identification number is used as reference to a Party. - TAX_ID_NUMBER A tax identification number is used as reference to a Party. - SENIOR_CITIZENS_CARD A senior citizens card number is used as reference to a Party. - MARRIAGE_CERTIFICATE A marriage certificate number is used as reference to a Party. - HEALTH_CARD A health card number is used as reference to a Party. - VOTERS_ID A voter’s identification number is used as reference to a Party. - UNITED_NATIONS An UN (United Nations) number is used as reference to a Party. - OTHER_ID Any other type of identification type number is used as reference to a Party.
 */
public enum PersonalIdentifierType {
  
  PASSPORT("PASSPORT"),
  
  NATIONAL_REGISTRATION("NATIONAL_REGISTRATION"),
  
  DRIVING_LICENSE("DRIVING_LICENSE"),
  
  ALIEN_REGISTRATION("ALIEN_REGISTRATION"),
  
  NATIONAL_ID_CARD("NATIONAL_ID_CARD"),
  
  EMPLOYER_ID("EMPLOYER_ID"),
  
  TAX_ID_NUMBER("TAX_ID_NUMBER"),
  
  SENIOR_CITIZENS_CARD("SENIOR_CITIZENS_CARD"),
  
  MARRIAGE_CERTIFICATE("MARRIAGE_CERTIFICATE"),
  
  HEALTH_CARD("HEALTH_CARD"),
  
  VOTERS_ID("VOTERS_ID"),
  
  UNITED_NATIONS("UNITED_NATIONS"),
  
  OTHER_ID("OTHER_ID");

  private String value;

  PersonalIdentifierType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PersonalIdentifierType fromValue(String text) {
    for (PersonalIdentifierType b : PersonalIdentifierType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

}
