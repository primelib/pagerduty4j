package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAutomationActionInvocation201ResponseInvocation
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "summary",
    "type",
    "self",
    "html_url",
    "action_snapshot",
    "runner_id",
    "timing",
    "duration",
    "state",
    "action_id",
    "metadata"
})
@JsonTypeName("createAutomationActionInvocation_201_response_invocation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateAutomationActionInvocation201ResponseInvocation {

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by `_reference` if the object is a reference.
     */
    @JsonProperty("type")
    private String type;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    private String htmlUrl;

    @JsonProperty("action_snapshot")
    private AutomationActionsInvocationAllOfActionSnapshot actionSnapshot;

    @JsonProperty("runner_id")
    private String runnerId;

    /**
     * A list of state transitions with timestamps. Only the 'created' transition is guaranteed to exist at any time.
     */
    @JsonProperty("timing")
    private List<AutomationActionsInvocationAllOfTiming> timing = new ArrayList<>();

    /**
     * The duration of the invocation's execution time.
     */
    @JsonProperty("duration")
    private Integer duration;

    /**
     * prepared -- the invocation exists and can be referenced, but is NOT available to a Runner &amp;lt;br&amp;gt; created -- the invocation exists and is waiting for a Runner &amp;lt;br&amp;gt; sent -- invocation sent to a Runner &amp;lt;br&amp;gt; queued -- invocation queued by a Runner &amp;lt;br&amp;gt; running -- invocation is being ran by a Runner &amp;lt;br&amp;gt; aborted -- invocation was aborted on a Runner &amp;lt;br&amp;gt; completed -- invocation completed on a Runner &amp;lt;br&amp;gt; error -- invocation encountered an error on a Runner
     */
    @JsonProperty("state")
    private StateEnum state;

    @JsonProperty("action_id")
    private String actionId;

    @JsonProperty("metadata")
    private AutomationActionsInvocationAllOfMetadata metadata;


    /**
     * prepared -- the invocation exists and can be referenced, but is NOT available to a Runner &amp;lt;br&amp;gt; created -- the invocation exists and is waiting for a Runner &amp;lt;br&amp;gt; sent -- invocation sent to a Runner &amp;lt;br&amp;gt; queued -- invocation queued by a Runner &amp;lt;br&amp;gt; running -- invocation is being ran by a Runner &amp;lt;br&amp;gt; aborted -- invocation was aborted on a Runner &amp;lt;br&amp;gt; completed -- invocation completed on a Runner &amp;lt;br&amp;gt; error -- invocation encountered an error on a Runner
     */
    @AllArgsConstructor
    public enum StateEnum {
        PREPARED("prepared"),
        CREATED("created"),
        SENT("sent"),
        QUEUED("queued"),
        RUNNING("running"),
        ABORTED("aborted"),
        COMPLETED("completed"),
        ERROR("error");

        private final String value;
    }

}
