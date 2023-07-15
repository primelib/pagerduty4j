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
 * WebhooksV1IncidentDataTriggerSummaryData
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "subject"
})
@JsonTypeName("WebhooksV1IncidentData_trigger_summary_data")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1IncidentDataTriggerSummaryData {

    /**
     * Constructs a validated implementation of {@link WebhooksV1IncidentDataTriggerSummaryData}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhooksV1IncidentDataTriggerSummaryData(Consumer<WebhooksV1IncidentDataTriggerSummaryData> spec) {
        spec.accept(this);
    }

    @JsonProperty("subject")
    protected String subject;


}
