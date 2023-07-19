package io.github.primelib.pagerduty4j.eventsv2;

import java.util.Map;
import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.eventsv2.api.PagerDutyEventsV2Api;
import io.github.primelib.pagerduty4j.eventsv2.auth.AuthInterceptor;

import com.fasterxml.jackson.module.blackbird.BlackbirdModule;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;

import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.micrometer.MicrometerCapability;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;

import io.github.resilience4j.bulkhead.BulkheadRegistry;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import io.github.resilience4j.micrometer.tagged.TaggedBulkheadMetrics;
import io.github.resilience4j.micrometer.tagged.TaggedCircuitBreakerMetrics;
import io.github.resilience4j.micrometer.tagged.TaggedRateLimiterMetrics;
import io.github.resilience4j.micrometer.tagged.TaggedRetryMetrics;
import io.github.resilience4j.ratelimiter.RateLimiterRegistry;
import io.github.resilience4j.retry.RetryRegistry;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;



import java.util.function.Consumer;

@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Slf4j
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PagerDutyEventsV2Factory {
    private static final ObjectMapper MAPPER = JsonMapper.builder()
            .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
            .enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .propertyNamingStrategy(PropertyNamingStrategies.LOWER_CAMEL_CASE)
            .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
            .addModule(new BlackbirdModule())
            .build();

    public static <T> T create(Consumer<PagerDutyEventsV2FactorySpec<T>> spec) {
        PagerDutyEventsV2FactorySpec<T> config = new PagerDutyEventsV2FactorySpec<>(spec);

        if (config.api().isInterface()) {
            return buildClient(spec);
        } else {
            try {
                PagerDutyEventsV2Api api = buildClient(s -> {
                    s.api(PagerDutyEventsV2Api.class);
                    s.applySpec(config);
                });
                return config.api().getConstructor(PagerDutyEventsV2Api.class).newInstance(api);
            } catch (Exception ex) {
                throw new IllegalArgumentException("api must have a constructor with one parameter of type PagerDutyEventsV2Api", ex);
            }
        }
    }

    public static PagerDutyEventsV2Api create() {
        return create(spec -> spec.api(PagerDutyEventsV2Api.class));
    }

    private static <T> T buildClient(Consumer<PagerDutyEventsV2FactorySpec<T>> spec) {
        PagerDutyEventsV2FactorySpec<T> config = new PagerDutyEventsV2FactorySpec<>(spec);

        // registries
        BulkheadRegistry bulkheadRegistry = BulkheadRegistry.ofDefaults();
        RateLimiterRegistry rateLimiterRegistry = RateLimiterRegistry.ofDefaults();
        CircuitBreakerRegistry circuitBreakerRegistry = CircuitBreakerRegistry.ofDefaults();
        RetryRegistry retryRegistry = RetryRegistry.ofDefaults();

        // decorators
        FeignDecorators decorators = FeignDecorators.builder()
                .withBulkhead(bulkheadRegistry.bulkhead(config.backendName()))
                .withRateLimiter(rateLimiterRegistry.rateLimiter(config.backendName()))
                .withCircuitBreaker(circuitBreakerRegistry.circuitBreaker(config.backendName()))
                .withRetry(retryRegistry.retry(config.backendName()))
                .build();

        // metrics
        TaggedBulkheadMetrics.ofBulkheadRegistry(bulkheadRegistry).bindTo(config.meterRegistry());
        TaggedRateLimiterMetrics.ofRateLimiterRegistry(rateLimiterRegistry).bindTo(config.meterRegistry());
        TaggedCircuitBreakerMetrics.ofCircuitBreakerRegistry(circuitBreakerRegistry).bindTo(config.meterRegistry());
        TaggedRetryMetrics.ofRetryRegistry(retryRegistry).bindTo(config.meterRegistry());

        // builder
        return Resilience4jFeign.builder(decorators)
                .client(new OkHttpClient())
                .encoder(new JacksonEncoder(MAPPER))
                .decoder(new JacksonDecoder(MAPPER))
                .logger(new Slf4jLogger())
                .logLevel(Logger.Level.valueOf(config.logLevel().toUpperCase()))
                .addCapability(new MicrometerCapability(config.meterRegistry()))
                .requestInterceptor(new AuthInterceptor(config.auth()))
                .target(config.api(), config.baseUrl());
    }
}
