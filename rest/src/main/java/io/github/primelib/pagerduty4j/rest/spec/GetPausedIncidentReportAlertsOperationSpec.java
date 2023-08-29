package io.github.primelib.pagerduty4j.rest.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.time.OffsetDateTime;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetPausedIncidentReportAlertsSpec
 * <p>
 * Specification for the GetPausedIncidentReportAlerts operation.
 * <p>
 * Get Paused Incident Reporting on Alerts
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPausedIncidentReportAlertsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The start of the date range over which you want to search.
     */
    @Nullable 
    private OffsetDateTime since;

    /**
     * The end of the date range over which you want to search.
     */
    @Nullable 
    private OffsetDateTime until;

    /**
     * Specifies a filter to limit the scope of reporting to a particular service
     */
    @Nullable 
    private String serviceId;

    /**
     * Specifies a filter to scope the response to either alerts suspended by Auto Pause or Event Rules.
     */
    @Nullable 
    private String suspendedBy;

    /**
     * Constructs a validated instance of {@link GetPausedIncidentReportAlertsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPausedIncidentReportAlertsOperationSpec(Consumer<GetPausedIncidentReportAlertsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetPausedIncidentReportAlertsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param since                The start of the date range over which you want to search.
     * @param until                The end of the date range over which you want to search.
     * @param serviceId            Specifies a filter to limit the scope of reporting to a particular service
     * @param suspendedBy          Specifies a filter to scope the response to either alerts suspended by Auto Pause or Event Rules.
     */
    @ApiStatus.Internal
    public GetPausedIncidentReportAlertsOperationSpec(OffsetDateTime since, OffsetDateTime until, String serviceId, String suspendedBy) {
        this.since = since;
        this.until = until;
        this.serviceId = serviceId;
        this.suspendedBy = suspendedBy;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
