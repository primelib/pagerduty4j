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
 * EventRuleActionsCommonAnnotate
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
@JsonTypeName("EventRuleActionsCommon_annotate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonAnnotate {

    /**
     * The content of the note.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommonAnnotate}.
     *
     * @param spec the specification to process
     */
    public EventRuleActionsCommonAnnotate(Consumer<EventRuleActionsCommonAnnotate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommonAnnotate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EventRuleActionsCommonAnnotate(Consumer)} instead.
     * @param value The content of the note.
     */
    @ApiStatus.Internal
    public EventRuleActionsCommonAnnotate(String value) {
        this.value = value;
    }

}
