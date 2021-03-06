/**
* NOTE: This class is auto generated by the swagger code generator program (3.0.20).
* https://github.com/swagger-api/swagger-codegen
* Do not edit the class manually.
*/
package br.com.zup.dtp.api.restclient;

import br.com.zup.dtp.api.dto.LanguageDTO;
    import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
    import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

    import javax.validation.Valid;
    import javax.validation.constraints.*;

    import javax.servlet.http.HttpServletRequest;
    import java.io.IOException;
import java.util.List;
import java.util.Map;

@Api(value = "Name", description = "the Name API")
    public interface NameApi {

                @ApiOperation(value = "Find programming language by name", nickname = "getLanguageByName", notes = "Returns a single programming language"
                    , response = LanguageDTO.class, authorizations = {
            @Authorization(value = "api_key")                }, tags={ "name", })
                @ApiResponses(value = { 
                    @ApiResponse(code = 200, message = "successful operation"
                        , response = LanguageDTO.class),
                    @ApiResponse(code = 400, message = "Invalid Name"),
                    @ApiResponse(code = 404, message = "Language not found") })
                @RequestMapping(value = "/language/{name}",
                    produces = "application/json", 
                method = RequestMethod.GET)

            ResponseEntity<LanguageDTO> getLanguageByName(@ApiParam(value = "Name of Language to return",required=true) @PathVariable("name") String name
);


        }
