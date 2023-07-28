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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ContentBasedAlertGroupingConfiguration
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
    "aggregate",
    "fields"
})
@JsonTypeName("ContentBasedAlertGroupingConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContentBasedAlertGroupingConfiguration {

    /**
     * Whether Alerts should be grouped if {@code all} or {@code any} specified fields match. If {@code all} is selected, an exact match on every specified field name must occur for Alerts to be grouped. If {@code any} is selected, Alerts will be grouped when there is an exact match on at least one of the specified fields.
     */
    @JsonProperty("aggregate")
    protected AggregateEnum aggregate;

    /**
     * The fields with which to group against. Depending on the aggregate, Alerts will group if some or all the fields match
     */
    @JsonProperty("fields")
    protected List fields;

    /**
     * Constructs a validated instance of {@link ContentBasedAlertGroupingConfiguration}.
     *
     * @param spec the specification to process
     */
    public ContentBasedAlertGroupingConfiguration(Consumer<ContentBasedAlertGroupingConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContentBasedAlertGroupingConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContentBasedAlertGroupingConfiguration(Consumer)} instead.
     * @param aggregate Whether Alerts should be grouped if {@code all} or {@code any} specified fields match. If {@code all} is selected, an exact match on every specified field name must occur for Alerts to be grouped. If {@code any} is selected, Alerts will be grouped when there is an exact match on at least one of the specified fields.
     * @param fields The fields with which to group against. Depending on the aggregate, Alerts will group if some or all the fields match
     */
    @ApiStatus.Internal
    public ContentBasedAlertGroupingConfiguration(AggregateEnum aggregate, List fields) {
        this.aggregate = aggregate;
        this.fields = fields;
    }

    /**
     * Whether Alerts should be grouped if {@code all} or {@code any} specified fields match. If {@code all} is selected, an exact match on every specified field name must occur for Alerts to be grouped. If {@code any} is selected, Alerts will be grouped when there is an exact match on at least one of the specified fields.
     */
    @AllArgsConstructor
    public enum AggregateEnum {
        ALL_ANY("all, any");

        private static final AggregateEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AggregateEnum of(String input) {
            if (input != null) {
                for (AggregateEnum v : VALUES) {
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
