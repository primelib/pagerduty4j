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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlertCount
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
    "triggered",
    "resolved",
    "all"
})
@JsonTypeName("AlertCount")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AlertCount {

    /**
     * The count of triggered alerts grouped into this incident
     */
    @JsonProperty("triggered")
    protected Integer triggered;

    /**
     * The count of resolved alerts grouped into this incident
     */
    @JsonProperty("resolved")
    protected Integer resolved;

    /**
     * The total count of alerts grouped into this incident
     */
    @JsonProperty("all")
    protected Integer all;

    /**
     * Constructs a validated instance of {@link AlertCount}.
     *
     * @param spec the specification to process
     */
    public AlertCount(Consumer<AlertCount> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AlertCount}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AlertCount(Consumer)} instead.
     * @param triggered The count of triggered alerts grouped into this incident
     * @param resolved The count of resolved alerts grouped into this incident
     * @param all The total count of alerts grouped into this incident
     */
    @ApiStatus.Internal
    public AlertCount(Integer triggered, Integer resolved, Integer all) {
        this.triggered = triggered;
        this.resolved = resolved;
        this.all = all;
    }

}
