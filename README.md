DropWizard Optional @FormParam
=============================

NOTE: This functionality was merged into DropWizard 0.7.X [PR -> https://github.com/dropwizard/dropwizard/pull/677]


If you need the ability to wrap a @FormParam value within an Optional object. This bundle will add the required functionality.


## Adding to your application

### Default configuration
If you're happy for the flash scope cookie to be created with the default configuration, add this to your Application
class:

```java
@Override
public void initialize(Bootstrap<HyraxApplicationConfiguration> bootstrap) {
    bootstrap.addBundle(new OptionalFormParamBundle());
}

```



