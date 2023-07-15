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
 * GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "metadata"
})
@JsonTypeName("getRelatedIncidents_200_response_related_incidents_inner_relationships_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner {

    /**
     * Constructs a validated implementation of {@link GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner(Consumer<GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner> spec) {
        spec.accept(this);
    }

    /**
     * The type of relationship. A relationship outlines the reason why two Incidents are considered related.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("metadata")
    protected GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata metadata;


    /**
     * The type of relationship. A relationship outlines the reason why two Incidents are considered related.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        MACHINE_LEARNING_INFERRED("machine_learning_inferred"),
        SERVICE_DEPENDENCY("service_dependency");

        private final String value;
    }

}
