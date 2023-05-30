package schema.types;

public class InstallApplicationPayload {
  private ApplicationGql application;

  public InstallApplicationPayload() {
  }

  public InstallApplicationPayload(ApplicationGql application) {
    this.application = application;
  }

  public ApplicationGql getApplication() {
    return application;
  }

  public void setApplication(ApplicationGql application) {
    this.application = application;
  }

  @Override
  public String toString() {
    return "InstallApplicationPayload{" + "application='" + application + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstallApplicationPayload that = (InstallApplicationPayload) o;
        return java.util.Objects.equals(application, that.application);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(application);
  }

  public static InstallApplicationPayload.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private ApplicationGql application;

    public InstallApplicationPayload build() {
      InstallApplicationPayload result = new InstallApplicationPayload();
          result.application = this.application;
          return result;
    }

    public InstallApplicationPayload.Builder application(
        ApplicationGql application) {
      this.application = application;
      return this;
    }
  }
}
