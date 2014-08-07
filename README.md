dropwizard-optional-formparam
=============================

If you need the ability to wrap a @FormParam value within an Optional object. This should do the trick. 


To configure your dropwizard server add:

environment.jersey().getResourceConfig().getClasses().add(OptionalFormParamInjectableProvider.class);

