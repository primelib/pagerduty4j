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
 * GetIncidentAlert200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "alert"
})
@JsonTypeName("getIncidentAlert_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIncidentAlert200Response {

    /**
     * Constructs a validated implementation of {@link GetIncidentAlert200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIncidentAlert200Response(Consumer<GetIncidentAlert200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("alert")
    protected Alert alert;


}
