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
 * LogEntryAllOfEventDetails
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
    "description"
})
@JsonTypeName("LogEntry_allOf_event_details")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LogEntryAllOfEventDetails {

    /**
     * Additional details about the event.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * Constructs a validated instance of {@link LogEntryAllOfEventDetails}.
     *
     * @param spec the specification to process
     */
    public LogEntryAllOfEventDetails(Consumer<LogEntryAllOfEventDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LogEntryAllOfEventDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LogEntryAllOfEventDetails(Consumer)} instead.
     * @param description Additional details about the event.
     */
    @ApiStatus.Internal
    public LogEntryAllOfEventDetails(String description) {
        this.description = description;
    }

}
