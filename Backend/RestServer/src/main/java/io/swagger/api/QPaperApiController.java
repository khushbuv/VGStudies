package io.swagger.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-26T14:49:35.566Z")

@Controller
public class QPaperApiController implements QPaperApi {

    private static final Logger log = LoggerFactory.getLogger(QPaperApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public QPaperApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Resource> downloadFile(@ApiParam(value = "Question Paper Id",required=true) @PathVariable("qpaperId") Long qpaperId,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "userId", required = true) Long userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("", Resource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type ", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateQPaper(@ApiParam(value = "",required=true) @PathVariable("qpaperId") Long qpaperId,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "userId", required = true) Long userId,@ApiParam(value = "doc name.", required=true) @RequestParam(value="DocName", required=true)  String docName,@ApiParam(value = "") @RequestParam(value="category", required=false)  String category,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile uploadfile,@ApiParam(value = "") @RequestParam(value="tags", required=false)  String tags) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> uploadQPaper(@ApiParam(value = "",required=true) @PathVariable("userId") Long userId,@ApiParam(value = "doc name.", required=true) @RequestParam(value="QPaperName", required=true)  String qpaperName,@ApiParam(value = "") @RequestParam(value="category", required=false)  String category,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile uploadfile,@ApiParam(value = "") @RequestParam(value="tags", required=false)  String tags) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
