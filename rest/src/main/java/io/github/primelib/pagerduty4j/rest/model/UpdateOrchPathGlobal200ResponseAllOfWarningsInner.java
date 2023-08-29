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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * UpdateOrchPathGlobal200ResponseAllOfWarningsInner
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
    "message",
    "rule_id",
    "feature",
    "feature_type",
    "warning_type"
})
@JsonTypeName("updateOrchPathGlobal_200_response_allOf_warnings_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateOrchPathGlobal200ResponseAllOfWarningsInner {

    /**
     * A description of the warning and any potential side effects.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * The ID of the rule using the feature.
     */
    @JsonProperty("rule_id")
    protected String ruleId;

    /**
     * The feature that the current account plan does not have access to.
     */
    @JsonProperty("feature")
    protected FeatureEnum feature;

    /**
     * Specifies whether the feature is a part of the rule's conditions, or its actions.
     */
    @JsonProperty("feature_type")
    protected FeatureTypeEnum featureType;

    /**
     * The type of warning that is being returned for the rule.
     */
    @JsonProperty("warning_type")
    protected WarningTypeEnum warningType;

    /**
     * Constructs a validated instance of {@link UpdateOrchPathGlobal200ResponseAllOfWarningsInner}.
     *
     * @param spec the specification to process
     */
    public UpdateOrchPathGlobal200ResponseAllOfWarningsInner(Consumer<UpdateOrchPathGlobal200ResponseAllOfWarningsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateOrchPathGlobal200ResponseAllOfWarningsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateOrchPathGlobal200ResponseAllOfWarningsInner(Consumer)} instead.
     * @param message A description of the warning and any potential side effects.
     * @param ruleId The ID of the rule using the feature.
     * @param feature The feature that the current account plan does not have access to.
     * @param featureType Specifies whether the feature is a part of the rule's conditions, or its actions.
     * @param warningType The type of warning that is being returned for the rule.
     */
    @ApiStatus.Internal
    public UpdateOrchPathGlobal200ResponseAllOfWarningsInner(String message, String ruleId, FeatureEnum feature, FeatureTypeEnum featureType, WarningTypeEnum warningType) {
        this.message = message;
        this.ruleId = ruleId;
        this.feature = feature;
        this.featureType = featureType;
        this.warningType = warningType;
    }

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

        private static final FeatureEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static FeatureEnum of(String input) {
            if (input != null) {
                for (FeatureEnum v : VALUES) {
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

    /**
     * Specifies whether the feature is a part of the rule's conditions, or its actions.
     */
    @AllArgsConstructor
    public enum FeatureTypeEnum {
        CONDITIONS("conditions"),
        ACTIONS("actions"),
        NESTED_RULES("nested_rules");

        private static final FeatureTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static FeatureTypeEnum of(String input) {
            if (input != null) {
                for (FeatureTypeEnum v : VALUES) {
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

    /**
     * The type of warning that is being returned for the rule.
     */
    @AllArgsConstructor
    public enum WarningTypeEnum {
        FORBIDDEN_FEATURE("forbidden_feature");

        private static final WarningTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static WarningTypeEnum of(String input) {
            if (input != null) {
                for (WarningTypeEnum v : VALUES) {
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
