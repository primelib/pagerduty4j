package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddonReference
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
    "src",
    "name"
})
@JsonTypeName("AddonReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddonReference {

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    @JsonProperty("type")
    private TypeEnum type;

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
     * The URL source of the Addon
     */
    @JsonProperty("src")
    private String src;

    /**
     * The user entered name of the Addon.
     */
    @JsonProperty("name")
    private String name;


    @AllArgsConstructor
    public enum TypeEnum {
        FULL_PAGE_ADDON_REFERENCE("full_page_addon_reference"),
        INCIDENT_SHOW_ADDON_REFERENCE("incident_show_addon_reference");

        private final String value;
    }

}
