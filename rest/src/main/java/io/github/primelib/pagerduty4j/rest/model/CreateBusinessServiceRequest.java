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
 * CreateBusinessServiceRequest
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
    "business_service"
})
@JsonTypeName("createBusinessService_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateBusinessServiceRequest {

    @JsonProperty("business_service")
    protected CreateBusinessServiceRequestBusinessService businessService;

    /**
     * Constructs a validated instance of {@link CreateBusinessServiceRequest}.
     *
     * @param spec the specification to process
     */
    public CreateBusinessServiceRequest(Consumer<CreateBusinessServiceRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateBusinessServiceRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateBusinessServiceRequest(Consumer)} instead.
     * @param businessService businessService
     */
    @ApiStatus.Internal
    public CreateBusinessServiceRequest(CreateBusinessServiceRequestBusinessService businessService) {
        this.businessService = businessService;
    }

}
