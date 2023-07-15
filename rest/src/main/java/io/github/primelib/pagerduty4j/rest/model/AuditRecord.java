package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
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

    @JsonProperty("id")
    private String id;

    /**
     * Record URL.
     */
    @JsonProperty("self")
    private String self;

    /**
     * The date/time the action executed, in ISO8601 format and millisecond precision.
     */
    @JsonProperty("execution_time")
    private OffsetDateTime executionTime;

    @JsonProperty("execution_context")
    private AuditRecordExecutionContext executionContext;

    @JsonProperty("actors")
    private List<Reference> actors;

    @JsonProperty("method")
    private AuditRecordMethod method;

    @JsonProperty("root_resource")
    private Reference rootResource;

    @JsonProperty("action")
    private String action;

    @JsonProperty("details")
    private AuditRecordDetails details;


}
