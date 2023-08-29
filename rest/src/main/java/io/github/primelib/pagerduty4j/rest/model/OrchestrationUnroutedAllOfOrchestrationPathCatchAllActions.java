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
 * OrchestrationUnroutedAllOfOrchestrationPathCatchAllActions
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
    "severity",
    "event_action",
    "variables",
    "extractions"
})
@JsonTypeName("OrchestrationUnrouted_allOf_orchestration_path_catch_all_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class OrchestrationUnroutedAllOfOrchestrationPathCatchAllActions {

    /**
     * Set the severity of the resulting alert.
     */
    @JsonProperty("severity")
    protected SeverityEnum severity;

    /**
     * Set whether the resulting alert status is trigger or resolve.
     */
    @JsonProperty("event_action")
    protected EventActionEnum eventAction;

    /**
     * Populate variables from event payloads and use those variables in other event actions.
     */
    @JsonProperty("variables")
    protected List<OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner> variables;

    /**
     * Dynamically extract values to set and modify new and existing PD-CEF fields.
     */
    @JsonProperty("extractions")
    protected List<OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInner> extractions;

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathCatchAllActions}.
     *
     * @param spec the specification to process
     */
    public OrchestrationUnroutedAllOfOrchestrationPathCatchAllActions(Consumer<OrchestrationUnroutedAllOfOrchestrationPathCatchAllActions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link OrchestrationUnroutedAllOfOrchestrationPathCatchAllActions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #OrchestrationUnroutedAllOfOrchestrationPathCatchAllActions(Consumer)} instead.
     * @param severity Set the severity of the resulting alert.
     * @param eventAction Set whether the resulting alert status is trigger or resolve.
     * @param variables Populate variables from event payloads and use those variables in other event actions.
     * @param extractions Dynamically extract values to set and modify new and existing PD-CEF fields.
     */
    @ApiStatus.Internal
    public OrchestrationUnroutedAllOfOrchestrationPathCatchAllActions(SeverityEnum severity, EventActionEnum eventAction, List<OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsVariablesInner> variables, List<OrchestrationUnroutedAllOfOrchestrationPathCatchAllActionsExtractionsInner> extractions) {
        this.severity = severity;
        this.eventAction = eventAction;
        this.variables = variables;
        this.extractions = extractions;
    }

    /**
     * Set the severity of the resulting alert.
     */
    @AllArgsConstructor
    public enum SeverityEnum {
        INFO("info"),
        ERROR("error"),
        WARNING("warning"),
        CRITICAL("critical");

        private static final SeverityEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SeverityEnum of(String input) {
            if (input != null) {
                for (SeverityEnum v : VALUES) {
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
     * Set whether the resulting alert status is trigger or resolve.
     */
    @AllArgsConstructor
    public enum EventActionEnum {
        TRIGGER("trigger"),
        RESOLVE("resolve");

        private static final EventActionEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static EventActionEnum of(String input) {
            if (input != null) {
                for (EventActionEnum v : VALUES) {
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
