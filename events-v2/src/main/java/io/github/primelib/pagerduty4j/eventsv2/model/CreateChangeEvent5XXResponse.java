package io.github.primelib.pagerduty4j.eventsv2.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateChangeEvent5XXResponse
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "status",
    "message",
    "errors"
})
@JsonTypeName("createChangeEvent_5XX_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateChangeEvent5XXResponse {

    /**
     * A short name for the error.
     */
    @JsonProperty("status")
    private String status;

    /**
     * A description of the problem.
     */
    @JsonProperty("message")
    private String message;

    /**
     * An array of specific error messages.
     */
    @JsonProperty("errors")
    private List<String> errors;


}
