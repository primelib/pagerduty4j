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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ScheduledActionAt
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
    "type",
    "name"
})
@JsonTypeName("ScheduledAction_at")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScheduledActionAt {

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
     * Constructs a validated instance of {@link ScheduledActionAt}.
     *
     * @param spec the specification to process
     */
    public ScheduledActionAt(Consumer<ScheduledActionAt> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ScheduledActionAt}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ScheduledActionAt(Consumer)} instead.
     * @param type Must be set to named_time.
     * @param name Designates either the start or the end of support hours.
     */
    @ApiStatus.Internal
    public ScheduledActionAt(TypeEnum type, NameEnum name) {
        this.type = type;
        this.name = name;
    }

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
