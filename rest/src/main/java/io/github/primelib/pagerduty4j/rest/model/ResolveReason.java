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
 * ResolveReason
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "incident"
})
@JsonTypeName("ResolveReason")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResolveReason {

    /**
     * Constructs a validated implementation of {@link ResolveReason}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ResolveReason(Consumer<ResolveReason> spec) {
        spec.accept(this);
    }

    /**
     * The reason the incident was resolved. The only reason currently supported is merge.
     */
    @JsonProperty("type")
    protected TypeEnum type = TypeEnum.MERGE_RESOLVE_REASON;

    @JsonProperty("incident")
    protected IncidentReference incident;


    /**
     * The reason the incident was resolved. The only reason currently supported is merge.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        MERGE_RESOLVE_REASON("merge_resolve_reason");

        private final String value;
    }

}
