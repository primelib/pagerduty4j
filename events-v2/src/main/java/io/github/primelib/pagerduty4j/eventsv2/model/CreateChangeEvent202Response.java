package io.github.primelib.pagerduty4j.eventsv2.model;

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
 * CreateChangeEvent202Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "status",
    "dedup_key",
    "message"
})
@JsonTypeName("createChangeEvent_202_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateChangeEvent202Response {

    /**
     * Constructs a validated implementation of {@link CreateChangeEvent202Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateChangeEvent202Response(Consumer<CreateChangeEvent202Response> spec) {
        spec.accept(this);
    }

    /**
     * Returns "success" if successful, or a short error message in case of a failure.
     */
    @JsonProperty("status")
    protected String status;

    /**
     * The key used to correlate triggers, acknowledges, and resolves for the same alert.
     */
    @JsonProperty("dedup_key")
    protected String dedupKey;

    /**
     * A description of the problem, or "Event processed" if successful.
     */
    @JsonProperty("message")
    protected String message;


}
