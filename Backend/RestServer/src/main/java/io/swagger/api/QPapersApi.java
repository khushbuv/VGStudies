/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import org.threeten.bp.LocalDate;
import io.swagger.model.QPaper;
import io.swagger.annotations.*;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-26T14:49:35.566Z")

@Api(value = "q-papers", description = "the q-papers API")
public interface QPapersApi {

    @ApiOperation(value = "", nickname = "getQPapers", notes = "", response = QPaper.class, responseContainer = "List", tags={ "Q-Paper", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = QPaper.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 401, message = "user is unauthorised to make this request"),
        @ApiResponse(code = 404, message = "not found"),
        @ApiResponse(code = 408, message = "Request timeout"),
        @ApiResponse(code = 500, message = "Interval server error") })
    @RequestMapping(value = "/q-papers/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<QPaper>> getQPapers(@ApiParam(value = "",required=true) @PathVariable("userId") Long userId,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "date", required = true) LocalDate date);

}