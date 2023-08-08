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
 * GetOutlierIncident200Response
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
    "outlier_incident"
})
@JsonTypeName("getOutlierIncident_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetOutlierIncident200Response {

    @JsonProperty("outlier_incident")
    protected GetOutlierIncident200ResponseOutlierIncident outlierIncident;

    /**
     * Constructs a validated instance of {@link GetOutlierIncident200Response}.
     *
     * @param spec the specification to process
     */
    public GetOutlierIncident200Response(Consumer<GetOutlierIncident200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetOutlierIncident200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetOutlierIncident200Response(Consumer)} instead.
     * @param outlierIncident outlierIncident
     */
    @ApiStatus.Internal
    public GetOutlierIncident200Response(GetOutlierIncident200ResponseOutlierIncident outlierIncident) {
        this.outlierIncident = outlierIncident;
    }

}
