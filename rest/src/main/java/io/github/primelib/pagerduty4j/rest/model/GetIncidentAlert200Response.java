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
 * GetIncidentAlert200Response
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
    "alert"
})
@JsonTypeName("getIncidentAlert_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIncidentAlert200Response {

    @JsonProperty("alert")
    protected Alert alert;

    /**
     * Constructs a validated instance of {@link GetIncidentAlert200Response}.
     *
     * @param spec the specification to process
     */
    public GetIncidentAlert200Response(Consumer<GetIncidentAlert200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetIncidentAlert200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetIncidentAlert200Response(Consumer)} instead.
     * @param alert alert
     */
    @ApiStatus.Internal
    public GetIncidentAlert200Response(Alert alert) {
        this.alert = alert;
    }

}
