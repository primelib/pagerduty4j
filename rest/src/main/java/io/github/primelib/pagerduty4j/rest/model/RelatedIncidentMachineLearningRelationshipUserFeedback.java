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
 * RelatedIncidentMachineLearningRelationshipUserFeedback
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "positive_feedback_count",
    "negative_feedback_count"
})
@JsonTypeName("RelatedIncidentMachineLearningRelationship_user_feedback")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RelatedIncidentMachineLearningRelationshipUserFeedback {

    /**
     * Constructs a validated implementation of {@link RelatedIncidentMachineLearningRelationshipUserFeedback}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RelatedIncidentMachineLearningRelationshipUserFeedback(Consumer<RelatedIncidentMachineLearningRelationshipUserFeedback> spec) {
        spec.accept(this);
    }

    /**
     * The total number of times Users agreed that the Incidents are related.
     */
    @JsonProperty("positive_feedback_count")
    protected Integer positiveFeedbackCount;

    /**
     * The total number of times Users disagreed that the Incidents are related.
     */
    @JsonProperty("negative_feedback_count")
    protected Integer negativeFeedbackCount;


}
