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
 * EventRuleActionsCommonExtractionsInnerOneOf1
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
    "target",
    "template"
})
@JsonTypeName("EventRuleActionsCommon_extractions_inner_oneOf_1")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonExtractionsInnerOneOf1 {

    /**
     * The PD-CEF field that will be set with the value from the regex.
     */
    @JsonProperty("target")
    protected String target;

    /**
     * A value that will be used to populate the target PD-CEF field.
     * You can include variables extracted from the payload by using string interpolation.
     */
    @JsonProperty("template")
    protected String template;

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommonExtractionsInnerOneOf1}.
     *
     * @param spec the specification to process
     */
    public EventRuleActionsCommonExtractionsInnerOneOf1(Consumer<EventRuleActionsCommonExtractionsInnerOneOf1> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EventRuleActionsCommonExtractionsInnerOneOf1}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EventRuleActionsCommonExtractionsInnerOneOf1(Consumer)} instead.
     * @param target The PD-CEF field that will be set with the value from the regex.
     * @param template A value that will be used to populate the target PD-CEF field.  You can include variables extracted from the payload by using string interpolation.
     */
    @ApiStatus.Internal
    public EventRuleActionsCommonExtractionsInnerOneOf1(String target, String template) {
        this.target = target;
        this.template = template;
    }

}
