package schema.types;

public class ApplicationDependenciesGql {
  private String appApi;

  public ApplicationDependenciesGql() {
  }

  public ApplicationDependenciesGql(String appApi) {
    this.appApi = appApi;
  }

  public String getAppApi() {
    return appApi;
  }

  public void setAppApi(String appApi) {
    this.appApi = appApi;
  }

  @Override
  public String toString() {
    return "ApplicationDependenciesGql{" + "appApi='" + appApi + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicationDependenciesGql that = (ApplicationDependenciesGql) o;
        return java.util.Objects.equals(appApi, that.appApi);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(appApi);
  }

  public static ApplicationDependenciesGql.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String appApi;

    public ApplicationDependenciesGql build() {
      ApplicationDependenciesGql result = new ApplicationDependenciesGql();
          result.appApi = this.appApi;
          return result;
    }

    public ApplicationDependenciesGql.Builder appApi(String appApi) {
      this.appApi = appApi;
      return this;
    }
  }
}
