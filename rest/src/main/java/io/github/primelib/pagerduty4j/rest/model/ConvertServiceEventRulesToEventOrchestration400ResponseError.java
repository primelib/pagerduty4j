package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConvertServiceEventRulesToEventOrchestration400ResponseError
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "message",
    "errors"
})
@JsonTypeName("convertServiceEventRulesToEventOrchestration_400_response_error")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConvertServiceEventRulesToEventOrchestration400ResponseError {

    /**
     * Error message string
     */
    @JsonProperty("message")
    private String message;

    @JsonProperty("errors")
    private List<ConvertServiceEventRulesToEventOrchestration400ResponseErrorErrorsInner> errors;


}
