package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentAction
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "at"
})
@JsonTypeName("IncidentAction")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentAction {

    /**
     * Constructs a validated implementation of {@link IncidentAction}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentAction(Consumer<IncidentAction> spec) {
        spec.accept(this);
    }

    @JsonProperty("type")
    protected TypeEnum type;

    @JsonProperty("at")
    protected OffsetDateTime at;


    @AllArgsConstructor
    public enum TypeEnum {
        UNACKNOWLEDGE("unacknowledge"),
        ESCALATE("escalate"),
        RESOLVE("resolve"),
        URGENCY_CHANGE("urgency_change");

        private final String value;
    }

}
