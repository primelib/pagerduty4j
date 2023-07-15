package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AutomationActionsProcessAutomationJobActionDataReference
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "process_automation_job_id",
    "process_automation_job_arguments",
    "process_automation_node_filter"
})
@JsonTypeName("AutomationActionsProcessAutomationJobActionDataReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsProcessAutomationJobActionDataReference {

    @JsonProperty("process_automation_job_id")
    private String processAutomationJobId;

    /**
     * Arguments to pass to the Process Automation job. The maxLength value is specified in bytes.
     */
    @JsonProperty("process_automation_job_arguments")
    private String processAutomationJobArguments;

    /**
     * Node filter for the Process Automation job. The maxLength value is specified in bytes. Filter syntax: https://docs.rundeck.com/docs/manual/11-node-filters.html#node-filter-syntax
     */
    @JsonProperty("process_automation_node_filter")
    private String processAutomationNodeFilter;


}
