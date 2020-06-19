package br.com.zup.dtp.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LanguageDTO
 */
@Validated


public class LanguageDTO  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("languageName")
  private String languageName = null;

  @JsonProperty("created")
  private Integer created = null;

  @JsonProperty("creator")
  private String creator = null;

  public LanguageDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LanguageDTO languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * Name of Programming Language
   * @return languageName
  **/
  @ApiModelProperty(value = "Name of Programming Language")
  
    public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }

  public LanguageDTO created(Integer created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  
    public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public LanguageDTO creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Main name of creators, comma separated, e.g.: Dennis Ritchie, James Gosling, Ken Thompson
   * @return creator
  **/
  @ApiModelProperty(value = "Main name of creators, comma separated, e.g.: Dennis Ritchie, James Gosling, Ken Thompson")
  
    public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageDTO language = (LanguageDTO) o;
    return Objects.equals(this.id, language.id) &&
        Objects.equals(this.languageName, language.languageName) &&
        Objects.equals(this.created, language.created) &&
        Objects.equals(this.creator, language.creator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, languageName, created, creator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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
