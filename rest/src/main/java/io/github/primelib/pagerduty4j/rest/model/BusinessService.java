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
 * BusinessService
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "summary",
    "type",
    "self",
    "html_url",
    "name",
    "description",
    "point_of_contact",
    "team"
})
@JsonTypeName("BusinessService")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BusinessService {

    /**
     * Constructs a validated implementation of {@link BusinessService}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BusinessService(Consumer<BusinessService> spec) {
        spec.accept(this);
    }

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by `_reference` if the object is a reference.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * The name of the business service.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The user-provided description of the business service.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The point of contact assigned to this service.
     */
    @JsonProperty("point_of_contact")
    protected String pointOfContact;

    @JsonProperty("team")
    protected Team3 team;


}
