import argparse
import json

parser = argparse.ArgumentParser(description='Generates basic models and blockstate defs for Minecraft')
parser.add_argument('type', metavar='type', help='Type of model\n * basic: basic block with same texture on all sides\n * pillar: pillar block with same top and bottom texture, but different sides (texture order: top,side)\n * pillardiff: pillar block with different top, bottom, and side textures. (texture order: top,bottom,side)')
parser.add_argument('textures', metavar='tex', help='Texture list, seperated by commas if there are multiple textures')
parser.add_argument('id', metavar='id', help='ID of block, used for item model and blockstate definition.')
parser.add_argument('modelname', metavar='mname', help='Name/path of block model.')
args = parser.parseargs()

model = open("assets/dungeons/models/block/" + args.modelname + ".json", "w")
item = open("assets/dungeons/models/item/" + args.id + ".json", "w")
state = open("assets/dungeons/blockstates/" + args.id + ".json", "w")

datablock = {}
dataitem = {}
datastate = {}

if args.type == 'basic':
    #block data
    datablock['parent'] = "minecraft:block/cube_all"
    datablock['textures'] = {
        "all": "dungeons:block/" + sys.argv[1]
    }

    # item data
    dataitem['parent'] = "dungeons:block/" + sys.argv[1]

    # state data
    datastate['variants'] = {
        "": {"model": "dungeons:block/" + sys.argv[1]}
    }

json.dump(datadef, model)
json.dump(dataitem, item)
json.dump(datastate, state)
