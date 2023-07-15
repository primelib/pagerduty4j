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
 * RelatedIncidentMachineLearningRelationship
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "grouping_classification",
    "user_feedback"
})
@JsonTypeName("RelatedIncidentMachineLearningRelationship")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RelatedIncidentMachineLearningRelationship {

    /**
     * Constructs a validated implementation of {@link RelatedIncidentMachineLearningRelationship}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RelatedIncidentMachineLearningRelationship(Consumer<RelatedIncidentMachineLearningRelationship> spec) {
        spec.accept(this);
    }

    /**
     * The classification for why this Related Incident was grouped into this group. Values can be one of: [similar_contents, prior_feedback], where: similar_contents - The Related Incident was due to similar contents of the Incidents. prior_feedback - The Related Incident was determined to be related, based on User feedback or Incident merge/unmerge actions. 
     */
    @JsonProperty("grouping_classification")
    protected GroupingClassificationEnum groupingClassification;

    @JsonProperty("user_feedback")
    protected RelatedIncidentMachineLearningRelationshipUserFeedback userFeedback;


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
