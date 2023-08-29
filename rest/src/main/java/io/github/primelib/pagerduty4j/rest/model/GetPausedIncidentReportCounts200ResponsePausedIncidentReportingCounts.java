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

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts
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
    "since",
    "until",
    "paused_count",
    "triggered_after_pause_count",
    "resolved_after_pause_count"
})
@JsonTypeName("getPausedIncidentReportCounts_200_response_paused_incident_reporting_counts")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts {

    /**
     * The start of the date range over which the report data is represented.
     */
    @JsonProperty("since")
    protected String since;

    /**
     * The end of the date range over which the report data is represented.
     */
    @JsonProperty("until")
    protected String until;

    /**
     * The total number of paused Alerts for the Account or Servce.
     */
    @JsonProperty("paused_count")
    protected BigDecimal pausedCount;

    /**
     * The total number of paused Alerts for the Account or Service that were triggerd after being paused (non-transient Alerts).
     */
    @JsonProperty("triggered_after_pause_count")
    protected BigDecimal triggeredAfterPauseCount;

    /**
     * The total number of paused Alerts for the Account or Service that were resolved after being paused and not triggered (transient Alerts).
     */
    @JsonProperty("resolved_after_pause_count")
    protected BigDecimal resolvedAfterPauseCount;

    /**
     * Constructs a validated instance of {@link GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts}.
     *
     * @param spec the specification to process
     */
    public GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts(Consumer<GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts(Consumer)} instead.
     * @param since The start of the date range over which the report data is represented.
     * @param until The end of the date range over which the report data is represented.
     * @param pausedCount The total number of paused Alerts for the Account or Servce.
     * @param triggeredAfterPauseCount The total number of paused Alerts for the Account or Service that were triggerd after being paused (non-transient Alerts).
     * @param resolvedAfterPauseCount The total number of paused Alerts for the Account or Service that were resolved after being paused and not triggered (transient Alerts).
     */
    @ApiStatus.Internal
    public GetPausedIncidentReportCounts200ResponsePausedIncidentReportingCounts(String since, String until, BigDecimal pausedCount, BigDecimal triggeredAfterPauseCount, BigDecimal resolvedAfterPauseCount) {
        this.since = since;
        this.until = until;
        this.pausedCount = pausedCount;
        this.triggeredAfterPauseCount = triggeredAfterPauseCount;
        this.resolvedAfterPauseCount = resolvedAfterPauseCount;
    }

}
