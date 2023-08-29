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
 * ScheduleLayerEntry
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
    "user",
    "start",
    "end"
})
@JsonTypeName("ScheduleLayerEntry")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScheduleLayerEntry {

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

    /**
     * Constructs a validated instance of {@link ScheduleLayerEntry}.
     *
     * @param spec the specification to process
     */
    public ScheduleLayerEntry(Consumer<ScheduleLayerEntry> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ScheduleLayerEntry}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ScheduleLayerEntry(Consumer)} instead.
     * @param user user
     * @param start The start time of this entry.
     * @param end The end time of this entry. If null, the entry does not end.
     */
    @ApiStatus.Internal
    public ScheduleLayerEntry(UserReference user, OffsetDateTime start, OffsetDateTime end) {
        this.user = user;
        this.start = start;
        this.end = end;
    }

}
