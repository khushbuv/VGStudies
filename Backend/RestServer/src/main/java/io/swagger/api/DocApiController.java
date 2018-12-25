package io.swagger.api;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.api.fakeBackend.DocsCreator;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-24T13:17:11.534Z")

@Controller
public class DocApiController implements DocApi {

    private static final Logger log = LoggerFactory.getLogger(DocApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    DocsCreator docCreator;

    @org.springframework.beans.factory.annotation.Autowired
    public DocApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Resource> downloadFile(@ApiParam(value = "document Id",required=true) @PathVariable("docId") Long docId,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "userId", required = true) Long userId) {
        String accept = request.getHeader("Accept");
        if (accept != null) {
//           try {
            	System.out.println("file download called");
//                return new ResponseEntity<Resource>(objectMapper.readValue("\"\"", Resource.class), HttpStatus.NOT_IMPLEMENTED);
            	 return new ResponseEntity<Resource>(docCreator.getDoc(), HttpStatus.OK);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        }

        return new ResponseEntity<Resource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateDoc(@ApiParam(value = "",required=true) @PathVariable("docId") Long docId,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "userId", required = true) Long userId,@ApiParam(value = "doc name.", required=true) @RequestParam(value="DocName", required=true)  String docName,@ApiParam(value = "", required=true) @RequestParam(value="docname", required=true)  String docname,@ApiParam(value = "") @RequestParam(value="category", required=false)  String category,@ApiParam(value = "") @RequestParam(value="tags", required=false)  String tags) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> uploadDoc(@ApiParam(value = "",required=true) @PathVariable("userId") Long userId,@ApiParam(value = "doc name.", required=true) @RequestParam(value="DocName", required=true)  String docName,@ApiParam(value = "", required=true) @RequestParam(value="docname", required=true)  String docname,@ApiParam(value = "") @RequestParam(value="category", required=false)  String category,@ApiParam(value = "") @RequestParam(value="tags", required=false)  String tags) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
