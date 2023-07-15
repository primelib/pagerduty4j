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
 * WebhookSubscriptionFilter
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "type"
})
@JsonTypeName("WebhookSubscription_filter")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhookSubscriptionFilter {

    /**
     * Constructs a validated implementation of {@link WebhookSubscriptionFilter}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhookSubscriptionFilter(Consumer<WebhookSubscriptionFilter> spec) {
        spec.accept(this);
    }

    /**
     * The id of the object being used as the filter.
     * This field is required for all filter types except account_reference.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The type of object being used as the filter.
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * The type of object being used as the filter.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        ACCOUNT_REFERENCE("account_reference"),
        SERVICE_REFERENCE("service_reference"),
        TEAM_REFERENCE("team_reference");

        private final String value;
    }

}
