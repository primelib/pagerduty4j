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
 * MergeIncidentsRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "source_incidents"
})
@JsonTypeName("mergeIncidents_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MergeIncidentsRequest {

    /**
     * Constructs a validated implementation of {@link MergeIncidentsRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MergeIncidentsRequest(Consumer<MergeIncidentsRequest> spec) {
        spec.accept(this);
    }

    /**
     * The source incidents that will be merged into the target incident and resolved.
     */
    @JsonProperty("source_incidents")
    protected List<IncidentReference> sourceIncidents = new ArrayList<>();


}
