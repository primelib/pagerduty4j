package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecordExecutionContext
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String requestId;

    /**
     * remote address
     */
    @JsonProperty("remote_address")
    private String remoteAddress;


}
