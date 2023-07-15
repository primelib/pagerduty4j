package io.github.primelib.pagerduty4j.eventsv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "status",
    "message",
    "errors"
})
@JsonTypeName("createChangeEvent_5XX_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateChangeEvent5XXResponse {

    /**
     * Constructs a validated implementation of {@link CreateChangeEvent5XXResponse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateChangeEvent5XXResponse(Consumer<CreateChangeEvent5XXResponse> spec) {
        spec.accept(this);
    }

    /**
     * A short name for the error.
     */
    @JsonProperty("status")
    protected String status;

    /**
     * A description of the problem.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * An array of specific error messages.
     */
    @JsonProperty("errors")
    protected List<String> errors;


}
