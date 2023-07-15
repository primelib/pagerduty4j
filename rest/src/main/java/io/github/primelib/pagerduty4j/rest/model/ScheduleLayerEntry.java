package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@JsonPropertyOrder({
    "user",
    "start",
    "end"
})
@JsonTypeName("ScheduleLayerEntry")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScheduleLayerEntry {

    @JsonProperty("user")
    private UserReference user;

    /**
     * The start time of this entry.
     */
    @JsonProperty("start")
    private OffsetDateTime start;

    /**
     * The end time of this entry. If null, the entry does not end.
     */
    @JsonProperty("end")
    private OffsetDateTime end;


}
