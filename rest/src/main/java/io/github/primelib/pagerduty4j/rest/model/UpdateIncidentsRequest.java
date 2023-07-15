package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateIncidentsRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "incidents"
})
@JsonTypeName("updateIncidents_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIncidentsRequest {

    /**
     * Constructs a validated implementation of {@link UpdateIncidentsRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateIncidentsRequest(Consumer<UpdateIncidentsRequest> spec) {
        spec.accept(this);
    }

    /**
     * An array of incidents, including the parameters to update.
     */
    @JsonProperty("incidents")
    protected List<UpdateIncidentsRequestIncidentsInner> incidents = new ArrayList<>();


}
