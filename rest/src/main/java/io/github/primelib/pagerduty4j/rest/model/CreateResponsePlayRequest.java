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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateResponsePlayRequest
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
    "response_play"
})
@JsonTypeName("createResponsePlay_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateResponsePlayRequest {

    @JsonProperty("response_play")
    protected ResponsePlay responsePlay;

    /**
     * Constructs a validated instance of {@link CreateResponsePlayRequest}.
     *
     * @param spec the specification to process
     */
    public CreateResponsePlayRequest(Consumer<CreateResponsePlayRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateResponsePlayRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateResponsePlayRequest(Consumer)} instead.
     * @param responsePlay responsePlay
     */
    @ApiStatus.Internal
    public CreateResponsePlayRequest(ResponsePlay responsePlay) {
        this.responsePlay = responsePlay;
    }

}
