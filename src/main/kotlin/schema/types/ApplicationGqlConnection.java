package schema.types;

import java.util.List;

public class ApplicationGqlConnection {
  private int totalCount;

  private List<ApplicationGqlEdge> edges;

  public ApplicationGqlConnection() {
  }

  public ApplicationGqlConnection(int totalCount, List<ApplicationGqlEdge> edges) {
    this.totalCount = totalCount;
    this.edges = edges;
  }

  public int getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  public List<ApplicationGqlEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<ApplicationGqlEdge> edges) {
    this.edges = edges;
  }

  @Override
  public String toString() {
    return "ApplicationGqlConnection{" + "totalCount='" + totalCount + "'," +"edges='" + edges + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicationGqlConnection that = (ApplicationGqlConnection) o;
        return totalCount == that.totalCount &&
                            java.util.Objects.equals(edges, that.edges);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(totalCount, edges);
  }

  public static ApplicationGqlConnection.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private int totalCount;

    private List<ApplicationGqlEdge> edges;

    public ApplicationGqlConnection build() {
                  ApplicationGqlConnection result = new ApplicationGqlConnection();
                      result.totalCount = this.totalCount;
          result.edges = this.edges;
                      return result;
    }

    public ApplicationGqlConnection.Builder totalCount(
        int totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    public ApplicationGqlConnection.Builder edges(
        List<ApplicationGqlEdge> edges) {
      this.edges = edges;
      return this;
    }
  }
}
