import xml.etree.ElementTree as ET
from PIL import Image, ImageDraw
import seaborn as sns

import os
import glob

for file in glob.glob(r'../robotTests/src-gen/*.xml'):
    filename = file.split('\\')[-1].split('.xml')[0]

    if not os.path.exists(file):
        print('ERROR : This path does not exist !!')
    
    with open(file, 'rb') as file:
        tree = ET.parse(file)
    root = tree.getroot()
    
    def dirX(d):
        switch ={
            'left': -1,
            'right': 1,
            'up': 0,
            'down': 0,
            }
        return switch.get(d)
    
    def dirY(d):
        switch ={
            'left': 0,
            'right': 0,
            'up': -1,
            'down': 1,
            }
        return switch.get(d)
    
    scale = 30
    w,h = 400, 400
    
    image= Image.new("RGB", (w,h))
    img = ImageDraw.Draw(image)
    
    palette = sns.color_palette(n_colors=len(root.findall('robot'))+1).as_hex()
    c = 0
    
    for robot in root.findall('robot'):
        x, y = w/2, h/2
        
        if (robot.find('initial') is not None):
            i = robot.find('initial')
            x, y = x + scale * -int(i.attrib['x']), y + scale * -int(i.attrib['y'])
    
        recW = 5
        img.rectangle([(x-recW,y-recW), (x+recW,y+recW)], fill=palette[c])
        
        for step in robot.findall('step'):
            newX = x + (dirX(step.attrib['dir']) * int(step.attrib['dist']) * scale)
            newY = y + (dirY(step.attrib['dir']) * int(step.attrib['dist']) * scale)
            
            img.line([(x,y), (newX,newY)], fill=palette[c], width=2)
            
            x, y = newX, newY
        
        c+=1
            
    # image.show()
    image.save(r'results/'+filename+'.jpg')

    
    
    
    
    
    
    
    