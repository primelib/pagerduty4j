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
 * MergeIncidentsRequest
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
    "source_incidents"
})
@JsonTypeName("mergeIncidents_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MergeIncidentsRequest {

    /**
     * The source incidents that will be merged into the target incident and resolved.
     */
    @JsonProperty("source_incidents")
    protected List<IncidentReference> sourceIncidents;

    /**
     * Constructs a validated instance of {@link MergeIncidentsRequest}.
     *
     * @param spec the specification to process
     */
    public MergeIncidentsRequest(Consumer<MergeIncidentsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MergeIncidentsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MergeIncidentsRequest(Consumer)} instead.
     * @param sourceIncidents The source incidents that will be merged into the target incident and resolved.
     */
    @ApiStatus.Internal
    public MergeIncidentsRequest(List<IncidentReference> sourceIncidents) {
        this.sourceIncidents = sourceIncidents;
    }

}
