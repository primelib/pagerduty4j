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
 * AuditRecordExecutionContext
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
    "request_id",
    "remote_address"
})
@JsonTypeName("AuditRecord_execution_context")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordExecutionContext {

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

    /**
     * Constructs a validated instance of {@link AuditRecordExecutionContext}.
     *
     * @param spec the specification to process
     */
    public AuditRecordExecutionContext(Consumer<AuditRecordExecutionContext> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditRecordExecutionContext}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditRecordExecutionContext(Consumer)} instead.
     * @param requestId Request Id
     * @param remoteAddress remote address
     */
    @ApiStatus.Internal
    public AuditRecordExecutionContext(String requestId, String remoteAddress) {
        this.requestId = requestId;
        this.remoteAddress = remoteAddress;
    }

}
