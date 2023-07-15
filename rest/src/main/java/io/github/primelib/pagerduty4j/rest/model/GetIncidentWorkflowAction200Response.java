package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetIncidentWorkflowAction200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "action"
})
@JsonTypeName("getIncidentWorkflowAction_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIncidentWorkflowAction200Response {

    /**
     * Constructs a validated implementation of {@link GetIncidentWorkflowAction200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIncidentWorkflowAction200Response(Consumer<GetIncidentWorkflowAction200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("action")
    protected IncidentWorkflowAction action;


}
