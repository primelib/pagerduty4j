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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateChangeEvent5XXResponse
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

    /**
     * Constructs a validated instance of {@link CreateChangeEvent5XXResponse}.
     *
     * @param spec the specification to process
     */
    public CreateChangeEvent5XXResponse(Consumer<CreateChangeEvent5XXResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateChangeEvent5XXResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateChangeEvent5XXResponse(Consumer)} instead.
     * @param status A short name for the error.
     * @param message A description of the problem.
     * @param errors An array of specific error messages.
     */
    @ApiStatus.Internal
    public CreateChangeEvent5XXResponse(String status, String message, List<String> errors) {
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

}
