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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner
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
    "type",
    "metadata"
})
@JsonTypeName("getRelatedIncidents_200_response_related_incidents_inner_relationships_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner {

    /**
     * The type of relationship. A relationship outlines the reason why two Incidents are considered related.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("metadata")
    protected GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata metadata;

    /**
     * Constructs a validated instance of {@link GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner}.
     *
     * @param spec the specification to process
     */
    public GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner(Consumer<GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner(Consumer)} instead.
     * @param type The type of relationship. A relationship outlines the reason why two Incidents are considered related.
     * @param metadata var.name
     */
    @ApiStatus.Internal
    public GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInner(TypeEnum type, GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata metadata) {
        this.type = type;
        this.metadata = metadata;
    }

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
