package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Alert
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "summary",
    "type",
    "self",
    "html_url",
    "created_at",
    "status",
    "alert_key",
    "service",
    "first_trigger_log_entry",
    "incident",
    "suppressed",
    "severity",
    "integration",
    "body"
})
@JsonTypeName("Alert")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Alert {

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    private TypeEnum type = TypeEnum.ALERT;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    private String htmlUrl;

    /**
     * The date/time the alert was first triggered.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * The current status of the alert.
     */
    @JsonProperty("status")
    private StatusEnum status;

    /**
     * The alert's de-duplication key.
     */
    @JsonProperty("alert_key")
    private String alertKey;

    @JsonProperty("service")
    private ServiceReference service;

    @JsonProperty("first_trigger_log_entry")
    private LogEntryReference firstTriggerLogEntry;

    @JsonProperty("incident")
    private IncidentReference incident;

    /**
     * Whether or not an alert is suppressed. Suppressed alerts are not created with a parent incident.
     */
    @JsonProperty("suppressed")
    private Boolean suppressed = false;

    /**
     * The magnitude of the problem as reported by the monitoring tool.
     */
    @JsonProperty("severity")
    private SeverityEnum severity;

    @JsonProperty("integration")
    private IntegrationReference integration;

    @JsonProperty("body")
    private Body body;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        ALERT("alert");

        private final String value;
    }

    /**
     * The current status of the alert.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        TRIGGERED("triggered"),
        RESOLVED("resolved");

        private final String value;
    }

    /**
     * The magnitude of the problem as reported by the monitoring tool.
     */
    @AllArgsConstructor
    public enum SeverityEnum {
        INFO("info"),
        WARNING("warning"),
        ERROR("error"),
        CRITICAL("critical");

        private final String value;
    }

}
