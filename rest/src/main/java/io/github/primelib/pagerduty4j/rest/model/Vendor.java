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
 * Vendor
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
    "website_url",
    "logo_url",
    "thumbnail_url",
    "description",
    "integration_guide_url"
})
@JsonTypeName("Vendor")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Vendor {

    /**
     * Constructs a validated implementation of {@link Vendor}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Vendor(Consumer<Vendor> spec) {
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
     * The short name of the vendor
     */
    @JsonProperty("name")
    protected String name;

    /**
     * URL of the vendor's main website
     */
    @JsonProperty("website_url")
    protected String websiteUrl;

    /**
     * URL of a logo identifying the vendor
     */
    @JsonProperty("logo_url")
    protected String logoUrl;

    /**
     * URL of a small thumbnail image identifying the vendor
     */
    @JsonProperty("thumbnail_url")
    protected String thumbnailUrl;

    /**
     * A short description of this vendor, and common use-cases of integrations for this vendor.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * URL of an integration guide for this vendor
     */
    @JsonProperty("integration_guide_url")
    protected String integrationGuideUrl;


}
