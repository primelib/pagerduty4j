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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetVendor200Response
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
    "vendor"
})
@JsonTypeName("getVendor_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetVendor200Response {

    @JsonProperty("vendor")
    protected List<Vendor> vendor;

    /**
     * Constructs a validated instance of {@link GetVendor200Response}.
     *
     * @param spec the specification to process
     */
    public GetVendor200Response(Consumer<GetVendor200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetVendor200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetVendor200Response(Consumer)} instead.
     * @param vendor var.name
     */
    @ApiStatus.Internal
    public GetVendor200Response(List<Vendor> vendor) {
        this.vendor = vendor;
    }

}
