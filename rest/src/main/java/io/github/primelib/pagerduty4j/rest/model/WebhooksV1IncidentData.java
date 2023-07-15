package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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

    @JsonProperty("id")
    private String id;

    /**
     * The number of the incident. This is unique across the account.
     */
    @JsonProperty("incident_number")
    private Integer incidentNumber;

    /**
     * The date/time the incident was first triggered.
     */
    @JsonProperty("created_on")
    private OffsetDateTime createdOn;

    /**
     * The current status of the incident.
     */
    @JsonProperty("status")
    private StatusEnum status;

    @JsonProperty("html_url")
    private String htmlUrl;

    /**
     * The incident's de-duplication key.
     */
    @JsonProperty("incident_key")
    private String incidentKey;

    @JsonProperty("service")
    private WebhooksV1Service service;

    @JsonProperty("assigned_to_user")
    private WebhooksV1AssignedToUser assignedToUser;

    @JsonProperty("assigned_to")
    private List<WebhooksV1AssignedTo> assignedTo;

    @JsonProperty("trigger_summary_data")
    private WebhooksV1IncidentDataTriggerSummaryData triggerSummaryData;

    @JsonProperty("trigger_details_html_url")
    private String triggerDetailsHtmlUrl;

    /**
     * The time at which the status of the incident last changed.
     */
    @JsonProperty("last_status_change_on")
    private OffsetDateTime lastStatusChangeOn;

    @JsonProperty("last_status_change_by")
    private WebhooksV1AssignedToUser lastStatusChangeBy;

    /**
     * Number of times the incident has been escalated.
     */
    @JsonProperty("number_of_escalations")
    private Integer numberOfEscalations;

    @JsonProperty("urgency")
    private UrgencyEnum urgency;


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
