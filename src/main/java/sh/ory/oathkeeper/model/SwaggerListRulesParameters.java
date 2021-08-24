/*
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.55
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.oathkeeper.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SwaggerListRulesParameters swagger list rules parameters
 */
@ApiModel(description = "SwaggerListRulesParameters swagger list rules parameters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-24T11:28:44.213218031Z[Etc/UTC]")
public class SwaggerListRulesParameters {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Long offset;


  public SwaggerListRulesParameters limit(Long limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The maximum amount of rules returned. in: query
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum amount of rules returned. in: query")

  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public SwaggerListRulesParameters offset(Long offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The offset from where to start looking. in: query
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The offset from where to start looking. in: query")

  public Long getOffset() {
    return offset;
  }


  public void setOffset(Long offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwaggerListRulesParameters swaggerListRulesParameters = (SwaggerListRulesParameters) o;
    return Objects.equals(this.limit, swaggerListRulesParameters.limit) &&
        Objects.equals(this.offset, swaggerListRulesParameters.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaggerListRulesParameters {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

