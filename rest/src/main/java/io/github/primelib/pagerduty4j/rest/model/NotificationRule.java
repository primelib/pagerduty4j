package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NotificationRule
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
    "start_delay_in_minutes",
    "contact_method",
    "urgency"
})
@JsonTypeName("NotificationRule")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationRule {

    /**
     * Constructs a validated implementation of {@link NotificationRule}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotificationRule(Consumer<NotificationRule> spec) {
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
    protected TypeEnum type = TypeEnum.ASSIGNMENT_NOTIFICATION_RULE;

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
     * The delay before firing the rule, in minutes.
     */
    @JsonProperty("start_delay_in_minutes")
    protected Integer startDelayInMinutes;

    @JsonProperty("contact_method")
    protected ContactMethodReference contactMethod;

    /**
     * Which incident urgency this rule is used for. Account must have the `urgencies` ability to have a low urgency notification rule.
     */
    @JsonProperty("urgency")
    protected UrgencyEnum urgency;


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
