package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AutomationActionsInvocationAllOfTiming
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "timestamp",
    "state"
})
@JsonTypeName("AutomationActionsInvocation_allOf_timing")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsInvocationAllOfTiming {

    /**
     * Constructs a validated implementation of {@link AutomationActionsInvocationAllOfTiming}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutomationActionsInvocationAllOfTiming(Consumer<AutomationActionsInvocationAllOfTiming> spec) {
        spec.accept(this);
    }

    /**
     * The date/time
     */
    @JsonProperty("timestamp")
    protected OffsetDateTime timestamp;

    /**
     * prepared -- the invocation exists and can be referenced, but is NOT available to a Runner &amp;lt;br&amp;gt; created -- the invocation exists and is waiting for a Runner &amp;lt;br&amp;gt; sent -- invocation sent to a Runner &amp;lt;br&amp;gt; queued -- invocation queued by a Runner &amp;lt;br&amp;gt; running -- invocation is being ran by a Runner &amp;lt;br&amp;gt; aborted -- invocation was aborted on a Runner &amp;lt;br&amp;gt; completed -- invocation completed on a Runner &amp;lt;br&amp;gt; error -- invocation encountered an error on a Runner
     */
    @JsonProperty("state")
    protected StateEnum state;


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
