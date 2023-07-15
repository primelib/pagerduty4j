package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResolveReason
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "incident"
})
@JsonTypeName("ResolveReason")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResolveReason {

    /**
     * The reason the incident was resolved. The only reason currently supported is merge.
     */
    @JsonProperty("type")
    private TypeEnum type = TypeEnum.MERGE_RESOLVE_REASON;

    @JsonProperty("incident")
    private IncidentReference incident;


    /**
     * The reason the incident was resolved. The only reason currently supported is merge.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        MERGE_RESOLVE_REASON("merge_resolve_reason");

        private final String value;
    }

}
