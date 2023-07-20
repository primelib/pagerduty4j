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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AutomationActionsRunnerAllOfAssociatedActions
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
    "actions",
    "more"
})
@JsonTypeName("AutomationActionsRunner_allOf_associated_actions")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsRunnerAllOfAssociatedActions {

    @JsonProperty("actions")
    protected List<AutomationActionsRunnerAllOfAssociatedActionsAllOfActionsInner> actions;

    /**
     * Indicates whether more actions exist for the Runner.
     */
    @JsonProperty("more")
    protected Boolean more;

    /**
     * Constructs a validated instance of {@link AutomationActionsRunnerAllOfAssociatedActions}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsRunnerAllOfAssociatedActions(Consumer<AutomationActionsRunnerAllOfAssociatedActions> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsRunnerAllOfAssociatedActions}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsRunnerAllOfAssociatedActions(Consumer)} instead.
     * @param actions var.name
     * @param more Indicates whether more actions exist for the Runner.
     */
    @ApiStatus.Internal
    public AutomationActionsRunnerAllOfAssociatedActions(List<AutomationActionsRunnerAllOfAssociatedActionsAllOfActionsInner> actions, Boolean more) {
        this.actions = actions;
        this.more = more;
    }

}
