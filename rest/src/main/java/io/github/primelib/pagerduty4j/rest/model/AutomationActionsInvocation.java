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
 * AutomationActionsInvocation
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
@JsonTypeName("AutomationActionsInvocation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsInvocation {

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    @JsonProperty("action_snapshot")
    protected AutomationActionsInvocationAllOfActionSnapshot actionSnapshot;

    @JsonProperty("runner_id")
    protected String runnerId;

    /**
     * A list of state transitions with timestamps, sorted in ascending order by timestamp. Only the 'created' transition is guaranteed to exist at any time.
     */
    @JsonProperty("timing")
    protected List<AutomationActionsInvocationAllOfTiming> timing;

    /**
     * The duration of the invocation's execution time.
     */
    @JsonProperty("duration")
    protected Integer duration;

    /**
     * prepared -- the invocation exists and can be referenced, but is NOT available to a Runner &amp;lt;br&amp;gt; created -- the invocation exists and is waiting for a Runner &amp;lt;br&amp;gt; sent -- invocation sent to a Runner &amp;lt;br&amp;gt; queued -- invocation queued by a Runner &amp;lt;br&amp;gt; running -- invocation is being ran by a Runner &amp;lt;br&amp;gt; aborted -- invocation was aborted on a Runner &amp;lt;br&amp;gt; completed -- invocation completed on a Runner &amp;lt;br&amp;gt; error -- invocation encountered an error on a Runner
     */
    @JsonProperty("state")
    protected StateEnum state;

    @JsonProperty("action_id")
    protected String actionId;

    @JsonProperty("metadata")
    protected AutomationActionsInvocationAllOfMetadata metadata;

    /**
     * Constructs a validated instance of {@link AutomationActionsInvocation}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsInvocation(Consumer<AutomationActionsInvocation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsInvocation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsInvocation(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param actionSnapshot actionSnapshot
     * @param runnerId runnerId
     * @param timing A list of state transitions with timestamps, sorted in ascending order by timestamp. Only the 'created' transition is guaranteed to exist at any time.
     * @param duration The duration of the invocation's execution time.
     * @param state prepared -- the invocation exists and can be referenced, but is NOT available to a Runner &amp;lt;br&amp;gt; created -- the invocation exists and is waiting for a Runner &amp;lt;br&amp;gt; sent -- invocation sent to a Runner &amp;lt;br&amp;gt; queued -- invocation queued by a Runner &amp;lt;br&amp;gt; running -- invocation is being ran by a Runner &amp;lt;br&amp;gt; aborted -- invocation was aborted on a Runner &amp;lt;br&amp;gt; completed -- invocation completed on a Runner &amp;lt;br&amp;gt; error -- invocation encountered an error on a Runner
     * @param actionId actionId
     * @param metadata metadata
     */
    @ApiStatus.Internal
    public AutomationActionsInvocation(String id, String summary, String type, String self, String htmlUrl, AutomationActionsInvocationAllOfActionSnapshot actionSnapshot, String runnerId, List<AutomationActionsInvocationAllOfTiming> timing, Integer duration, StateEnum state, String actionId, AutomationActionsInvocationAllOfMetadata metadata) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.actionSnapshot = actionSnapshot;
        this.runnerId = runnerId;
        this.timing = timing;
        this.duration = duration;
        this.state = state;
        this.actionId = actionId;
        this.metadata = metadata;
    }

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

        private static final StateEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StateEnum of(String input) {
            if (input != null) {
                for (StateEnum v : VALUES) {
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
