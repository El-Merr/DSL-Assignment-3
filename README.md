# DSL-Assignment-3
# Merel Eikens - 1247158
# Thomas Versaevel - 1248804

# Locations guide to all different project files

The Eclipse Ecore Metamodel is located in:
    DSL-Assignment-3/robot.metamodel/

The Eclipse Xtext project is located in:
    DSL-Assignment-3/robot.xtext/

The Eclipse runtime project is located in:
    DSL-Assignment-3/textDSL/
This project contains some passing .robot tests in:
    DSL-Assignment-3/textDSL/PassingTests
And some failing .robot tests in:
    DSL-Assignment-3/textDSL/FailingTests
The generates .xml files when saving a passing test is located in:
    DSL-Assignment-3/textDSL/src-gen

The Python visualizer is located in:
    DSL-Assignment-3/python/visualizer.py
When running the visualizer, it reads the .xml files from:
    DSL-Assignment-3/textDSL/src-gen
And places the resulting .jpg visualizations in:
    DSL-Assignment-3/python/results/