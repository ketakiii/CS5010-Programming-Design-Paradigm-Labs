package assignments;

import java.util.Comparator;
import java.util.List;

/**
 * This method defines the strategy that sorts the assignments based on the difficulty level.
 */
public class DifficultySchedulingStrategy implements SchedulingStrategy {

  /**
   * Method responsible for scheduling the assignments according to a given strategy.
   * @param assignments assignments
   * @return string
   */
  @Override public String schedule(List<Assignment> assignments) {
    if (assignments == null) {
      throw new IllegalArgumentException("Assignments given are null");
    }
    assignments.sort(Comparator.comparing(Assignment:: getDifficulty).reversed());
    return "difficulty";
  }
}
