package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventRuleActionsCommonExtractionsInnerOneOf1
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String target;

    /**
     * A value that will be used to populate the target PD-CEF field.
     * You can include variables extracted from the payload by using string interpolation.
     */
    @JsonProperty("template")
    private String template;


}
