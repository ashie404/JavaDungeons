import argparse
import json

parser = argparse.ArgumentParser(description='Generates basic item models for weapons.')
parser.add_argument('name', metavar='name', help='Name of item')
args = parser.parse_args()

item = {}

itemPath = open("assets/dungeons/models/item/" + args.name + ".json", "w")

#item data
item['parent'] = "minecraft:item/handheld"
item['textures'] = {
    "layer0": "dungeons:item/" + args.name
}

json.dump(item, itemPath)