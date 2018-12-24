package io.swagger.api;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Note;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T05:19:55.468Z")

@Controller
public class NoteApiController implements NoteApi {

    private static final Logger log = LoggerFactory.getLogger(NoteApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NoteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addNote(@ApiParam(value = "",required=true) @PathVariable("userId") Long userId,@ApiParam(value = "Note object that needs to be added" ,required=true )  @Valid @RequestBody Note body) {
        String accept = request.getHeader("Accept");
        System.out.println("added a note for, userid: "+userId);
        System.out.println("note: "+body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteNote(@ApiParam(value = "note id to delete",required=true) @PathVariable("noteId") Long noteId,@NotNull @ApiParam(value = "user id to delete associated note", required = true) @Valid @RequestParam(value = "userId", required = true) Long userId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateNote(@NotNull @ApiParam(value = "userId associated with the user of note", required = true) @Valid @RequestParam(value = "userId", required = true) Long userId,@ApiParam(value = "",required=true) @PathVariable("noteId") Long noteId,@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Note body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
