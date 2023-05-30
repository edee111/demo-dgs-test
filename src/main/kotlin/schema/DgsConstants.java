package schema;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String Sys_Applications = "sys_Applications";

    public static final String Sys_Application = "sys_Application";

    public static class SYS_APPLICATIONS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String Last = "last";

      public static final String Before = "before";
    }

    public static class SYS_APPLICATION_INPUT_ARGUMENT {
      public static final String SysId = "sysId";
    }
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String Sys_installApplication = "sys_installApplication";

    public static class SYS_INSTALLAPPLICATION_INPUT_ARGUMENT {
      public static final String Input = "input";
    }
  }

  public static class INSTALLAPPLICATIONPAYLOAD {
    public static final String TYPE_NAME = "InstallApplicationPayload";

    public static final String Application = "application";
  }

  public static class APPLICATIONGQLCONNECTION {
    public static final String TYPE_NAME = "ApplicationGqlConnection";

    public static final String TotalCount = "totalCount";

    public static final String Edges = "edges";
  }

  public static class APPLICATIONGQLEDGE {
    public static final String TYPE_NAME = "ApplicationGqlEdge";

    public static final String Cursor = "cursor";

    public static final String Node = "node";
  }

  public static class APPLICATIONGQL {
    public static final String TYPE_NAME = "ApplicationGql";

    public static final String SysId = "sysId";

    public static final String Vendor = "vendor";

    public static final String Name = "name";

    public static final String Description = "description";

    public static final String SupportedLocales = "supportedLocales";

    public static final String DefaultLocale = "defaultLocale";

    public static final String Dependencies = "dependencies";
  }

  public static class APPLICATIONDEPENDENCIESGQL {
    public static final String TYPE_NAME = "ApplicationDependenciesGql";

    public static final String AppApi = "appApi";
  }

  public static class APPLICATIONINSTALLATIONCOMMANDINPUT {
    public static final String TYPE_NAME = "ApplicationInstallationCommandInput";

    public static final String Project = "project";

    public static final String Version = "version";

    public static final String DefaultLocale = "defaultLocale";
  }
}
