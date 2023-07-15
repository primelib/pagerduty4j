package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationRule
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
    "start_delay_in_minutes",
    "contact_method",
    "urgency"
})
@JsonTypeName("NotificationRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationRule {

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
    private TypeEnum type = TypeEnum.ASSIGNMENT_NOTIFICATION_RULE;

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
     * The delay before firing the rule, in minutes.
     */
    @JsonProperty("start_delay_in_minutes")
    private Integer startDelayInMinutes;

    @JsonProperty("contact_method")
    private ContactMethodReference contactMethod;

    /**
     * Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule.
     */
    @JsonProperty("urgency")
    private UrgencyEnum urgency;


    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        ASSIGNMENT_NOTIFICATION_RULE("assignment_notification_rule");

        private final String value;
    }

    /**
     * Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule.
     */
    @AllArgsConstructor
    public enum UrgencyEnum {
        HIGH("high"),
        LOW("low");

        private final String value;
    }

}
