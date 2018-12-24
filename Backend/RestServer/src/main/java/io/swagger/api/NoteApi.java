/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Note;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T05:19:55.468Z")

@Api(value = "note", description = "the note API")
public interface NoteApi {

    @ApiOperation(value = "Add a new new note", nickname = "addNote", notes = "", tags={ "Notes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/note/{userId}",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addNote(@ApiParam(value = "",required=true) @PathVariable("userId") Long userId,@ApiParam(value = "Note object that needs to be added" ,required=true )  @Valid @RequestBody Note body);


    @ApiOperation(value = "Deletes a Note", nickname = "deleteNote", notes = "", tags={ "Notes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found") })
    @RequestMapping(value = "/note/delete/{noteId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteNote(@ApiParam(value = "note id to delete",required=true) @PathVariable("noteId") Long noteId,@NotNull @ApiParam(value = "user id to delete associated note", required = true) @Valid @RequestParam(value = "userId", required = true) Long userId);


    @ApiOperation(value = "Update an existing Note", nickname = "updateNote", notes = "", tags={ "Notes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/note/update/{noteId}",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateNote(@NotNull @ApiParam(value = "userId associated with the user of note", required = true) @Valid @RequestParam(value = "userId", required = true) Long userId,@ApiParam(value = "",required=true) @PathVariable("noteId") Long noteId,@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Note body);

}
