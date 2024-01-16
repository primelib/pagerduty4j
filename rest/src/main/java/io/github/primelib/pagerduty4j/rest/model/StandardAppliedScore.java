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
 * StandardAppliedScore
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
    "passing",
    "total"
})
@JsonTypeName("StandardApplied_score")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StandardAppliedScore {

    @JsonProperty("passing")
    protected Integer passing;

    @JsonProperty("total")
    protected Integer total;

    /**
     * Constructs a validated instance of {@link StandardAppliedScore}.
     *
     * @param spec the specification to process
     */
    public StandardAppliedScore(Consumer<StandardAppliedScore> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StandardAppliedScore}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StandardAppliedScore(Consumer)} instead.
     * @param passing passing
     * @param total total
     */
    @ApiStatus.Internal
    public StandardAppliedScore(Integer passing, Integer total) {
        this.passing = passing;
        this.total = total;
    }

}
