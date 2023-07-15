package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetRelatedIncidents200ResponseRelatedIncidentsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "incident",
    "relationships"
})
@JsonTypeName("getRelatedIncidents_200_response_related_incidents_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRelatedIncidents200ResponseRelatedIncidentsInner {

    /**
     * Constructs a validated implementation of {@link GetRelatedIncidents200ResponseRelatedIncidentsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetRelatedIncidents200ResponseRelatedIncidentsInner(Consumer<GetRelatedIncidents200ResponseRelatedIncidentsInner> spec) {
        spec.accept(this);
    }

    @JsonProperty("incident")
    protected Incident incident;

    /**
     * A list of reasons for why the Incident is considered related.
     */
    @JsonProperty("relationships")
    protected List<GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner> relationships;


}
