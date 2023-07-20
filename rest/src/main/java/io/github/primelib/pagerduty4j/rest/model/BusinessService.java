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
 * BusinessService
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

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
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

    /**
     * Constructs a validated instance of {@link BusinessService}.
     *
     * @param spec the specification to process
     */
    public BusinessService(Consumer<BusinessService> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BusinessService}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BusinessService(Consumer)} instead.
     * @param id var.name
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param name The name of the business service.
     * @param description The user-provided description of the business service.
     * @param pointOfContact The point of contact assigned to this service.
     * @param team var.name
     */
    @ApiStatus.Internal
    public BusinessService(String id, String summary, String type, String self, String htmlUrl, String name, String description, String pointOfContact, Team3 team) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.description = description;
        this.pointOfContact = pointOfContact;
        this.team = team;
    }

}
