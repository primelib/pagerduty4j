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
 * AutomationActionsInvocationAllOfActionSnapshot
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "action_type",
    "action_data_reference"
})
@JsonTypeName("AutomationActionsInvocation_allOf_action_snapshot")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsInvocationAllOfActionSnapshot {

    /**
     * Constructs a validated implementation of {@link AutomationActionsInvocationAllOfActionSnapshot}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutomationActionsInvocationAllOfActionSnapshot(Consumer<AutomationActionsInvocationAllOfActionSnapshot> spec) {
        spec.accept(this);
    }

    @JsonProperty("name")
    protected String name;

    @JsonProperty("action_type")
    protected ActionTypeEnum actionType;

    @JsonProperty("action_data_reference")
    protected AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference actionDataReference;


    @AllArgsConstructor
    public enum ActionTypeEnum {
        SCRIPT("script"),
        PROCESS_AUTOMATION("process_automation");

        private final String value;
    }

}
