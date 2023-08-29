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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RelatedIncidentMachineLearningRelationshipUserFeedback
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
    protected Integer positiveFeedbackCount;

    /**
     * The total number of times Users disagreed that the Incidents are related.
     */
    @JsonProperty("negative_feedback_count")
    protected Integer negativeFeedbackCount;

    /**
     * Constructs a validated instance of {@link RelatedIncidentMachineLearningRelationshipUserFeedback}.
     *
     * @param spec the specification to process
     */
    public RelatedIncidentMachineLearningRelationshipUserFeedback(Consumer<RelatedIncidentMachineLearningRelationshipUserFeedback> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RelatedIncidentMachineLearningRelationshipUserFeedback}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RelatedIncidentMachineLearningRelationshipUserFeedback(Consumer)} instead.
     * @param positiveFeedbackCount The total number of times Users agreed that the Incidents are related.
     * @param negativeFeedbackCount The total number of times Users disagreed that the Incidents are related.
     */
    @ApiStatus.Internal
    public RelatedIncidentMachineLearningRelationshipUserFeedback(Integer positiveFeedbackCount, Integer negativeFeedbackCount) {
        this.positiveFeedbackCount = positiveFeedbackCount;
        this.negativeFeedbackCount = negativeFeedbackCount;
    }

}
