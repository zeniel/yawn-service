/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.devplatform.yawnservice.api;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devplatform.model.ModelApiResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T19:01:01.992Z[GMT]")
@Api(value = "slack", description = "the slack API")
public interface SlackApi {

	@ApiOperation(value = "Receive Slack EventsAPI", nickname = "receiveEvents", notes = "", response = ModelApiResponse.class, authorizations = {
			@Authorization(value = "yawn_api_key") }, tags = { "slack", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class),
			@ApiResponse(code = 405, message = "Invalid input") })
	@RequestMapping(value = "/slack/events", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<?> events(@ApiParam(value = "", required = true) @RequestBody byte[] bodyBytes)
			throws JsonParseException, JsonMappingException, IOException;

}
