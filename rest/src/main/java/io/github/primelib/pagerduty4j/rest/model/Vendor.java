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
 * Vendor
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
    "website_url",
    "logo_url",
    "thumbnail_url",
    "description",
    "integration_guide_url"
})
@JsonTypeName("Vendor")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Vendor {

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

    /**
     * Constructs a validated instance of {@link Vendor}.
     *
     * @param spec the specification to process
     */
    public Vendor(Consumer<Vendor> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Vendor}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Vendor(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type A string that determines the schema of the object. This must be the standard name for the entity, suffixed by {@code _reference} if the object is a reference.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param name The short name of the vendor
     * @param websiteUrl URL of the vendor's main website
     * @param logoUrl URL of a logo identifying the vendor
     * @param thumbnailUrl URL of a small thumbnail image identifying the vendor
     * @param description A short description of this vendor, and common use-cases of integrations for this vendor.
     * @param integrationGuideUrl URL of an integration guide for this vendor
     */
    @ApiStatus.Internal
    public Vendor(String id, String summary, String type, String self, String htmlUrl, String name, String websiteUrl, String logoUrl, String thumbnailUrl, String description, String integrationGuideUrl) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.websiteUrl = websiteUrl;
        this.logoUrl = logoUrl;
        this.thumbnailUrl = thumbnailUrl;
        this.description = description;
        this.integrationGuideUrl = integrationGuideUrl;
    }

}
