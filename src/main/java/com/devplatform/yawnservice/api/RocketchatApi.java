/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.devplatform.yawnservice.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devplatform.model.ModelApiResponse;
import com.devplatform.model.rocketchat.event.RocketchatMessageSent;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T19:01:01.992Z[GMT]")
@Api(value = "rocketchat", description = "the rocketchat API")
public interface RocketchatApi {

	@ApiOperation(value = "Receive RocketChat EventsAPI", nickname = "receiveEvents", notes = "", response = ModelApiResponse.class, authorizations = {
			@Authorization(value = "yawn_api_key") }, tags = { "rocketchat", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class),
			@ApiResponse(code = 405, message = "Invalid input") })
	@RequestMapping(value = "/rocketchat/messages", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<ModelApiResponse> messages(@ApiParam(value = "", required = true) @RequestBody RocketchatMessageSent body);

}
