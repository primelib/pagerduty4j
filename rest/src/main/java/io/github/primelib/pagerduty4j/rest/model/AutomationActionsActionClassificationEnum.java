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
 * AutomationActionsActionClassificationEnum
 *
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AutomationActionsActionClassificationEnum")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsActionClassificationEnum {

    /**
     * Constructs a validated implementation of {@link AutomationActionsActionClassificationEnum}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutomationActionsActionClassificationEnum(Consumer<AutomationActionsActionClassificationEnum> spec) {
        spec.accept(this);
    }


}
