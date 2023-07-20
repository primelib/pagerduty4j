package io.github.primelib.pagerduty4j.eventsv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateChangeEvent202Response
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "status",
    "dedup_key",
    "message"
})
@JsonTypeName("createChangeEvent_202_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateChangeEvent202Response {

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

    /**
     * Constructs a validated instance of {@link CreateChangeEvent202Response}.
     *
     * @param spec the specification to process
     */
    public CreateChangeEvent202Response(Consumer<CreateChangeEvent202Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateChangeEvent202Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateChangeEvent202Response(Consumer)} instead.
     * @param status Returns "success" if successful, or a short error message in case of a failure.
     * @param dedupKey The key used to correlate triggers, acknowledges, and resolves for the same alert.
     * @param message A description of the problem, or "Event processed" if successful.
     */
    @ApiStatus.Internal
    public CreateChangeEvent202Response(String status, String dedupKey, String message) {
        this.status = status;
        this.dedupKey = dedupKey;
        this.message = message;
    }

}
