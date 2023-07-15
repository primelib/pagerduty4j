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
 * AutomationActionsProcessAutomationJobActionDataReference
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "process_automation_job_id",
    "process_automation_job_arguments",
    "process_automation_node_filter"
})
@JsonTypeName("AutomationActionsProcessAutomationJobActionDataReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsProcessAutomationJobActionDataReference {

    /**
     * Constructs a validated implementation of {@link AutomationActionsProcessAutomationJobActionDataReference}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutomationActionsProcessAutomationJobActionDataReference(Consumer<AutomationActionsProcessAutomationJobActionDataReference> spec) {
        spec.accept(this);
    }

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


}
