package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListWebhookSubscriptions200Response
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "offset",
    "limit",
    "more",
    "total",
    "webhook_subscriptions"
})
@JsonTypeName("listWebhookSubscriptions_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListWebhookSubscriptions200Response {

    /**
     * Echoes offset pagination property.
     */
    @JsonProperty("offset")
    private Integer offset;

    /**
     * Echoes limit pagination property.
     */
    @JsonProperty("limit")
    private Integer limit;

    /**
     * Indicates if there are additional records to return
     */
    @JsonProperty("more")
    private Boolean more;

    /**
     * The total number of records matching the given query.
     */
    @JsonProperty("total")
    private Integer total;

    @JsonProperty("webhook_subscriptions")
    private List<WebhookSubscription> webhookSubscriptions = new ArrayList<>();


}