package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RelatedIncidentMachineLearningRelationshipUserFeedback
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "positive_feedback_count",
    "negative_feedback_count"
})
@JsonTypeName("RelatedIncidentMachineLearningRelationship_user_feedback")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RelatedIncidentMachineLearningRelationshipUserFeedback {

    /**
     * The total number of times Users agreed that the Incidents are related.
     */
    @JsonProperty("positive_feedback_count")
    private Integer positiveFeedbackCount;

    /**
     * The total number of times Users disagreed that the Incidents are related.
     */
    @JsonProperty("negative_feedback_count")
    private Integer negativeFeedbackCount;


}
