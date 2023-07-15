package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AutomationActionsRunbookBaseURI
 *
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AutomationActionsRunbookBaseURI")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsRunbookBaseURI {

    /**
     * Constructs a validated implementation of {@link AutomationActionsRunbookBaseURI}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutomationActionsRunbookBaseURI(Consumer<AutomationActionsRunbookBaseURI> spec) {
        spec.accept(this);
    }


}
