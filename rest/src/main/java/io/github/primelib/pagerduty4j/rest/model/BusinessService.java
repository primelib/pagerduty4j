package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BusinessService
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * A string that determines the schema of the object. This must be the standard name for the entity, suffixed by `_reference` if the object is a reference.
     */
    @JsonProperty("type")
    private String type;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    private String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    private String htmlUrl;

    /**
     * The name of the business service.
     */
    @JsonProperty("name")
    private String name;

    /**
     * The user-provided description of the business service.
     */
    @JsonProperty("description")
    private String description;

    /**
     * The point of contact assigned to this service.
     */
    @JsonProperty("point_of_contact")
    private String pointOfContact;

    @JsonProperty("team")
    private Team3 team;


}