package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentBasedAlertGroupingConfiguration
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "aggregate",
    "fields"
})
@JsonTypeName("ContentBasedAlertGroupingConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentBasedAlertGroupingConfiguration {

    /**
     * Whether Alerts should be grouped if `all` or `any` specified fields match. If `all` is selected, an exact match on every specified field name must occur for Alerts to be grouped. If `any` is selected, Alerts will be grouped when there is an exact match on at least one of the specified fields.
     */
    @JsonProperty("aggregate")
    private AggregateEnum aggregate;

    /**
     * The fields with which to group against. Depending on the aggregate, Alerts will group if some or all the fields match
     */
    @JsonProperty("fields")
    private List fields = null;


    /**
     * Whether Alerts should be grouped if `all` or `any` specified fields match. If `all` is selected, an exact match on every specified field name must occur for Alerts to be grouped. If `any` is selected, Alerts will be grouped when there is an exact match on at least one of the specified fields.
     */
    @AllArgsConstructor
    public enum AggregateEnum {
        ALL_ANY("all, any");

        private final String value;
    }

}
