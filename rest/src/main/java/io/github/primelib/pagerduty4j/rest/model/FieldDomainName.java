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
 * FieldDomainName
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
    "order",
    "summary"
})
@JsonTypeName("Field_domain_name")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldDomainName {

    @JsonProperty("order")
    protected Integer order;

    @JsonProperty("summary")
    protected String summary;

    /**
     * Constructs a validated instance of {@link FieldDomainName}.
     *
     * @param spec the specification to process
     */
    public FieldDomainName(Consumer<FieldDomainName> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldDomainName}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldDomainName(Consumer)} instead.
     * @param order order
     * @param summary summary
     */
    @ApiStatus.Internal
    public FieldDomainName(Integer order, String summary) {
        this.order = order;
        this.summary = summary;
    }

}
