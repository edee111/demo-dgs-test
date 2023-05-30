package schema.types;

import java.util.List;

public class ApplicationGql {
  private String sysId;

  private String vendor;

  private String name;

  private String description;

  private List<String> supportedLocales;

  private String defaultLocale;

  private ApplicationDependenciesGql dependencies;

  public ApplicationGql() {
  }

  public ApplicationGql(String sysId, String vendor, String name, String description,
      List<String> supportedLocales, String defaultLocale,
      ApplicationDependenciesGql dependencies) {
    this.sysId = sysId;
    this.vendor = vendor;
    this.name = name;
    this.description = description;
    this.supportedLocales = supportedLocales;
    this.defaultLocale = defaultLocale;
    this.dependencies = dependencies;
  }

  public String getSysId() {
    return sysId;
  }

  public void setSysId(String sysId) {
    this.sysId = sysId;
  }

  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<String> getSupportedLocales() {
    return supportedLocales;
  }

  public void setSupportedLocales(List<String> supportedLocales) {
    this.supportedLocales = supportedLocales;
  }

  public String getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  public ApplicationDependenciesGql getDependencies() {
    return dependencies;
  }

  public void setDependencies(ApplicationDependenciesGql dependencies) {
    this.dependencies = dependencies;
  }

  @Override
  public String toString() {
    return "ApplicationGql{" + "sysId='" + sysId + "'," +"vendor='" + vendor + "'," +"name='" + name + "'," +"description='" + description + "'," +"supportedLocales='" + supportedLocales + "'," +"defaultLocale='" + defaultLocale + "'," +"dependencies='" + dependencies + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicationGql that = (ApplicationGql) o;
        return java.util.Objects.equals(sysId, that.sysId) &&
                            java.util.Objects.equals(vendor, that.vendor) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(description, that.description) &&
                            java.util.Objects.equals(supportedLocales, that.supportedLocales) &&
                            java.util.Objects.equals(defaultLocale, that.defaultLocale) &&
                            java.util.Objects.equals(dependencies, that.dependencies);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(sysId, vendor, name, description, supportedLocales, defaultLocale, dependencies);
  }

  public static ApplicationGql.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String sysId;

    private String vendor;

    private String name;

    private String description;

    private List<String> supportedLocales;

    private String defaultLocale;

    private ApplicationDependenciesGql dependencies;

    public ApplicationGql build() {
                  ApplicationGql result = new ApplicationGql();
                      result.sysId = this.sysId;
          result.vendor = this.vendor;
          result.name = this.name;
          result.description = this.description;
          result.supportedLocales = this.supportedLocales;
          result.defaultLocale = this.defaultLocale;
          result.dependencies = this.dependencies;
                      return result;
    }

    public ApplicationGql.Builder sysId(String sysId) {
      this.sysId = sysId;
      return this;
    }

    public ApplicationGql.Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }

    public ApplicationGql.Builder name(String name) {
      this.name = name;
      return this;
    }

    public ApplicationGql.Builder description(String description) {
      this.description = description;
      return this;
    }

    public ApplicationGql.Builder supportedLocales(
        List<String> supportedLocales) {
      this.supportedLocales = supportedLocales;
      return this;
    }

    public ApplicationGql.Builder defaultLocale(
        String defaultLocale) {
      this.defaultLocale = defaultLocale;
      return this;
    }

    public ApplicationGql.Builder dependencies(
        ApplicationDependenciesGql dependencies) {
      this.dependencies = dependencies;
      return this;
    }
  }
}
