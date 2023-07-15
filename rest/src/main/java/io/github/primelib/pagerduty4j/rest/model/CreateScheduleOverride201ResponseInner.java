package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
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
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "status",
    "errors",
    "override"
})
@JsonTypeName("createScheduleOverride_201_response_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateScheduleOverride201ResponseInner {

    /**
     * Constructs a validated implementation of {@link CreateScheduleOverride201ResponseInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateScheduleOverride201ResponseInner(Consumer<CreateScheduleOverride201ResponseInner> spec) {
        spec.accept(this);
    }

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


}
