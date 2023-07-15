package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateIncidentAlertsRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "alerts"
})
@JsonTypeName("updateIncidentAlerts_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIncidentAlertsRequest {

    /**
     * Constructs a validated implementation of {@link UpdateIncidentAlertsRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateIncidentAlertsRequest(Consumer<UpdateIncidentAlertsRequest> spec) {
        spec.accept(this);
    }

    /**
     * An array of alerts, including the parameters to update for each alert.
     */
    @JsonProperty("alerts")
    protected List<Alert> alerts = new ArrayList<>();


}
