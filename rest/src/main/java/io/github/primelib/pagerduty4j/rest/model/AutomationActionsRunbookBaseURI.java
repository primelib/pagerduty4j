package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AutomationActionsRunbookBaseURI
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@Builder
@JsonTypeName("AutomationActionsRunbookBaseURI")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsRunbookBaseURI {

    /**
     * Constructs a validated instance of {@link AutomationActionsRunbookBaseURI}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsRunbookBaseURI(Consumer<AutomationActionsRunbookBaseURI> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsRunbookBaseURI}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsRunbookBaseURI(Consumer)} instead.
     */
    @ApiStatus.Internal
    public AutomationActionsRunbookBaseURI() {
    }

}
