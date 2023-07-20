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
 * AutomationActionsAbstractActionAllOfLastRunByOneOf
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
    "type"
})
@JsonTypeName("AutomationActionsAbstractAction_allOf_last_run_by_oneOf")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsAbstractActionAllOfLastRunByOneOf {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link AutomationActionsAbstractActionAllOfLastRunByOneOf}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsAbstractActionAllOfLastRunByOneOf(Consumer<AutomationActionsAbstractActionAllOfLastRunByOneOf> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsAbstractActionAllOfLastRunByOneOf}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsAbstractActionAllOfLastRunByOneOf(Consumer)} instead.
     * @param id var.name
     * @param type var.name
     */
    @ApiStatus.Internal
    public AutomationActionsAbstractActionAllOfLastRunByOneOf(String id, String type) {
        this.id = id;
        this.type = type;
    }

}
