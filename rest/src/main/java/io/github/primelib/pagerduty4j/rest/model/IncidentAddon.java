package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncidentAddon
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
    "src",
    "services"
})
@JsonTypeName("IncidentAddon")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncidentAddon {

    /**
     * Constructs a validated implementation of {@link IncidentAddon}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncidentAddon(Consumer<IncidentAddon> spec) {
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
     * The type of Add-on.
     */
    @JsonProperty("type")
    protected TypeEnum type;

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
     * The name of the Add-on.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The source URL to display in a frame in the PagerDuty UI. HTTPS is required.
     */
    @JsonProperty("src")
    protected String src;

    /**
     * The services this Add-on is associated with. If non-empty, the Add-on will appear only on incidents for those services. If empty, it will appear on incidents for all services. 
     */
    @JsonProperty("services")
    protected List<ServiceReference> services;


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
