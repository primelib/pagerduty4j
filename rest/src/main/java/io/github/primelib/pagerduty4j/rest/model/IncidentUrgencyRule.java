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
 * IncidentUrgencyRule
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link IncidentUrgencyRule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentUrgencyRule(Consumer<IncidentUrgencyRule> spec) {
        spec.accept(this);
    }

    /**
     * The type of incident urgency: whether it's constant, or it's dependent on the support hours.
     */
    @JsonProperty("type")
    protected TypeEnum type = TypeEnum.CONSTANT;

    /**
     * The incidents' urgency, if type is constant.
     */
    @JsonProperty("urgency")
    protected UrgencyEnum urgency = UrgencyEnum.HIGH;

    @JsonProperty("during_support_hours")
    protected IncidentUrgencyType duringSupportHours;

    @JsonProperty("outside_support_hours")
    protected IncidentUrgencyType outsideSupportHours;


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
