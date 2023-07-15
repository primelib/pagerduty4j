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
 * ScheduleLayerEntry
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "user",
    "start",
    "end"
})
@JsonTypeName("ScheduleLayerEntry")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScheduleLayerEntry {

    /**
     * Constructs a validated implementation of {@link ScheduleLayerEntry}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScheduleLayerEntry(Consumer<ScheduleLayerEntry> spec) {
        spec.accept(this);
    }

    @JsonProperty("user")
    protected UserReference user;

    /**
     * The start time of this entry.
     */
    @JsonProperty("start")
    protected OffsetDateTime start;

    /**
     * The end time of this entry. If null, the entry does not end.
     */
    @JsonProperty("end")
    protected OffsetDateTime end;


}
