package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAutomationActionServiceAssocationRequest
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "service"
})
@JsonTypeName("createAutomationActionServiceAssocation_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionServiceAssocationRequest {

    @JsonProperty("service")
    private ServiceReference service;


}
