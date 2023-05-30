package schema.types;

public class ApplicationInstallationCommandInput {
  private String project;

  private String version;

  private String defaultLocale;

  public ApplicationInstallationCommandInput() {
  }

  public ApplicationInstallationCommandInput(String project, String version, String defaultLocale) {
    this.project = project;
    this.version = version;
    this.defaultLocale = defaultLocale;
  }

  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  @Override
  public String toString() {
    return "ApplicationInstallationCommandInput{" + "project='" + project + "'," +"version='" + version + "'," +"defaultLocale='" + defaultLocale + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicationInstallationCommandInput that = (ApplicationInstallationCommandInput) o;
        return java.util.Objects.equals(project, that.project) &&
                            java.util.Objects.equals(version, that.version) &&
                            java.util.Objects.equals(defaultLocale, that.defaultLocale);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(project, version, defaultLocale);
  }

  public static ApplicationInstallationCommandInput.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    private String project;

    private String version;

    private String defaultLocale;

    public ApplicationInstallationCommandInput build() {
                  ApplicationInstallationCommandInput result = new ApplicationInstallationCommandInput();
                      result.project = this.project;
          result.version = this.version;
          result.defaultLocale = this.defaultLocale;
                      return result;
    }

    public ApplicationInstallationCommandInput.Builder project(
        String project) {
      this.project = project;
      return this;
    }

    public ApplicationInstallationCommandInput.Builder version(
        String version) {
      this.version = version;
      return this;
    }

    public ApplicationInstallationCommandInput.Builder defaultLocale(
        String defaultLocale) {
      this.defaultLocale = defaultLocale;
      return this;
    }
  }
}
