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
 * GetRelatedIncidents200ResponseRelatedIncidentsInner
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
    "incident",
    "relationships"
})
@JsonTypeName("getRelatedIncidents_200_response_related_incidents_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRelatedIncidents200ResponseRelatedIncidentsInner {

    @JsonProperty("incident")
    protected Incident incident;

    /**
     * A list of reasons for why the Incident is considered related.
     */
    @JsonProperty("relationships")
    protected List<GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner> relationships;

    /**
     * Constructs a validated instance of {@link GetRelatedIncidents200ResponseRelatedIncidentsInner}.
     *
     * @param spec the specification to process
     */
    public GetRelatedIncidents200ResponseRelatedIncidentsInner(Consumer<GetRelatedIncidents200ResponseRelatedIncidentsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetRelatedIncidents200ResponseRelatedIncidentsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetRelatedIncidents200ResponseRelatedIncidentsInner(Consumer)} instead.
     * @param incident var.name
     * @param relationships A list of reasons for why the Incident is considered related.
     */
    @ApiStatus.Internal
    public GetRelatedIncidents200ResponseRelatedIncidentsInner(Incident incident, List<GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner> relationships) {
        this.incident = incident;
        this.relationships = relationships;
    }

}
