/*
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.54
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
 * Upstream Upstream Upstream Upstream Upstream Upstream Upstream upstream
 */
@ApiModel(description = "Upstream Upstream Upstream Upstream Upstream Upstream Upstream upstream")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-24T10:15:05.919453168Z[GMT]")
public class Upstream {
  public static final String SERIALIZED_NAME_PRESERVE_HOST = "preserve_host";
  @SerializedName(SERIALIZED_NAME_PRESERVE_HOST)
  private Boolean preserveHost;

  public static final String SERIALIZED_NAME_STRIP_PATH = "strip_path";
  @SerializedName(SERIALIZED_NAME_STRIP_PATH)
  private String stripPath;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public Upstream preserveHost(Boolean preserveHost) {
    
    this.preserveHost = preserveHost;
    return this;
  }

   /**
   * PreserveHost, if false (the default), tells ORY Oathkeeper to set the upstream request&#39;s Host header to the hostname of the API&#39;s upstream&#39;s URL. Setting this flag to true instructs ORY Oathkeeper not to do so.
   * @return preserveHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PreserveHost, if false (the default), tells ORY Oathkeeper to set the upstream request's Host header to the hostname of the API's upstream's URL. Setting this flag to true instructs ORY Oathkeeper not to do so.")

  public Boolean getPreserveHost() {
    return preserveHost;
  }


  public void setPreserveHost(Boolean preserveHost) {
    this.preserveHost = preserveHost;
  }


  public Upstream stripPath(String stripPath) {
    
    this.stripPath = stripPath;
    return this;
  }

   /**
   * StripPath if set, replaces the provided path prefix when forwarding the requested URL to the upstream URL.
   * @return stripPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "StripPath if set, replaces the provided path prefix when forwarding the requested URL to the upstream URL.")

  public String getStripPath() {
    return stripPath;
  }


  public void setStripPath(String stripPath) {
    this.stripPath = stripPath;
  }


  public Upstream url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL is the URL the request will be proxied to.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL is the URL the request will be proxied to.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Upstream upstream = (Upstream) o;
    return Objects.equals(this.preserveHost, upstream.preserveHost) &&
        Objects.equals(this.stripPath, upstream.stripPath) &&
        Objects.equals(this.url, upstream.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preserveHost, stripPath, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Upstream {\n");
    sb.append("    preserveHost: ").append(toIndentedString(preserveHost)).append("\n");
    sb.append("    stripPath: ").append(toIndentedString(stripPath)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

