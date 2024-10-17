import cs2030s.fp.Maybe;
import cs2030s.fp.Transformer;
import java.util.Map;

public class Lab6Mini1 {
  /*
  public static String getGrade(String student, String module,
      String assessment, Map<String, Map<String, Map<String, String>>> dbase) {
    Map<String, Map<String, String>> std = dbase.get(student);
    if (std == null) {
      return "No such entry";
    } else {
      Map<String, String> mod = std.get(module);
      if (mod == null) {
        return "No such entry";
      } else {
        String grade = mod.get(assessment);
        if (grade == null) {
          return "No such entry";
        }
        return grade;
      }
    }
  }
  */

  public static String getGrade(String student, String module,
      String assessment, Map<String, Map<String, Map<String, String>>> dbase) {
    return Maybe.of(dbase.get(student))
        .flatMap(stud -> Maybe.of(stud.get(module)))
        .flatMap(mod -> Maybe.of(mod.get(assessment)))
        .orElse(() -> "No such entry");
  }

  /* HINT:
  public static String getGrade(String student, String module,
      String assessment, Map<String, Map<String, Map<String, String>>> dbase) {
    return Maybe.of(...)
                .map(...)      // not all of these are needed
                .filter(...)   // not all of these are needed
                .flatMap(...)  // not all of these are needed
                .map(...)      // not all of these are needed
                .filter(...)   // not all of these are needed
                .flatMap(...)  // not all of these are needed
                ...
  }
   */

  public static void main(String[] args) {
    Map<String, Map<String, Map<String, String>>> students =
        Map.of(
            "Steve", Map.of(
                "CS2030", Map.of(
                        "ex1", "A",
                        "ex2", "A-",
                        "ex3", "A+",
                        "ex4", "B",
                        "pa1", "C"),
                "CS2040", Map.of(
                        "ex1", "A",
                        "ex2", "A+",
                        "ex3", "A+",
                        "ex4", "A",
                        "midterm", "A+")),
            "Tony", Map.of(
                "CS2030", Map.of(
                    "ex1", "C",
                    "ex2", "C",
                    "ex3", "B-",
                    "ex4", "B+",
                    "pa1", "A")));

    System.out.println(getGrade("Steve", "CS2030", "ex1", students));
    System.out.println(getGrade("Steve", "CS2030", "ex2", students));
    System.out.println(getGrade("Steve", "CS2040", "ex3", students));
    System.out.println(getGrade("Steve", "CS2040", "ex4", students));
    System.out.println(getGrade("Tony", "CS2030", "ex1", students));
    System.out.println(getGrade("Tony", "CS2030", "midterm", students));
    System.out.println(getGrade("Tony", "CS2040", "ex4", students));
    System.out.println(getGrade("Bruce", "CS2040", "ex4", students));
  }
}
