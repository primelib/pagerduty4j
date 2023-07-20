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

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateScheduleOverride201ResponseInner
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
    "status",
    "errors",
    "override"
})
@JsonTypeName("createScheduleOverride_201_response_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateScheduleOverride201ResponseInner {

    /**
     * HTTP Status Code reflecting the result of creating this specific override, e.g. 201 for success, 400 for invalid parameters.
     */
    @JsonProperty("status")
    protected BigDecimal status;

    /**
     * If present, an array of strings representing human-readable explanations for errors found.
     */
    @JsonProperty("errors")
    protected List<String> errors;

    @JsonProperty("override")
    protected ScheduleOverride override;

    /**
     * Constructs a validated instance of {@link CreateScheduleOverride201ResponseInner}.
     *
     * @param spec the specification to process
     */
    public CreateScheduleOverride201ResponseInner(Consumer<CreateScheduleOverride201ResponseInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateScheduleOverride201ResponseInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateScheduleOverride201ResponseInner(Consumer)} instead.
     * @param status HTTP Status Code reflecting the result of creating this specific override, e.g. 201 for success, 400 for invalid parameters.
     * @param errors If present, an array of strings representing human-readable explanations for errors found.
     * @param override var.name
     */
    @ApiStatus.Internal
    public CreateScheduleOverride201ResponseInner(BigDecimal status, List<String> errors, ScheduleOverride override) {
        this.status = status;
        this.errors = errors;
        this.override = override;
    }

}
