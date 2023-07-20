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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecord
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

    /**
     * Constructs a validated instance of {@link AuditRecord}.
     *
     * @param spec the specification to process
     */
    public AuditRecord(Consumer<AuditRecord> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditRecord}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditRecord(Consumer)} instead.
     * @param id var.name
     * @param self Record URL.
     * @param executionTime The date/time the action executed, in ISO8601 format and millisecond precision.
     * @param executionContext var.name
     * @param actors var.name
     * @param method var.name
     * @param rootResource var.name
     * @param action var.name
     * @param details var.name
     */
    @ApiStatus.Internal
    public AuditRecord(String id, String self, OffsetDateTime executionTime, AuditRecordExecutionContext executionContext, List<Reference> actors, AuditRecordMethod method, Reference rootResource, String action, AuditRecordDetails details) {
        this.id = id;
        this.self = self;
        this.executionTime = executionTime;
        this.executionContext = executionContext;
        this.actors = actors;
        this.method = method;
        this.rootResource = rootResource;
        this.action = action;
        this.details = details;
    }

}
