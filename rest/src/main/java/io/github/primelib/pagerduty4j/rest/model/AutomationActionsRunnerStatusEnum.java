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
 * AutomationActionsRunnerStatusEnum
 *
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonTypeName("AutomationActionsRunnerStatusEnum")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsRunnerStatusEnum {

    /**
     * Constructs a validated implementation of {@link AutomationActionsRunnerStatusEnum}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutomationActionsRunnerStatusEnum(Consumer<AutomationActionsRunnerStatusEnum> spec) {
        spec.accept(this);
    }


}
