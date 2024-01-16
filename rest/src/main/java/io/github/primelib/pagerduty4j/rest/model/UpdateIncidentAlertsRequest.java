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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateIncidentAlertsRequest
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
    "alerts"
})
@JsonTypeName("updateIncidentAlerts_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIncidentAlertsRequest {

    /**
     * An array of alerts, including the parameters to update for each alert.
     */
    @JsonProperty("alerts")
    protected List<Alert> alerts;

    /**
     * Constructs a validated instance of {@link UpdateIncidentAlertsRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateIncidentAlertsRequest(Consumer<UpdateIncidentAlertsRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateIncidentAlertsRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateIncidentAlertsRequest(Consumer)} instead.
     * @param alerts An array of alerts, including the parameters to update for each alert.
     */
    @ApiStatus.Internal
    public UpdateIncidentAlertsRequest(List<Alert> alerts) {
        this.alerts = alerts;
    }

}
