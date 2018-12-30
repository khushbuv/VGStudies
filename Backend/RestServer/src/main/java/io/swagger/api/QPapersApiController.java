package io.swagger.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.threeten.bp.LocalDate;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.QPaper;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-26T14:49:35.566Z")

@Controller
public class QPapersApiController implements QPapersApi {

    private static final Logger log = LoggerFactory.getLogger(QPapersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public QPapersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<QPaper>> getQPapers(@ApiParam(value = "",required=true) @PathVariable("userId") Long userId,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "date", required = true) LocalDate date) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<QPaper>>(objectMapper.readValue("[ {  \"name\" : \"Chemistry_10th_board\",  \"id\" : 0,  \"category\" : \"Science\",  \"tags\" : [ \"tags\", \"tags\" ]}, {  \"name\" : \"Chemistry_10th_board\",  \"id\" : 0,  \"category\" : \"Science\",  \"tags\" : [ \"tags\", \"tags\" ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<QPaper>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<QPaper>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
