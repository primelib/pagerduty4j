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
 * EventRuleActionsCommonExtractionsInnerOneOf
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "target",
    "source",
    "regex"
})
@JsonTypeName("EventRuleActionsCommon_extractions_inner_oneOf")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonExtractionsInnerOneOf {

    /**
     * Constructs a validated implementation of {@link EventRuleActionsCommonExtractionsInnerOneOf}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public EventRuleActionsCommonExtractionsInnerOneOf(Consumer<EventRuleActionsCommonExtractionsInnerOneOf> spec) {
        spec.accept(this);
    }

    /**
     * The PD-CEF field that will be set with the value from the regex.
     */
    @JsonProperty("target")
    protected String target;

    /**
     * The path to the event field where the regex will be applied to extract a value.
     */
    @JsonProperty("source")
    protected String source;

    /**
     * A RE2 regular expression.
     * If it contains one or more capture groups, their values will be extracted and appended together.
     * If it contains no capture groups, the whole match is used.
     */
    @JsonProperty("regex")
    protected String regex;


}
