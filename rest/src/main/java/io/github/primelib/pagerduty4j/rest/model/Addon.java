package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Addon
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
    "src"
})
@JsonTypeName("Addon")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Addon {

    @JsonProperty("id")
    private String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to `name`, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    private String summary;

    /**
     * The type of Add-on.
     */
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
     * The name of the Add-on.
     */
    @JsonProperty("name")
    private String name;

    /**
     * The source URL to display in a frame in the PagerDuty UI. HTTPS is required.
     */
    @JsonProperty("src")
    private String src;


    /**
     * The type of Add-on.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        FULL_PAGE_ADDON("full_page_addon"),
        INCIDENT_SHOW_ADDON("incident_show_addon");

        private final String value;
    }

}
