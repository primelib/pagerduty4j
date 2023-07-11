package io.github.primelib.pagerduty4j.eventsv2.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateChangeEvent202Response
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "status",
    "dedup_key",
    "message"
})
@JsonTypeName("createChangeEvent_202_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateChangeEvent202Response {

    /**
     * Returns \"success\" if successful, or a short error message in case of a failure.
     */
    @JsonProperty("status")
    private String status;

    /**
     * The key used to correlate triggers, acknowledges, and resolves for the same alert.
     */
    @JsonProperty("dedup_key")
    private String dedupKey;

    /**
     * A description of the problem, or \"Event processed\" if successful.
     */
    @JsonProperty("message")
    private String message;


}
