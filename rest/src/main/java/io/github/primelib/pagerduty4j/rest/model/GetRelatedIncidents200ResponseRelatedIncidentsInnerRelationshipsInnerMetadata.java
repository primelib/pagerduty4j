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
 * GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "grouping_classification",
    "user_feedback",
    "dependent_services",
    "supporting_services"
})
@JsonTypeName("getRelatedIncidents_200_response_related_incidents_inner_relationships_inner_metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata {

    /**
     * Constructs a validated implementation of {@link GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata(Consumer<GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata> spec) {
        spec.accept(this);
    }

    /**
     * The classification for why this Related Incident was grouped into this group. Values can be one of: [similar_contents, prior_feedback], where: similar_contents - The Related Incident was due to similar contents of the Incidents. prior_feedback - The Related Incident was determined to be related, based on User feedback or Incident merge/unmerge actions. 
     */
    @JsonProperty("grouping_classification")
    protected GroupingClassificationEnum groupingClassification;

    @JsonProperty("user_feedback")
    protected RelatedIncidentMachineLearningRelationshipUserFeedback userFeedback;

    @JsonProperty("dependent_services")
    protected List<RelatedIncidentServiceDependencyBase> dependentServices;

    @JsonProperty("supporting_services")
    protected List<RelatedIncidentServiceDependencyBase> supportingServices;


    /**
     * The classification for why this Related Incident was grouped into this group. Values can be one of: [similar_contents, prior_feedback], where: similar_contents - The Related Incident was due to similar contents of the Incidents. prior_feedback - The Related Incident was determined to be related, based on User feedback or Incident merge/unmerge actions. 
     */
    @AllArgsConstructor
    public enum GroupingClassificationEnum {
        SIMILAR_CONTENTS("similar_contents"),
        PRIOR_FEEDBACK("prior_feedback");

        private final String value;
    }

}
