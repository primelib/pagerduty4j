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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WebhooksV1IncidentData
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
     * Constructs a validated instance of {@link WebhooksV1IncidentData}.
     *
     * @param spec the specification to process
     */
    public WebhooksV1IncidentData(Consumer<WebhooksV1IncidentData> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WebhooksV1IncidentData}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WebhooksV1IncidentData(Consumer)} instead.
     * @param id var.name
     * @param incidentNumber The number of the incident. This is unique across the account.
     * @param createdOn The date/time the incident was first triggered.
     * @param status The current status of the incident.
     * @param htmlUrl var.name
     * @param incidentKey The incident's de-duplication key.
     * @param service var.name
     * @param assignedToUser var.name
     * @param assignedTo var.name
     * @param triggerSummaryData var.name
     * @param triggerDetailsHtmlUrl var.name
     * @param lastStatusChangeOn The time at which the status of the incident last changed.
     * @param lastStatusChangeBy var.name
     * @param numberOfEscalations Number of times the incident has been escalated.
     * @param urgency var.name
     */
    @ApiStatus.Internal
    public WebhooksV1IncidentData(String id, Integer incidentNumber, OffsetDateTime createdOn, StatusEnum status, String htmlUrl, String incidentKey, WebhooksV1Service service, WebhooksV1AssignedToUser assignedToUser, List<WebhooksV1AssignedTo> assignedTo, WebhooksV1IncidentDataTriggerSummaryData triggerSummaryData, String triggerDetailsHtmlUrl, OffsetDateTime lastStatusChangeOn, WebhooksV1AssignedToUser lastStatusChangeBy, Integer numberOfEscalations, UrgencyEnum urgency) {
        this.id = id;
        this.incidentNumber = incidentNumber;
        this.createdOn = createdOn;
        this.status = status;
        this.htmlUrl = htmlUrl;
        this.incidentKey = incidentKey;
        this.service = service;
        this.assignedToUser = assignedToUser;
        this.assignedTo = assignedTo;
        this.triggerSummaryData = triggerSummaryData;
        this.triggerDetailsHtmlUrl = triggerDetailsHtmlUrl;
        this.lastStatusChangeOn = lastStatusChangeOn;
        this.lastStatusChangeBy = lastStatusChangeBy;
        this.numberOfEscalations = numberOfEscalations;
        this.urgency = urgency;
    }

    /**
     * The current status of the incident.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        TRIGGERED("triggered"),
        ACKNOWLEDGED("acknowledged"),
        RESOLVED("resolved");

        private static final StatusEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusEnum of(String input) {
            if (input != null) {
                for (StatusEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    @AllArgsConstructor
    public enum UrgencyEnum {
        HIGH("high"),
        LOW("low");

        private static final UrgencyEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static UrgencyEnum of(String input) {
            if (input != null) {
                for (UrgencyEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
