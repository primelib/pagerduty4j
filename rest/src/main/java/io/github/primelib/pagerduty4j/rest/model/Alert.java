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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Alert
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link Alert}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Alert(Consumer<Alert> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type = TypeEnum.ALERT;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * The date/time the alert was first triggered.
     */
    @JsonProperty("created_at")
    protected OffsetDateTime createdAt;

    /**
     * The current status of the alert.
     */
    @JsonProperty("status")
    protected StatusEnum status;

    /**
     * The alert's de-duplication key.
     */
    @JsonProperty("alert_key")
    protected String alertKey;

    @JsonProperty("service")
    protected ServiceReference service;

    @JsonProperty("first_trigger_log_entry")
    protected LogEntryReference firstTriggerLogEntry;

    @JsonProperty("incident")
    protected IncidentReference incident;

    /**
     * Whether or not an alert is suppressed. Suppressed alerts are not created with a parent incident.
     */
    @JsonProperty("suppressed")
    protected Boolean suppressed = false;

    /**
     * The magnitude of the problem as reported by the monitoring tool.
     */
    @JsonProperty("severity")
    protected SeverityEnum severity;

    @JsonProperty("integration")
    protected IntegrationReference integration;

    @JsonProperty("body")
    protected Body body;


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
