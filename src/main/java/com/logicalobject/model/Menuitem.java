package com.logicalobject.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.logicalobject.model.MenuitemItemtype;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


/**
 * Menuitem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-10T11:48:41.239-07:00")

public class Menuitem  implements Serializable {
  private String itemId = null;

  private String businessId = null;

  private String description = null;

  private String displayName = null;

  private Double price = null;

  private String image = null;

  private MenuitemItemtype itemtype = null;

  public Menuitem itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Unique identifier representing a specific resturant item
   * @return itemId
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific resturant item")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public Menuitem businessId(String businessId) {
    this.businessId = businessId;
    return this;
  }

   /**
   * Unique identifier representing a specific resturant
   * @return businessId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier representing a specific resturant")
  public String getBusinessId() {
    return businessId;
  }

  public void setBusinessId(String businessId) {
    this.businessId = businessId;
  }

  public Menuitem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of item.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of item.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Menuitem displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of item.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "Display name of item.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Menuitem price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * price of the item.
   * @return price
  **/
  @ApiModelProperty(required = true, value = "price of the item.")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Menuitem image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Image URL representing the item.
   * @return image
  **/
  @ApiModelProperty(value = "Image URL representing the item.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Menuitem itemtype(MenuitemItemtype itemtype) {
    this.itemtype = itemtype;
    return this;
  }

   /**
   * Get itemtype
   * @return itemtype
  **/
  @ApiModelProperty(value = "")
  public MenuitemItemtype getItemtype() {
    return itemtype;
  }

  public void setItemtype(MenuitemItemtype itemtype) {
    this.itemtype = itemtype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Menuitem menuitem = (Menuitem) o;
    return Objects.equals(this.itemId, menuitem.itemId) &&
        Objects.equals(this.businessId, menuitem.businessId) &&
        Objects.equals(this.description, menuitem.description) &&
        Objects.equals(this.displayName, menuitem.displayName) &&
        Objects.equals(this.price, menuitem.price) &&
        Objects.equals(this.image, menuitem.image) &&
        Objects.equals(this.itemtype, menuitem.itemtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, businessId, description, displayName, price, image, itemtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Menuitem {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    itemtype: ").append(toIndentedString(itemtype)).append("\n");
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

