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

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentAction
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
    "at"
})
@JsonTypeName("IncidentAction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentAction {

    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("at")
    protected OffsetDateTime at;

    /**
     * Constructs a validated instance of {@link IncidentAction}.
     *
     * @param spec the specification to process
     */
    public IncidentAction(Consumer<IncidentAction> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncidentAction}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncidentAction(Consumer)} instead.
     * @param type var.name
     * @param at var.name
     */
    @ApiStatus.Internal
    public IncidentAction(TypeEnum type, OffsetDateTime at) {
        this.type = type;
        this.at = at;
    }

    @AllArgsConstructor
    public enum TypeEnum {
        UNACKNOWLEDGE("unacknowledge"),
        ESCALATE("escalate"),
        RESOLVE("resolve"),
        URGENCY_CHANGE("urgency_change");

        private final String value;
    }

}
