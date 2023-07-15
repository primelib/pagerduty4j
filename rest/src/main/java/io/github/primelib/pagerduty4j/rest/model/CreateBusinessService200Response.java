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
 * CreateBusinessService200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "business_service"
})
@JsonTypeName("createBusinessService_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateBusinessService200Response {

    /**
     * Constructs a validated implementation of {@link CreateBusinessService200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateBusinessService200Response(Consumer<CreateBusinessService200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("business_service")
    protected BusinessService businessService;


}
