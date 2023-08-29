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
 * UpdateBusinessServiceRequestBusinessService
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
    "name",
    "description",
    "point_of_contact",
    "team"
})
@JsonTypeName("updateBusinessService_request_business_service")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateBusinessServiceRequestBusinessService {

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

    /**
     * Constructs a validated instance of {@link UpdateBusinessServiceRequestBusinessService}.
     *
     * @param spec the specification to process
     */
    public UpdateBusinessServiceRequestBusinessService(Consumer<UpdateBusinessServiceRequestBusinessService> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateBusinessServiceRequestBusinessService}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateBusinessServiceRequestBusinessService(Consumer)} instead.
     * @param name The name of the Business Service.
     * @param description The description of the Business Service.
     * @param pointOfContact The owner of the Business Service.
     * @param team team
     */
    @ApiStatus.Internal
    public UpdateBusinessServiceRequestBusinessService(String name, String description, String pointOfContact, Team2 team) {
        this.name = name;
        this.description = description;
        this.pointOfContact = pointOfContact;
        this.team = team;
    }

}
