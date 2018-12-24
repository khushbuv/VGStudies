package io.swagger.api;

import io.swagger.model.Doc;
import org.threeten.bp.LocalDate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-24T13:17:11.534Z")

@Controller
public class DocsApiController implements DocsApi {

    private static final Logger log = LoggerFactory.getLogger(DocsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DocsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Doc>> getDocs(@ApiParam(value = "",required=true) @PathVariable("userId") Long userId,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "date", required = true) LocalDate date) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Doc>>(objectMapper.readValue("[ {  \"name\" : \"Radioactivity\",  \"id\" : 0,  \"category\" : \"Chemistry\",  \"tags\" : [ \"tags\", \"tags\" ]}, {  \"name\" : \"Radioactivity\",  \"id\" : 0,  \"category\" : \"Chemistry\",  \"tags\" : [ \"tags\", \"tags\" ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Doc>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Doc>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
