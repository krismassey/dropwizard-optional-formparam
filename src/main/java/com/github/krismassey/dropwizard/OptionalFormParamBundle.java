package com.github.krismassey.dropwizard;

import io.dropwizard.ConfiguredBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class OptionalFormParamBundle<T> implements ConfiguredBundle<T> {

    @Override
    public final void run(T configuration, Environment environment) throws Exception {
        environment.jersey().getResourceConfig().getClasses().add(OptionalFormParamInjectableProvider.class);
    }

    @Override
    public final void initialize(Bootstrap<?> bootstrap) {
        // nothing
    }
}