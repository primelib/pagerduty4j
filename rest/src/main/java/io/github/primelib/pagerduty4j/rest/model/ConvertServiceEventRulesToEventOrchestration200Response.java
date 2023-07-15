package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConvertServiceEventRulesToEventOrchestration200Response
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "convert_status",
    "converted_to"
})
@JsonTypeName("convertServiceEventRulesToEventOrchestration_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertServiceEventRulesToEventOrchestration200Response {

    /**
     * Did PagerDuty successfully create equivalent Event Orchestration rules
     */
    @JsonProperty("convert_status")
    private String convertStatus;

    /**
     * the API URL at which the newly created Event Orchestration rules are accessible
     */
    @JsonProperty("converted_to")
    private String convertedTo;


}
