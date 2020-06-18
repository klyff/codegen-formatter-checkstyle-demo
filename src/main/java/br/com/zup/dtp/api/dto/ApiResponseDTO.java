package br.com.zup.dtp.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * ApiResponseDTO
 */
@Validated

public class ApiResponseDTO implements Serializable {

   private static final long serialVersionUID = 1L;

   @JsonProperty("code")
   private Integer code = null;

   @JsonProperty("type")
   private String type = null;

   @JsonProperty("message")
   private String message = null;

   public ApiResponseDTO code(Integer code) {
      this.code = code;
      return this;
   }

   /**
    * Get code
    *
    * @return code
    **/
   @ApiModelProperty(value = "")

   public Integer getCode() {
      return code;
   }

   public void setCode(Integer code) {
      this.code = code;
   }

   public ApiResponseDTO type(String type) {
      this.type = type;
      return this;
   }

   /**
    * Get type
    *
    * @return type
    **/
   @ApiModelProperty(value = "")

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public ApiResponseDTO message(String message) {
      this.message = message;
      return this;
   }

   /**
    * Get message
    *
    * @return message
    **/
   @ApiModelProperty(value = "")

   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   @Override
   public boolean equals(java.lang.Object o) {
      if (this == o) {
         return true;
      }
      if (o == null || getClass() != o.getClass()) {
         return false;
      }
      ApiResponseDTO _apiResponse = (ApiResponseDTO) o;
      return Objects.equals(this.code, _apiResponse.code) && Objects.equals(this.type, _apiResponse.type)
             && Objects.equals(this.message, _apiResponse.message);
   }

   @Override
   public int hashCode() {
      return Objects.hash(code, type, message);
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiResponseDTO {\n");

      sb.append("    code: ").append(toIndentedString(code)).append("\n");
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("}");
      return sb.toString();
   }

   /**
    * Convert the given object to string with each line indented by 4 spaces (except the first line).
    */
   private String toIndentedString(java.lang.Object o) {
      if (o == null) {
         return "null";
      }
      return o.toString().replace("\n", "\n    ");
   }
}
