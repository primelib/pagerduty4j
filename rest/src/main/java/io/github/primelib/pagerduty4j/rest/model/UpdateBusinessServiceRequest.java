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
 * UpdateBusinessServiceRequest
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
@JsonTypeName("updateBusinessService_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateBusinessServiceRequest {

    @JsonProperty("business_service")
    protected UpdateBusinessServiceRequestBusinessService businessService;

    /**
     * Constructs a validated instance of {@link UpdateBusinessServiceRequest}.
     *
     * @param spec the specification to process
     */
    public UpdateBusinessServiceRequest(Consumer<UpdateBusinessServiceRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateBusinessServiceRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateBusinessServiceRequest(Consumer)} instead.
     * @param businessService businessService
     */
    @ApiStatus.Internal
    public UpdateBusinessServiceRequest(UpdateBusinessServiceRequestBusinessService businessService) {
        this.businessService = businessService;
    }

}
