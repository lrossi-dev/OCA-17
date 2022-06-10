/*
 * The idea here was to test what would happen if I changed the main method's return type. 
 * Since I'm not extending anything, I suppose the compiler should't complain, but this is 
 * a special method so there's probably some special rule.
 * It's also logic to think that the JVM should't mind if a return anything, right? I mean,
 * the returned value won't ever be used, but I think JVM could handle it.
 * 
 * So my final guess is: compiler won't complain, maybe throw some warning, and if it compiles 
 * then JVM should be able to run it.
 */
public class MainExperiment01 {

  public static int main(String... args) {
    System.out.println("Hello World");
    return 0;
  }

}

/*
 * Ok, so the compiler actually didn't complain about anything, but the JVM did.
 * When I tried to run the bytecode, the output was:
 *
 * Error: Main method must return a value of type void in class MainExperiment01, 
 * please define the main method as:
 *   public static void main(String[] args)
 *
 * So that's it, compiler is ok but all the modifiers must match for the JVM to run it.
 */
