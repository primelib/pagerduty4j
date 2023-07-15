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
 * AuditRecordExecutionContext
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "request_id",
    "remote_address"
})
@JsonTypeName("AuditRecord_execution_context")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordExecutionContext {

    /**
     * Constructs a validated implementation of {@link AuditRecordExecutionContext}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AuditRecordExecutionContext(Consumer<AuditRecordExecutionContext> spec) {
        spec.accept(this);
    }

    /**
     * Request Id
     */
    @JsonProperty("request_id")
    protected String requestId;

    /**
     * remote address
     */
    @JsonProperty("remote_address")
    protected String remoteAddress;


}
