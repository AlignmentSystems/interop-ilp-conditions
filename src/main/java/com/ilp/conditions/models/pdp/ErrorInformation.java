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
 * Data model for the complex type ErrorInformation.
 */
public class ErrorInformation {

  private String errorCode = null;

  private String errorDescription = null;

  private ExtensionList extensionList = null;

  public ErrorInformation errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Specific error number.
   * @return errorCode
  **/
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorInformation errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Error description string.
   * @return errorDescription
  **/
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public ErrorInformation extensionList(ExtensionList extensionList) {
    this.extensionList = extensionList;
    return this;
  }

   /**
   * Get extensionList
   * @return extensionList
  **/
  public ExtensionList getExtensionList() {
    return extensionList;
  }

  public void setExtensionList(ExtensionList extensionList) {
    this.extensionList = extensionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorInformation errorInformation = (ErrorInformation) o;
    return Objects.equals(this.errorCode, errorInformation.errorCode) &&
        Objects.equals(this.errorDescription, errorInformation.errorDescription) &&
        Objects.equals(this.extensionList, errorInformation.extensionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorDescription, extensionList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorInformation {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    extensionList: ").append(toIndentedString(extensionList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
