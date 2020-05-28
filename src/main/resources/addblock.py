import argparse
import json

parser = argparse.ArgumentParser(description='Generates basic models and blockstate defs for Minecraft')
parser.add_argument('area', metavar='area', help='Area of model\n * none: No area/generic block\n * cw: Creeper Woods\n * dt: Desert Temple\n * pm: Pumpkin Pastures\n * cc: Cacti Canyon\n ss: Soggy Swamp')
parser.add_argument('id', metavar='id', help='ID of block, without area affix.')
args = parser.parse_args()

if args.area == 'none':
    item = open("assets/dungeons/models/item/{}.json".format(args.id), "w")
    state = open("assets/dungeons/blockstates/{}.json".format(args.id), "w")
else:
    item = open("assets/dungeons/models/item/{}_{}.json".format(args.area, args.id), "w")
    state = open("assets/dungeons/blockstates/{}_{}.json".format(args.area, args.id), "w")

if args.area == 'none':
    model = open("assets/dungeons/models/block/" + args.id + ".json", "w")
    textureaffix = ''
if args.area == 'cw':
    model = open("assets/dungeons/models/block/creeper_woods/" + args.id + ".json", "w")
    textureaffix = 'creeper_woods/'
if args.area == 'dt':
    model = open("assets/dungeons/models/block/desert_temple/" + args.id + ".json", "w")
    textureaffix = 'desert_temple/'
if args.area == 'pm':
    model = open("assets/dungeons/models/block/pumpkin_pastures/" + args.id + ".json", "w")
    textureaffix = 'pumpkin_pastures/'
if args.area == 'cc':
    model = open("assets/dungeons/models/block/cacti_canyon/" + args.id + ".json", "w")
    textureaffix = 'cacti_canyon/
if args.area == 'ss':
    model = open("assets/dungeons/models/block/soggy_swamp/" + args.id + ".json", "w")
    textureaffix = 'soggy_swamp/'

datablock = {}
dataitem = {}
datastate = {}

#block data
datablock['parent'] = "minecraft:block/cube_all"
datablock['textures'] = {
    "all": "dungeons:block/" + textureaffix + args.id
}
# item data
dataitem['parent'] = "dungeons:block/" + textureaffix + args.id
# state data
datastate['variants'] = {
    "": {"model": "dungeons:block/" + textureaffix + args.id}
}

json.dump(datablock, model)
json.dump(dataitem, item)
json.dump(datastate, state)
