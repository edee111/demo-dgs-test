package schema.types;

public class ApplicationGqlEdge {
  private String cursor;

  private ApplicationGql node;

  public ApplicationGqlEdge() {
  }

  public ApplicationGqlEdge(String cursor, ApplicationGql node) {
    this.cursor = cursor;
    this.node = node;
  }

  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public ApplicationGql getNode() {
    return node;
  }

  public void setNode(ApplicationGql node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "ApplicationGqlEdge{" + "cursor='" + cursor + "'," +"node='" + node + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicationGqlEdge that = (ApplicationGqlEdge) o;
        return java.util.Objects.equals(cursor, that.cursor) &&
                            java.util.Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(cursor, node);
  }

  public static ApplicationGqlEdge.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String cursor;

    private ApplicationGql node;

    public ApplicationGqlEdge build() {
                  ApplicationGqlEdge result = new ApplicationGqlEdge();
                      result.cursor = this.cursor;
          result.node = this.node;
                      return result;
    }

    public ApplicationGqlEdge.Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    public ApplicationGqlEdge.Builder node(ApplicationGql node) {
      this.node = node;
      return this;
    }
  }
}
