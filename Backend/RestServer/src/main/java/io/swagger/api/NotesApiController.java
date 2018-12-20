package io.swagger.api;

import io.swagger.model.Note;
import org.threeten.bp.OffsetDateTime;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-20T05:27:06.598Z")

@Controller
public class NotesApiController implements NotesApi {

    private static final Logger log = LoggerFactory.getLogger(NotesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NotesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Note>> getNotes(@NotNull @ApiParam(value = "date from which last 1 week is to be calculated", required = true) @Valid @RequestParam(value = "tdate", required = true) OffsetDateTime tdate,@ApiParam(value = "notes need to be fetched from last week, last month or last year", allowableValues = "last_week, last_month, last_year") @Valid @RequestParam(value = "duration", required = false) List<String> duration) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<Note>>(objectMapper.readValue("<Note>  <id>123456789</id>  <name>Radioactive</name>  <category>Chemistry</category>  <tags>aeiou</tags>  <content>Electron number for Uranium is 92</content></Note>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Note>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Note>>(objectMapper.readValue("[ {  \"name\" : \"Radioactive\",  \"id\" : 0,  \"category\" : \"Chemistry\",  \"content\" : \"Electron number for Uranium is 92\",  \"tags\" : [ \"tags\", \"tags\" ]}, {  \"name\" : \"Radioactive\",  \"id\" : 0,  \"category\" : \"Chemistry\",  \"content\" : \"Electron number for Uranium is 92\",  \"tags\" : [ \"tags\", \"tags\" ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Note>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Note>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
