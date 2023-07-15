package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
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
 * GetLogEntry200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "log_entry"
})
@JsonTypeName("getLogEntry_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetLogEntry200Response {

    /**
     * Constructs a validated implementation of {@link GetLogEntry200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetLogEntry200Response(Consumer<GetLogEntry200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("log_entry")
    protected ListIncidentLogEntries200ResponseAllOfLogEntriesInner logEntry;


}
