package com.logicalobject.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


/**
 * Business
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-10T11:48:41.239-07:00")

public class Business  implements Serializable {
  private String businessId = null;

  private String description = null;

  private String businessName = null;

  private String address1 = null;

  private String address2 = null;

  private String city = null;

  private String state = null;

  private String country = null;

  private String zipcode = null;

  private String image = null;

  private String phoneno = null;

  private String website = null;

  public Business businessId(String businessId) {
    this.businessId = businessId;
    return this;
  }

   /**
   * Unique identifier representing a specific resturant
   * @return businessId
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific resturant")
  public String getBusinessId() {
    return businessId;
  }

  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }

  public Business description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of business.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of business.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Business businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Display name of business.
   * @return businessName
  **/
  @ApiModelProperty(required = true, value = "Display name of business.")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public Business address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * address line 1 of business.
   * @return address1
  **/
  @ApiModelProperty(required = true, value = "address line 1 of business.")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Business address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * address line 2 of business.
   * @return address2
  **/
  @ApiModelProperty(value = "address line 2 of business.")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Business city(String city) {
    this.city = city;
    return this;
  }

   /**
   * city of business.
   * @return city
  **/
  @ApiModelProperty(required = true, value = "city of business.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Business state(String state) {
    this.state = state;
    return this;
  }

   /**
   * state of business.
   * @return state
  **/
  @ApiModelProperty(required = true, value = "state of business.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Business country(String country) {
    this.country = country;
    return this;
  }

   /**
   * country of business.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "country of business.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Business zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }

   /**
   * zipcode of business.
   * @return zipcode
  **/
  @ApiModelProperty(required = true, value = "zipcode of business.")
  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public Business image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Image URL representing the business.
   * @return image
  **/
  @ApiModelProperty(value = "Image URL representing the business.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Business phoneno(String phoneno) {
    this.phoneno = phoneno;
    return this;
  }

   /**
   * phone no representing the business.
   * @return phoneno
  **/
  @ApiModelProperty(required = true, value = "phone no representing the business.")
  public String getPhoneno() {
    return phoneno;
  }

  public void setPhoneno(String phoneno) {
    this.phoneno = phoneno;
  }

  public Business website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Image URL representing the business.
   * @return website
  **/
  @ApiModelProperty(value = "Image URL representing the business.")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Business business = (Business) o;
    return Objects.equals(this.businessId, business.businessId) &&
        Objects.equals(this.description, business.description) &&
        Objects.equals(this.businessName, business.businessName) &&
        Objects.equals(this.address1, business.address1) &&
        Objects.equals(this.address2, business.address2) &&
        Objects.equals(this.city, business.city) &&
        Objects.equals(this.state, business.state) &&
        Objects.equals(this.country, business.country) &&
        Objects.equals(this.zipcode, business.zipcode) &&
        Objects.equals(this.image, business.image) &&
        Objects.equals(this.phoneno, business.phoneno) &&
        Objects.equals(this.website, business.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, description, businessName, address1, address2, city, state, country, zipcode, image, phoneno, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Business {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    phoneno: ").append(toIndentedString(phoneno)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

