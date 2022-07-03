import xml.etree.ElementTree as ET
import graphviz

import os

filename = '../testDSL/src-gen/test.robot.xml'

if not os.path.exists(filename):
    print('ERROR : This path does not exist !!')

with open(filename, 'rb') as file:
    tree = ET.parse(file)
root = tree.getroot()

# structure_name = 'HCLgraph' # structure.findtext('./Name')
# graph = graphviz.Digraph(format='svg',comment='structure_name', node_attr={'shape': 'box'})


i = 0

# read all the structures
# for node in root.findall('nodes'): # root: #.findall('./Graph'):
#     label = node.attrib['label']
#     nodeId = "//@nodes.{}".format(i)
#     # n = Node(node.attrib['label'], i)
#     # nodelist.append(n)
    
#     if 'shape' in node.attrib:
#         graph.node(nodeId, label, shape='oval')
#     graph.node(nodeId, label)
    
#     i += 1
        
#     for edge in node:
#         target = edge.attrib['target']
#         if 'style' in edge.attrib:
#             graph.edge(nodeId, target, style='dashed')
#         else: graph.edge(nodeId, target)
    
    