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
 * AlertCount
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "triggered",
    "resolved",
    "all"
})
@JsonTypeName("AlertCount")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertCount {

    /**
     * Constructs a validated implementation of {@link AlertCount}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AlertCount(Consumer<AlertCount> spec) {
        spec.accept(this);
    }

    /**
     * The count of triggered alerts
     */
    @JsonProperty("triggered")
    protected Integer triggered;

    /**
     * The count of resolved alerts
     */
    @JsonProperty("resolved")
    protected Integer resolved;

    /**
     * The total count of alerts
     */
    @JsonProperty("all")
    protected Integer all;


}
