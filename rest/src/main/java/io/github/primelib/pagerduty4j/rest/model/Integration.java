package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Integration
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
    "name",
    "service",
    "created_at",
    "vendor",
    "integration_email",
    "email_incident_creation",
    "email_filter_mode",
    "email_parsers",
    "email_parsing_fallback",
    "email_filters"
})
@JsonTypeName("Integration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Integration {

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    @JsonProperty("type")
    private TypeEnum type;

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
     * The name of this integration.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("service")
    private ServiceReference service;

    /**
     * The date/time when this integration was created.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("vendor")
    private VendorReference vendor;

    /**
     * Specify for generic_email_inbound_integration. Must be set to an email address @your-subdomain.pagerduty.com
     */
    @JsonProperty("integration_email")
    private String integrationEmail;

    /**
     * Specify for generic_email_inbound_integration
     */
    @JsonProperty("email_incident_creation")
    private EmailIncidentCreationEnum emailIncidentCreation;

    /**
     * Specify for generic_email_inbound_integration. May override email_incident_creation
     */
    @JsonProperty("email_filter_mode")
    private EmailFilterModeEnum emailFilterMode;

    /**
     * Specify for generic_email_inbound_integration.
     */
    @JsonProperty("email_parsers")
    private Set<EmailParser> emailParsers;

    /**
     * Specify for generic_email_inbound_integration.
     */
    @JsonProperty("email_parsing_fallback")
    private EmailParsingFallbackEnum emailParsingFallback;

    /**
     * Specify for generic_email_inbound_integration.
     */
    @JsonProperty("email_filters")
    private Set<IntegrationAllOfEmailFilters> emailFilters;


    @AllArgsConstructor
    public enum TypeEnum {
        AWS_CLOUDWATCH_INBOUND_INTEGRATION("aws_cloudwatch_inbound_integration"),
        CLOUDKICK_INBOUND_INTEGRATION("cloudkick_inbound_integration"),
        EVENT_TRANSFORMER_API_INBOUND_INTEGRATION("event_transformer_api_inbound_integration"),
        GENERIC_EMAIL_INBOUND_INTEGRATION("generic_email_inbound_integration"),
        GENERIC_EVENTS_API_INBOUND_INTEGRATION("generic_events_api_inbound_integration"),
        KEYNOTE_INBOUND_INTEGRATION("keynote_inbound_integration"),
        NAGIOS_INBOUND_INTEGRATION("nagios_inbound_integration"),
        PINGDOM_INBOUND_INTEGRATION("pingdom_inbound_integration"),
        SQL_MONITOR_INBOUND_INTEGRATION("sql_monitor_inbound_integration"),
        EVENTS_API_V2_INBOUND_INTEGRATION("events_api_v2_inbound_integration");

        private final String value;
    }

    /**
     * Specify for generic_email_inbound_integration
     */
    @AllArgsConstructor
    public enum EmailIncidentCreationEnum {
        ON_NEW_EMAIL("on_new_email"),
        ON_NEW_EMAIL_SUBJECT("on_new_email_subject"),
        ONLY_IF_NO_OPEN_INCIDENTS("only_if_no_open_incidents"),
        USE_RULES("use_rules");

        private final String value;
    }

    /**
     * Specify for generic_email_inbound_integration. May override email_incident_creation
     */
    @AllArgsConstructor
    public enum EmailFilterModeEnum {
        ALL_EMAIL("all-email"),
        OR_RULES_EMAIL("or-rules-email"),
        AND_RULES_EMAIL("and-rules-email");

        private final String value;
    }

    /**
     * Specify for generic_email_inbound_integration.
     */
    @AllArgsConstructor
    public enum EmailParsingFallbackEnum {
        OPEN_NEW_INCIDENT("open_new_incident"),
        DISCARD("discard");

        private final String value;
    }

}
