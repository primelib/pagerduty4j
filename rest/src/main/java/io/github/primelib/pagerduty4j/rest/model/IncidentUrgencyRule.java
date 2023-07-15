package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentUrgencyRule
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "urgency",
    "during_support_hours",
    "outside_support_hours"
})
@JsonTypeName("IncidentUrgencyRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentUrgencyRule {

    /**
     * The type of incident urgency: whether it's constant, or it's dependent on the support hours.
     */
    @JsonProperty("type")
    private TypeEnum type = TypeEnum.CONSTANT;

    /**
     * The incidents' urgency, if type is constant.
     */
    @JsonProperty("urgency")
    private UrgencyEnum urgency = UrgencyEnum.HIGH;

    @JsonProperty("during_support_hours")
    private IncidentUrgencyType duringSupportHours;

    @JsonProperty("outside_support_hours")
    private IncidentUrgencyType outsideSupportHours;


    /**
     * The type of incident urgency: whether it's constant, or it's dependent on the support hours.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        CONSTANT("constant"),
        USE_SUPPORT_HOURS("use_support_hours");

        private final String value;
    }

    /**
     * The incidents' urgency, if type is constant.
     */
    @AllArgsConstructor
    public enum UrgencyEnum {
        LOW("low"),
        HIGH("high"),
        SEVERITY_BASED("severity_based");

        private final String value;
    }

}
