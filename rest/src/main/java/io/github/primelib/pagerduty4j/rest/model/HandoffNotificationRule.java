package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HandoffNotificationRule
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "notify_advance_in_minutes",
    "handoff_type",
    "contact_method"
})
@JsonTypeName("HandoffNotificationRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class HandoffNotificationRule {

    @JsonProperty("id")
    private String id;

    /**
     * The delay before firing the rule, in minutes.
     */
    @JsonProperty("notify_advance_in_minutes")
    private Integer notifyAdvanceInMinutes;

    /**
     * The type of handoff being created.
     */
    @JsonProperty("handoff_type")
    private HandoffTypeEnum handoffType = HandoffTypeEnum.BOTH;

    @JsonProperty("contact_method")
    private ContactMethodReference contactMethod;


    /**
     * The type of handoff being created.
     */
    @AllArgsConstructor
    public enum HandoffTypeEnum {
        BOTH("both"),
        ONCALL("oncall"),
        OFFCALL("offcall");

        private final String value;
    }

}
