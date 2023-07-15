package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrchestrationWarningIneligible
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "message",
    "rule_id",
    "feature",
    "feature_type",
    "warning_type"
})
@JsonTypeName("OrchestrationWarningIneligible")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationWarningIneligible {

    /**
     * A description of the warning and any potential side effects.
     */
    @JsonProperty("message")
    private String message;

    /**
     * The ID of the rule using the feature.
     */
    @JsonProperty("rule_id")
    private String ruleId;

    /**
     * The feature that the current account plan does not have access to.
     */
    @JsonProperty("feature")
    private FeatureEnum feature;

    /**
     * Specifies whether the feature is a part of the rule's conditions, or its actions.
     */
    @JsonProperty("feature_type")
    private FeatureTypeEnum featureType;

    /**
     * The type of warning that is being returned for the rule.
     */
    @JsonProperty("warning_type")
    private WarningTypeEnum warningType;


    /**
     * The feature that the current account plan does not have access to.
     */
    @AllArgsConstructor
    public enum FeatureEnum {
        THRESHOLD_CONDITION("threshold_condition"),
        RECURRING_CONDITION("recurring_condition"),
        SCHEDULED_CONDITION("scheduled_condition"),
        NESTED_RULES("nested_rules"),
        SUSPEND("suspend"),
        AUTOMATION_ACTIONS("automation_actions"),
        PAGERDUTY_AUTOMATION_ACTIONS("pagerduty_automation_actions"),
        EXTRACTIONS("extractions"),
        VARIABLES("variables"),
        SUPPRESS("suppress");

        private final String value;
    }

    /**
     * Specifies whether the feature is a part of the rule's conditions, or its actions.
     */
    @AllArgsConstructor
    public enum FeatureTypeEnum {
        CONDITIONS("conditions"),
        ACTIONS("actions"),
        NESTED_RULES("nested_rules");

        private final String value;
    }

    /**
     * The type of warning that is being returned for the rule.
     */
    @AllArgsConstructor
    public enum WarningTypeEnum {
        FORBIDDEN_FEATURE("forbidden_feature");

        private final String value;
    }

}
