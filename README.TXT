My contribute part is implementation of developauser-friendly interface for generating and running benchmarks, as well as finding the best way tovisualise benchmark results.

DCOPs Benchmark v0.8.0 README

Welcome to the Dynamic Constrained Optimisation Benchmark.

USAGE
The usage here is simple, load up the .jar for the application, select your settings & run your experiments.

SETTINGS
Function Settings
Number of Changes: Number of times the function & constraints will change in a single run
Number of dimensions: Number of variables in the objective function & number of constraints per time
Number of Runs: Number of times the benchmark will run for each function & algorithm combination

Constraint Generation
Generate Constraint: Create a new ConstraintSet.txt/.csv with constraints for the current settings
Use Existing Constraints: Uses the existing ConstraintSet.txt/.csv if it exists

Search Space Settings
Lower Bounds: Minimum value a solution can have in any dimension
Upper Bounds: Maximum value a solution can have in any dimension
Function Default: Uses the standard values for the pre-existing functions from their associated literature

Function Selection:
Sphere: x^2 for n dimensions
Rastrgin: 10n + (x^2 - 10cos(2*pi*x) for n dimensions)
Ackley: -20 * e(-0.2 * sqrt(0.5*x^2)) - e(0.5*(cos(2*pi*x))) + e + 20
Rosenbrock: 100 * (1-x)^2 + 100 * x^2

Algorithm Selection:
Feasibility Rules: Pick the function with the lowest constraint violations or if they are 0, fitness
Epsilon Constrained: Identical to Feasibility Rules but with a margin of lenency for solutions with constraint violations
Penalty Method: Multiplies the fitness of a solution by a constant when it violates constraints
Frequency: The number of evaluations the benchmark goes through for each time

Frequency Distribution
Static: Every time has the number of evaluations defined in the frequency
Frequency Variance: Every time has a random number of evaluations normally distributed from the mean defined in the frequency

Solution Accuracy
Quick: 10,000 evaluations per change before the benchmark to find optimal values
Balanced: Identical to quick but 100,000 evaluations
High Accuracy: Identical to quick but 1,000,000 evaluations
Adaptive: The benchmark will determine on its own how many are required until the global optima are found
Number of Runs: Number of runs the function solver completes

EXECUTION
To run the project from the command line, go to the dist folder and
type the following:

java -jar "DCOPs_Benchmark.jar"

Alternatively, you can just run the .jar from the file explorer

RESULTS
The constraints for the experiments

The best known solutions for each variable for each time
The fitness & constraint violations for each time for validation

Each function & algorithm combination will have a csv with all the results for each time for the following values
- Fitness values per evaluation
- Fitness values per generation
- Modified offline error
- Constraint violations per evaluation
- Constraint violations per generation

Adding custom functions & algorithms
The files CustomFunction.java & Custom Algorithm.java can be found in ~/src/dcops/benchmark/
There they can be edited & the project rebuilt.
WARNING: The new .jar will be found in ~/dist/
