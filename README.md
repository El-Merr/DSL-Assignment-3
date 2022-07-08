# DSL-Assignment-3
# Merel Eikens - 1247158
# Thomas Versaevel - 1248804

# Locations guide to all different project files

The Eclipse Ecore Metamodel is located in:
    DSL-Assignment-3/robot.metamodel/

The Eclipse Xtext project is located in:
    DSL-Assignment-3/robot.xtext/

The tests for the Eclipse runtime project is located in:
    DSL-Assignment-3/robotTests/
This project contains some passing .robot tests in:
    DSL-Assignment-3/robotTests/PassingTests
And some failing .robot tests in:
    DSL-Assignment-3/robotTests/FailingTests
The generates .xml files when saving a passing test is located in:
    DSL-Assignment-3/robotTests/src-gen

The Python visualizer is located in:
    DSL-Assignment-3/python/visualizer.py
When running the visualizer, it reads the .xml files from:
    DSL-Assignment-3/robotTests/src-gen
And places the resulting .jpg visualizations in:
    DSL-Assignment-3/python/results/