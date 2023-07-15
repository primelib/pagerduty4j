package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventRuleActionsCommonExtractionsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "target",
    "source",
    "regex",
    "template"
})
@JsonTypeName("EventRuleActionsCommon_extractions_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventRuleActionsCommonExtractionsInner {

    /**
     * The PD-CEF field that will be set with the value from the regex.
     */
    @JsonProperty("target")
    private String target;

    /**
     * The path to the event field where the regex will be applied to extract a value.
     */
    @JsonProperty("source")
    private String source;

    /**
     * A RE2 regular expression.
     * If it contains one or more capture groups, their values will be extracted and appended together.
     * If it contains no capture groups, the whole match is used.
     */
    @JsonProperty("regex")
    private String regex;

    /**
     * A value that will be used to populate the target PD-CEF field.
     * You can include variables extracted from the payload by using string interpolation.
     */
    @JsonProperty("template")
    private String template;


}
