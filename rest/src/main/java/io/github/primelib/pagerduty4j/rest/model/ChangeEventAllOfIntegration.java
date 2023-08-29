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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ChangeEventAllOfIntegration
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
    "html_url"
})
@JsonTypeName("ChangeEvent_allOf_integration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeEventAllOfIntegration {

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

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
     * Constructs a validated instance of {@link ChangeEventAllOfIntegration}.
     *
     * @param spec the specification to process
     */
    public ChangeEventAllOfIntegration(Consumer<ChangeEventAllOfIntegration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangeEventAllOfIntegration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangeEventAllOfIntegration(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type type
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     */
    @ApiStatus.Internal
    public ChangeEventAllOfIntegration(String id, String summary, TypeEnum type, String self, String htmlUrl) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
    }

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

}
