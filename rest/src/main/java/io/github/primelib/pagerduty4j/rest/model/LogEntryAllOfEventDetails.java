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
 * LogEntryAllOfEventDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description"
})
@JsonTypeName("LogEntry_allOf_event_details")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LogEntryAllOfEventDetails {

    /**
     * Constructs a validated implementation of {@link LogEntryAllOfEventDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LogEntryAllOfEventDetails(Consumer<LogEntryAllOfEventDetails> spec) {
        spec.accept(this);
    }

    /**
     * Additional details about the event.
     */
    @JsonProperty("description")
    protected String description;


}
