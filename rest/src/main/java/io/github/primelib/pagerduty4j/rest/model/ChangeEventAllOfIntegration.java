package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChangeEventAllOfIntegration
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
    "html_url"
})
@JsonTypeName("ChangeEvent_allOf_integration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeEventAllOfIntegration {

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


    @AllArgsConstructor
    public enum TypeEnum {
        AWS_CLOUDWATCH_INBOUND_INTEGRATION_REFERENCE("aws_cloudwatch_inbound_integration_reference"),
        CLOUDKICK_INBOUND_INTEGRATION_REFERENCE("cloudkick_inbound_integration_reference"),
        EVENT_TRANSFORMER_API_INBOUND_INTEGRATION_REFERENCE("event_transformer_api_inbound_integration_reference"),
        GENERIC_EMAIL_INBOUND_INTEGRATION_REFERENCE("generic_email_inbound_integration_reference"),
        GENERIC_EVENTS_API_INBOUND_INTEGRATION_REFERENCE("generic_events_api_inbound_integration_reference"),
        KEYNOTE_INBOUND_INTEGRATION_REFERENCE("keynote_inbound_integration_reference"),
        NAGIOS_INBOUND_INTEGRATION_REFERENCE("nagios_inbound_integration_reference"),
        PINGDOM_INBOUND_INTEGRATION_REFERENCE("pingdom_inbound_integration_reference"),
        SQL_MONITOR_INBOUND_INTEGRATION_REFERENCE("sql_monitor_inbound_integration_reference"),
        EVENTS_API_V2_INBOUND_INTEGRATION_REFERENCE("events_api_v2_inbound_integration_reference"),
        INBOUND_INTEGRATION_REFERENCE("inbound_integration_reference");

        private final String value;
    }

}
