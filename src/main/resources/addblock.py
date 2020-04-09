import sys
import json

print(sys.argv[0])
print(sys.argv[1])


model = open("assets/dungeons/models/block/" + sys.argv[1] + ".json", "w")
item = open("assets/dungeons/models/item/" + sys.argv[1] + ".json", "w")
state = open("assets/dungeons/blockstates/" + sys.argv[1] + ".json", "w")

# block model data
datadef = {}
datadef['parent'] = "minecraft:block/cube_all"
datadef['textures'] = {
    "all": "dungeons:block/" + sys.argv[1]
}

# item data
dataitem = {}
dataitem['parent'] = "dungeons:block/" + sys.argv[1]

# state data
datastate = {}
datastate['variants'] = {
    "": {"model": "dungeons:block/" + sys.argv[1]}
}

json.dump(datadef, model)
json.dump(dataitem, item)
json.dump(datastate, state)
