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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Alert
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
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type;

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
    protected Boolean suppressed;

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
     * Constructs a validated instance of {@link Alert}.
     *
     * @param spec the specification to process
     */
    public Alert(Consumer<Alert> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Alert}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Alert(Consumer)} instead.
     * @param id var.name
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type The type of object being created.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param createdAt The date/time the alert was first triggered.
     * @param status The current status of the alert.
     * @param alertKey The alert's de-duplication key.
     * @param service var.name
     * @param firstTriggerLogEntry var.name
     * @param incident var.name
     * @param suppressed Whether or not an alert is suppressed. Suppressed alerts are not created with a parent incident.
     * @param severity The magnitude of the problem as reported by the monitoring tool.
     * @param integration var.name
     * @param body var.name
     */
    @ApiStatus.Internal
    public Alert(String id, String summary, TypeEnum type, String self, String htmlUrl, OffsetDateTime createdAt, StatusEnum status, String alertKey, ServiceReference service, LogEntryReference firstTriggerLogEntry, IncidentReference incident, Boolean suppressed, SeverityEnum severity, IntegrationReference integration, Body body) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.createdAt = createdAt;
        this.status = status;
        this.alertKey = alertKey;
        this.service = service;
        this.firstTriggerLogEntry = firstTriggerLogEntry;
        this.incident = incident;
        this.suppressed = suppressed;
        this.severity = severity;
        this.integration = integration;
        this.body = body;
    }

    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        ALERT("alert");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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

    /**
     * The current status of the alert.
     */
    @AllArgsConstructor
    public enum StatusEnum {
        TRIGGERED("triggered"),
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

    /**
     * The magnitude of the problem as reported by the monitoring tool.
     */
    @AllArgsConstructor
    public enum SeverityEnum {
        INFO("info"),
        WARNING("warning"),
        ERROR("error"),
        CRITICAL("critical");

        private static final SeverityEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SeverityEnum of(String input) {
            if (input != null) {
                for (SeverityEnum v : VALUES) {
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
