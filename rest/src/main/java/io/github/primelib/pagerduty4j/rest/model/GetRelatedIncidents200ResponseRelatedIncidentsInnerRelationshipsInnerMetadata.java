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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata
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
    "grouping_classification",
    "user_feedback",
    "dependent_services",
    "supporting_services"
})
@JsonTypeName("getRelatedIncidents_200_response_related_incidents_inner_relationships_inner_metadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata {

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
     * Constructs a validated instance of {@link GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata}.
     *
     * @param spec the specification to process
     */
    public GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata(Consumer<GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata(Consumer)} instead.
     * @param groupingClassification The classification for why this Related Incident was grouped into this group. Values can be one of: [similar_contents, prior_feedback], where: similar_contents - The Related Incident was due to similar contents of the Incidents. prior_feedback - The Related Incident was determined to be related, based on User feedback or Incident merge/unmerge actions. 
     * @param userFeedback userFeedback
     * @param dependentServices dependentServices
     * @param supportingServices supportingServices
     */
    @ApiStatus.Internal
    public GetRelatedIncidents200ResponseRelatedIncidentsInnerRelationshipsInnerMetadata(GroupingClassificationEnum groupingClassification, RelatedIncidentMachineLearningRelationshipUserFeedback userFeedback, List<RelatedIncidentServiceDependencyBase> dependentServices, List<RelatedIncidentServiceDependencyBase> supportingServices) {
        this.groupingClassification = groupingClassification;
        this.userFeedback = userFeedback;
        this.dependentServices = dependentServices;
        this.supportingServices = supportingServices;
    }

    /**
     * The classification for why this Related Incident was grouped into this group. Values can be one of: [similar_contents, prior_feedback], where: similar_contents - The Related Incident was due to similar contents of the Incidents. prior_feedback - The Related Incident was determined to be related, based on User feedback or Incident merge/unmerge actions. 
     */
    @AllArgsConstructor
    public enum GroupingClassificationEnum {
        SIMILAR_CONTENTS("similar_contents"),
        PRIOR_FEEDBACK("prior_feedback");

        private static final GroupingClassificationEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static GroupingClassificationEnum of(String input) {
            if (input != null) {
                for (GroupingClassificationEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
