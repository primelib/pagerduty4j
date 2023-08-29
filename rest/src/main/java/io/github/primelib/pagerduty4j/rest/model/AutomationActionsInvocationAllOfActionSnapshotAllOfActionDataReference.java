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
 * AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference
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
    "process_automation_node_filter",
    "script",
    "invocation_command"
})
@JsonTypeName("AutomationActionsInvocation_allOf_action_snapshot_allOf_action_data_reference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference {

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
     * Body of the script to be executed on the Runner. To execute it, the Runner will write the content of the property into a temp file, make the file executable and execute it. It is assumed that the Runner has a properly configured environment to run the script as an executable file. This behaviour can be altered by providing the {@code invocation_command} property. The maxLength value is specified in bytes.
     */
    @JsonProperty("script")
    protected String script;

    /**
     * The command to executed a script with. With the body of the script written into a temp file, the Runner will execute the {@code &amp;lt;invocation_command&amp;gt; &amp;lt;temp_file&amp;gt;} command. The maxLength value is specified in bytes.
     */
    @JsonProperty("invocation_command")
    protected String invocationCommand;

    /**
     * Constructs a validated instance of {@link AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference(Consumer<AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference(Consumer)} instead.
     * @param processAutomationJobId processAutomationJobId
     * @param processAutomationJobArguments Arguments to pass to the Process Automation job. The maxLength value is specified in bytes.
     * @param processAutomationNodeFilter Node filter for the Process Automation job. The maxLength value is specified in bytes. Filter syntax: https://docs.rundeck.com/docs/manual/11-node-filters.html#node-filter-syntax
     * @param script Body of the script to be executed on the Runner. To execute it, the Runner will write the content of the property into a temp file, make the file executable and execute it. It is assumed that the Runner has a properly configured environment to run the script as an executable file. This behaviour can be altered by providing the {@code invocation_command} property. The maxLength value is specified in bytes.
     * @param invocationCommand The command to executed a script with. With the body of the script written into a temp file, the Runner will execute the {@code &amp;lt;invocation_command&amp;gt; &amp;lt;temp_file&amp;gt;} command. The maxLength value is specified in bytes.
     */
    @ApiStatus.Internal
    public AutomationActionsInvocationAllOfActionSnapshotAllOfActionDataReference(String processAutomationJobId, String processAutomationJobArguments, String processAutomationNodeFilter, String script, String invocationCommand) {
        this.processAutomationJobId = processAutomationJobId;
        this.processAutomationJobArguments = processAutomationJobArguments;
        this.processAutomationNodeFilter = processAutomationNodeFilter;
        this.script = script;
        this.invocationCommand = invocationCommand;
    }

}
