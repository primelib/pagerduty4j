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
 * WebhooksV1IncidentDataTriggerSummaryData
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
    "subject"
})
@JsonTypeName("WebhooksV1IncidentData_trigger_summary_data")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1IncidentDataTriggerSummaryData {

    @JsonProperty("subject")
    protected String subject;

    /**
     * Constructs a validated instance of {@link WebhooksV1IncidentDataTriggerSummaryData}.
     *
     * @param spec the specification to process
     */
    public WebhooksV1IncidentDataTriggerSummaryData(Consumer<WebhooksV1IncidentDataTriggerSummaryData> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhooksV1IncidentDataTriggerSummaryData}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhooksV1IncidentDataTriggerSummaryData(Consumer)} instead.
     * @param subject subject
     */
    @ApiStatus.Internal
    public WebhooksV1IncidentDataTriggerSummaryData(String subject) {
        this.subject = subject;
    }

}
