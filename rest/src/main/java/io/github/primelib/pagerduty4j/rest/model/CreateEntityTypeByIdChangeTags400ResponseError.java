package io.github.primelib.pagerduty4j.rest.model;

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
 * CreateEntityTypeByIdChangeTags400ResponseError
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
    "code",
    "message",
    "errors"
})
@JsonTypeName("createEntityTypeByIdChangeTags_400_response_error")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateEntityTypeByIdChangeTags400ResponseError {

    @JsonProperty("code")
    protected Integer code;

    /**
     * Error message string
     */
    @JsonProperty("message")
    protected String message;

    @JsonProperty("errors")
    protected List<String> errors;

    /**
     * Constructs a validated instance of {@link CreateEntityTypeByIdChangeTags400ResponseError}.
     *
     * @param spec the specification to process
     */
    public CreateEntityTypeByIdChangeTags400ResponseError(Consumer<CreateEntityTypeByIdChangeTags400ResponseError> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateEntityTypeByIdChangeTags400ResponseError}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateEntityTypeByIdChangeTags400ResponseError(Consumer)} instead.
     * @param code code
     * @param message Error message string
     * @param errors errors
     */
    @ApiStatus.Internal
    public CreateEntityTypeByIdChangeTags400ResponseError(Integer code, String message, List<String> errors) {
        this.code = code;
        this.message = message;
        this.errors = errors;
    }

}
