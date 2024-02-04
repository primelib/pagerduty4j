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
 * StatusPageService
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
    "self",
    "name",
    "status_page",
    "business_service",
    "type"
})
@JsonTypeName("StatusPageService")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPageService {

    /**
     * An unique identifier within Status Page scope that defines a Service entry.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The API resource URL of the Service.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * The name of the Service.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("status_page")
    protected StatusPageImpactStatusPage statusPage;

    @JsonProperty("business_service")
    protected StatusPageServiceBusinessService businessService;

    /**
     * A string that determines the schema of the object.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link StatusPageService}.
     *
     * @param spec the specification to process
     */
    public StatusPageService(Consumer<StatusPageService> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPageService}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPageService(Consumer)} instead.
     * @param id An unique identifier within Status Page scope that defines a Service entry.
     * @param self The API resource URL of the Service.
     * @param name The name of the Service.
     * @param statusPage statusPage
     * @param businessService businessService
     * @param type A string that determines the schema of the object.
     */
    @ApiStatus.Internal
    public StatusPageService(String id, String self, String name, StatusPageImpactStatusPage statusPage, StatusPageServiceBusinessService businessService, String type) {
        this.id = id;
        this.self = self;
        this.name = name;
        this.statusPage = statusPage;
        this.businessService = businessService;
        this.type = type;
    }

}
