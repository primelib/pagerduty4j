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
 * GetStatusPageSeverity200Response
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
    "severity"
})
@JsonTypeName("getStatusPageSeverity_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetStatusPageSeverity200Response {

    @JsonProperty("severity")
    protected StatusPageSeverity severity;

    /**
     * Constructs a validated instance of {@link GetStatusPageSeverity200Response}.
     *
     * @param spec the specification to process
     */
    public GetStatusPageSeverity200Response(Consumer<GetStatusPageSeverity200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetStatusPageSeverity200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetStatusPageSeverity200Response(Consumer)} instead.
     * @param severity severity
     */
    @ApiStatus.Internal
    public GetStatusPageSeverity200Response(StatusPageSeverity severity) {
        this.severity = severity;
    }

}
