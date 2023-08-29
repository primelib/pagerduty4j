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
 * AutomationActionsProcessAutomationJobActionDataReference
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
    "process_automation_job_id",
    "process_automation_job_arguments",
    "process_automation_node_filter"
})
@JsonTypeName("AutomationActionsProcessAutomationJobActionDataReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsProcessAutomationJobActionDataReference {

    @JsonProperty("process_automation_job_id")
    protected String processAutomationJobId;

    /**
     * Arguments to pass to the Process Automation job. The maxLength value is specified in bytes.
     */
    @JsonProperty("process_automation_job_arguments")
    protected String processAutomationJobArguments;

    /**
     * Node filter for the Process Automation job. The maxLength value is specified in bytes. Filter syntax: https://docs.rundeck.com/docs/manual/11-node-filters.html#node-filter-syntax
     */
    @JsonProperty("process_automation_node_filter")
    protected String processAutomationNodeFilter;

    /**
     * Constructs a validated instance of {@link AutomationActionsProcessAutomationJobActionDataReference}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsProcessAutomationJobActionDataReference(Consumer<AutomationActionsProcessAutomationJobActionDataReference> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsProcessAutomationJobActionDataReference}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsProcessAutomationJobActionDataReference(Consumer)} instead.
     * @param processAutomationJobId processAutomationJobId
     * @param processAutomationJobArguments Arguments to pass to the Process Automation job. The maxLength value is specified in bytes.
     * @param processAutomationNodeFilter Node filter for the Process Automation job. The maxLength value is specified in bytes. Filter syntax: https://docs.rundeck.com/docs/manual/11-node-filters.html#node-filter-syntax
     */
    @ApiStatus.Internal
    public AutomationActionsProcessAutomationJobActionDataReference(String processAutomationJobId, String processAutomationJobArguments, String processAutomationNodeFilter) {
        this.processAutomationJobId = processAutomationJobId;
        this.processAutomationJobArguments = processAutomationJobArguments;
        this.processAutomationNodeFilter = processAutomationNodeFilter;
    }

}
