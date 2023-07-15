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
 * ScheduledAction
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "at",
    "to_urgency"
})
@JsonTypeName("ScheduledAction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScheduledAction {

    /**
     * Constructs a validated implementation of {@link ScheduledAction}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScheduledAction(Consumer<ScheduledAction> spec) {
        spec.accept(this);
    }

    /**
     * The type of schedule action. Must be set to urgency_change.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("at")
    protected ScheduledActionAt at;

    /**
     * Urgency level. Must be set to high.
     */
    @JsonProperty("to_urgency")
    protected ToUrgencyEnum toUrgency;


    /**
     * The type of schedule action. Must be set to urgency_change.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        URGENCY_CHANGE("urgency_change");

        private final String value;
    }

    /**
     * Urgency level. Must be set to high.
     */
    @AllArgsConstructor
    public enum ToUrgencyEnum {
        HIGH("high");

        private final String value;
    }

}
