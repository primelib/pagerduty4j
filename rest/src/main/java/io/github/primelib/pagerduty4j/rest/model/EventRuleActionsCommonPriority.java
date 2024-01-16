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
 * EventRuleActionsCommonPriority
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
    "value"
})
@JsonTypeName("EventRuleActionsCommon_priority")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonPriority {

    /**
     * The priority ID.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommonPriority}.
     *
     * @param spec the specification to process
     */
    public EventRuleActionsCommonPriority(Consumer<EventRuleActionsCommonPriority> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommonPriority}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EventRuleActionsCommonPriority(Consumer)} instead.
     * @param value The priority ID.
     */
    @ApiStatus.Internal
    public EventRuleActionsCommonPriority(String value) {
        this.value = value;
    }

}
