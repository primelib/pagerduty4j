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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Assignment
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
    "at",
    "assignee"
})
@JsonTypeName("Assignment")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Assignment {

    /**
     * Time at which the assignment was created.
     */
    @JsonProperty("at")
    protected OffsetDateTime at;

    @JsonProperty("assignee")
    protected UserReference assignee;

    /**
     * Constructs a validated instance of {@link Assignment}.
     *
     * @param spec the specification to process
     */
    public Assignment(Consumer<Assignment> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Assignment}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Assignment(Consumer)} instead.
     * @param at Time at which the assignment was created.
     * @param assignee assignee
     */
    @ApiStatus.Internal
    public Assignment(OffsetDateTime at, UserReference assignee) {
        this.at = at;
        this.assignee = assignee;
    }

}
