/*
 * Calender Api
 * Api to book meetings
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.freightfox.calender.model.booking;

import java.util.Objects;
import com.freightfox.calender.model.availability.ErrorMessage;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Reponse Containing Available time slots 
 */
@ApiModel(description = "Reponse Containing Available time slots ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-11T14:21:11.874Z")
public class BookReply {
  @SerializedName("data")
  private Object data = null;

  @SerializedName("errors")
  private List<ErrorMessage> errors = null;

  public BookReply data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * List of Terms and Conditions
   * @return data
  **/
  @ApiModelProperty(value = "List of Terms and Conditions")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public BookReply errors(List<ErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public BookReply addErrorsItem(ErrorMessage errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ErrorMessage>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Errors
   * @return errors
  **/
  @ApiModelProperty(value = "Errors")
  public List<ErrorMessage> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorMessage> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookReply bookReply = (BookReply) o;
    return Objects.equals(this.data, bookReply.data) &&
        Objects.equals(this.errors, bookReply.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookReply {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
