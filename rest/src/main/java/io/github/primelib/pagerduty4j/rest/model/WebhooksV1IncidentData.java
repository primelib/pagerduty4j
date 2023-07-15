package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhooksV1IncidentData
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "incident_number",
    "created_on",
    "status",
    "html_url",
    "incident_key",
    "service",
    "assigned_to_user",
    "assigned_to",
    "trigger_summary_data",
    "trigger_details_html_url",
    "last_status_change_on",
    "last_status_change_by",
    "number_of_escalations",
    "urgency"
})
@JsonTypeName("WebhooksV1IncidentData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1IncidentData {

    /**
     * Constructs a validated implementation of {@link WebhooksV1IncidentData}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhooksV1IncidentData(Consumer<WebhooksV1IncidentData> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * The number of the incident. This is unique across the account.
     */
    @JsonProperty("incident_number")
    protected Integer incidentNumber;

    /**
     * The date/time the incident was first triggered.
     */
    @JsonProperty("created_on")
    protected OffsetDateTime createdOn;

    /**
     * The current status of the incident.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * The incident's de-duplication key.
     */
    @JsonProperty("incident_key")
    protected String incidentKey;

    @JsonProperty("service")
    protected WebhooksV1Service service;

    @JsonProperty("assigned_to_user")
    protected WebhooksV1AssignedToUser assignedToUser;

    @JsonProperty("assigned_to")
    protected List<WebhooksV1AssignedTo> assignedTo;

    @JsonProperty("trigger_summary_data")
    protected WebhooksV1IncidentDataTriggerSummaryData triggerSummaryData;

    @JsonProperty("trigger_details_html_url")
    protected String triggerDetailsHtmlUrl;

    /**
     * The time at which the status of the incident last changed.
     */
    @JsonProperty("last_status_change_on")
    protected OffsetDateTime lastStatusChangeOn;

    @JsonProperty("last_status_change_by")
    protected WebhooksV1AssignedToUser lastStatusChangeBy;

    /**
     * Number of times the incident has been escalated.
     */
    @JsonProperty("number_of_escalations")
    protected Integer numberOfEscalations;

    @JsonProperty("urgency")
    protected UrgencyEnum urgency;


    /**
     * The current status of the incident.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        TRIGGERED("triggered"),
        ACKNOWLEDGED("acknowledged"),
        RESOLVED("resolved");

        private final String value;
    }

    @AllArgsConstructor
    public enum UrgencyEnum {
        HIGH("high"),
        LOW("low");

        private final String value;
    }

}
