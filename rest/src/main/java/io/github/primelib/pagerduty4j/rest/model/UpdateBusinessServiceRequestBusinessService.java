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
 * UpdateBusinessServiceRequestBusinessService
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "name",
    "description",
    "point_of_contact",
    "team"
})
@JsonTypeName("updateBusinessService_request_business_service")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateBusinessServiceRequestBusinessService {

    /**
     * Constructs a validated implementation of {@link UpdateBusinessServiceRequestBusinessService}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateBusinessServiceRequestBusinessService(Consumer<UpdateBusinessServiceRequestBusinessService> spec) {
        spec.accept(this);
    }

    /**
     * The name of the Business Service.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The description of the Business Service.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The owner of the Business Service.
     */
    @JsonProperty("point_of_contact")
    protected String pointOfContact;

    @JsonProperty("team")
    protected Team2 team;


}
