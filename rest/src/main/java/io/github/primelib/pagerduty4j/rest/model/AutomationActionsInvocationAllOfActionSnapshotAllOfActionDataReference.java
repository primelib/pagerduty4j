package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "process_automation_job_id",
    "process_automation_job_arguments",
    "process_automation_node_filter",
    "script",
    "invocation_command"
})
@JsonTypeName("AutomationActionsInvocation_allOf_action_snapshot_allOf_action_data_reference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference {

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

    /**
     * Body of the script to be executed on the Runner. To execute it, the Runner will write the content of the property into a temp file, make the file executable and execute it. It is assumed that the Runner has a properly configured environment to run the script as an executable file. This behaviour can be altered by providing the `invocation_command` property. The maxLength value is specified in bytes.
     */
    @JsonProperty("script")
    private String script;

    /**
     * The command to executed a script with. With the body of the script written into a temp file, the Runner will execute the `&amp;lt;invocation_command&amp;gt; &amp;lt;temp_file&amp;gt;` command. The maxLength value is specified in bytes.
     */
    @JsonProperty("invocation_command")
    private String invocationCommand;


}
