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
 * ScheduledActionAt
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "name"
})
@JsonTypeName("ScheduledAction_at")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScheduledActionAt {

    /**
     * Constructs a validated implementation of {@link ScheduledActionAt}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScheduledActionAt(Consumer<ScheduledActionAt> spec) {
        spec.accept(this);
    }

    /**
     * Must be set to named_time.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Designates either the start or the end of support hours.
     */
    @JsonProperty("name")
    protected NameEnum name;


    /**
     * Must be set to named_time.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        NAMED_TIME("named_time");

        private final String value;
    }

    /**
     * Designates either the start or the end of support hours.
     */
    @AllArgsConstructor
    public enum NameEnum {
        START("support_hours_start"),
        END("support_hours_end");

        private final String value;
    }

}
