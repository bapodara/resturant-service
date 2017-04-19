package com.logicalobject.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


/**
 * MenuitemItemtype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-10T11:48:41.239-07:00")

public class MenuitemItemtype  implements Serializable {
  private Boolean vegeterian = null;

  private Boolean vegean = null;

  private Boolean glutenFree = null;

  public MenuitemItemtype vegeterian(Boolean vegeterian) {
    this.vegeterian = vegeterian;
    return this;
  }

   /**
   * true if the item is vegeterian otherwise false
   * @return vegeterian
  **/
  @ApiModelProperty(value = "true if the item is vegeterian otherwise false")
  public Boolean getVegeterian() {
    return vegeterian;
  }

  public void setVegeterian(Boolean vegeterian) {
    this.vegeterian = vegeterian;
  }

  public MenuitemItemtype vegean(Boolean vegean) {
    this.vegean = vegean;
    return this;
  }

   /**
   * true if the item is vegan otherwise false
   * @return vegean
  **/
  @ApiModelProperty(value = "true if the item is vegan otherwise false")
  public Boolean getVegean() {
    return vegean;
  }

  public void setVegean(Boolean vegean) {
    this.vegean = vegean;
  }

  public MenuitemItemtype glutenFree(Boolean glutenFree) {
    this.glutenFree = glutenFree;
    return this;
  }

   /**
   * true if the item is gluten free otherwise false
   * @return glutenFree
  **/
  @ApiModelProperty(value = "true if the item is gluten free otherwise false")
  public Boolean getGlutenFree() {
    return glutenFree;
  }

  public void setGlutenFree(Boolean glutenFree) {
    this.glutenFree = glutenFree;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuitemItemtype menuitemItemtype = (MenuitemItemtype) o;
    return Objects.equals(this.vegeterian, menuitemItemtype.vegeterian) &&
        Objects.equals(this.vegean, menuitemItemtype.vegean) &&
        Objects.equals(this.glutenFree, menuitemItemtype.glutenFree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vegeterian, vegean, glutenFree);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuitemItemtype {\n");
    
    sb.append("    vegeterian: ").append(toIndentedString(vegeterian)).append("\n");
    sb.append("    vegean: ").append(toIndentedString(vegean)).append("\n");
    sb.append("    glutenFree: ").append(toIndentedString(glutenFree)).append("\n");
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

