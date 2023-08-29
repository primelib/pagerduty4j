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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AutomationActionsInvocationAllOfTiming
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
    "timestamp",
    "state"
})
@JsonTypeName("AutomationActionsInvocation_allOf_timing")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsInvocationAllOfTiming {

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
     * Constructs a validated instance of {@link AutomationActionsInvocationAllOfTiming}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsInvocationAllOfTiming(Consumer<AutomationActionsInvocationAllOfTiming> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsInvocationAllOfTiming}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsInvocationAllOfTiming(Consumer)} instead.
     * @param timestamp The date/time
     * @param state prepared -- the invocation exists and can be referenced, but is NOT available to a Runner &amp;lt;br&amp;gt; created -- the invocation exists and is waiting for a Runner &amp;lt;br&amp;gt; sent -- invocation sent to a Runner &amp;lt;br&amp;gt; queued -- invocation queued by a Runner &amp;lt;br&amp;gt; running -- invocation is being ran by a Runner &amp;lt;br&amp;gt; aborted -- invocation was aborted on a Runner &amp;lt;br&amp;gt; completed -- invocation completed on a Runner &amp;lt;br&amp;gt; error -- invocation encountered an error on a Runner
     */
    @ApiStatus.Internal
    public AutomationActionsInvocationAllOfTiming(OffsetDateTime timestamp, StateEnum state) {
        this.timestamp = timestamp;
        this.state = state;
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
