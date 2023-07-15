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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecord
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "self",
    "execution_time",
    "execution_context",
    "actors",
    "method",
    "root_resource",
    "action",
    "details"
})
@JsonTypeName("AuditRecord")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecord {

    /**
     * Constructs a validated implementation of {@link AuditRecord}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AuditRecord(Consumer<AuditRecord> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * Record URL.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * The date/time the action executed, in ISO8601 format and millisecond precision.
     */
    @JsonProperty("execution_time")
    protected OffsetDateTime executionTime;

    @JsonProperty("execution_context")
    protected AuditRecordExecutionContext executionContext;

    @JsonProperty("actors")
    protected List<Reference> actors;

    @JsonProperty("method")
    protected AuditRecordMethod method;

    @JsonProperty("root_resource")
    protected Reference rootResource;

    @JsonProperty("action")
    protected String action;

    @JsonProperty("details")
    protected AuditRecordDetails details;


}
