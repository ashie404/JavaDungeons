import argparse
import json

# Internal functions for generating various JSON resource files

def blockstate_stairs(model_id):
    data = {}
    data['variants'] = {
        "facing=east,half=bottom,shape=straight":  { "model":    model_id },
        "facing=west,half=bottom,shape=straight":  { "model":    model_id, "y": 180, "uvlock": True },
        "facing=south,half=bottom,shape=straight": { "model":    model_id, "y": 90, "uvlock": True },
        "facing=north,half=bottom,shape=straight": { "model":    model_id, "y": 270, "uvlock": True },
        "facing=east,half=bottom,shape=outer_right":  { "model": model_id + "_outer" },
        "facing=west,half=bottom,shape=outer_right":  { "model": model_id + "_outer", "y": 180, "uvlock": True },
        "facing=south,half=bottom,shape=outer_right": { "model": model_id + "_outer", "y": 90, "uvlock": True },
        "facing=north,half=bottom,shape=outer_right": { "model": model_id + "_outer", "y": 270, "uvlock": True },
        "facing=east,half=bottom,shape=outer_left":  { "model":  model_id + "_outer", "y": 270, "uvlock": True },
        "facing=west,half=bottom,shape=outer_left":  { "model":  model_id + "_outer", "y": 90, "uvlock": True },
        "facing=south,half=bottom,shape=outer_left": { "model":  model_id + "_outer" },
        "facing=north,half=bottom,shape=outer_left": { "model":  model_id + "_outer", "y": 180, "uvlock": True },
        "facing=east,half=bottom,shape=inner_right":  { "model": model_id + "_inner" },
        "facing=west,half=bottom,shape=inner_right":  { "model": model_id + "_inner", "y": 180, "uvlock": True },
        "facing=south,half=bottom,shape=inner_right": { "model": model_id + "_inner", "y": 90, "uvlock": True },
        "facing=north,half=bottom,shape=inner_right": { "model": model_id + "_inner", "y": 270, "uvlock": True },
        "facing=east,half=bottom,shape=inner_left":  { "model":  model_id + "_inner", "y": 270, "uvlock": True },
        "facing=west,half=bottom,shape=inner_left":  { "model":  model_id + "_inner", "y": 90, "uvlock": True },
        "facing=south,half=bottom,shape=inner_left": { "model":  model_id + "_inner" },
        "facing=north,half=bottom,shape=inner_left": { "model":  model_id + "_inner", "y": 180, "uvlock": True },
        "facing=east,half=top,shape=straight":  { "model":       model_id, "x": 180, "uvlock": True },
        "facing=west,half=top,shape=straight":  { "model":       model_id, "x": 180, "y": 180, "uvlock": True },
        "facing=south,half=top,shape=straight": { "model":       model_id, "x": 180, "y": 90, "uvlock": True },
        "facing=north,half=top,shape=straight": { "model":       model_id, "x": 180, "y": 270, "uvlock": True },
        "facing=east,half=top,shape=outer_right":  { "model":    model_id + "_outer", "x": 180, "y": 90, "uvlock": True },
        "facing=west,half=top,shape=outer_right":  { "model":    model_id + "_outer", "x": 180, "y": 270, "uvlock": True },
        "facing=south,half=top,shape=outer_right": { "model":    model_id + "_outer", "x": 180, "y": 180, "uvlock": True },
        "facing=north,half=top,shape=outer_right": { "model":    model_id + "_outer", "x": 180, "uvlock": True },
        "facing=east,half=top,shape=outer_left":  { "model":     model_id + "_outer", "x": 180, "uvlock": True },
        "facing=west,half=top,shape=outer_left":  { "model":     model_id + "_outer", "x": 180, "y": 180, "uvlock": True },
        "facing=south,half=top,shape=outer_left": { "model":     model_id + "_outer", "x": 180, "y": 90, "uvlock": True },
        "facing=north,half=top,shape=outer_left": { "model":     model_id + "_outer", "x": 180, "y": 270, "uvlock": True },
        "facing=east,half=top,shape=inner_right":  { "model":    model_id + "_inner", "x": 180, "y": 90, "uvlock": True },
        "facing=west,half=top,shape=inner_right":  { "model":    model_id + "_inner", "x": 180, "y": 270, "uvlock": True },
        "facing=south,half=top,shape=inner_right": { "model":    model_id + "_inner", "x": 180, "y": 180, "uvlock": True },
        "facing=north,half=top,shape=inner_right": { "model":    model_id + "_inner", "x": 180, "uvlock": True },
        "facing=east,half=top,shape=inner_left":  { "model":     model_id + "_inner", "x": 180, "uvlock": True },
        "facing=west,half=top,shape=inner_left":  { "model":     model_id + "_inner", "x": 180, "y": 180, "uvlock": True },
        "facing=south,half=top,shape=inner_left": { "model":     model_id + "_inner", "x": 180, "y": 90, "uvlock": True },
        "facing=north,half=top,shape=inner_left": { "model":     model_id + "_inner", "x": 180, "y": 270, "uvlock": True }
    }
    return data

def blockstate_wall(model_id):
    post = model_id + "_post"
    side = model_id + "_side"
    side_tall = model_id + "_side_tall"
    data = {"multipart": [
    {
        "apply": {"model": post},
        "when": {"up": "true"}
    },
    {
        "apply": {"model": side, "uvlock": True},
        "when": {"north": "low"}
    },
    {
        "apply": {"model": side,"uvlock": True,"y": 90},
        "when": {"east": "low"}
    },
    {
        "apply": {"model": side,"uvlock": True,"y": 180},
        "when": { "south": "low"}
    },
    {
        "apply": {"model": side,"uvlock": True,"y": 270},
        "when": { "west": "low"}
    },
    {
        "apply": {"model": side_tall,"uvlock": True},
        "when": {"north": "tall"}
    },
    {
        "apply": {"model": side_tall,"uvlock": True,"y": 90},
        "when": {"east": "tall"}
    },
    {
        "apply": {"model":side_tall,"uvlock": True,"y": 180},
        "when": {"south": "tall"}
    },
    {
        "apply": {"model": side_tall,"uvlock": True,"y": 270},
        "when": {"west": "tall"}
    }
    ]}
    return data

def blockstate_fence(model_id):
    post = model_id + "_post"
    side = model_id + "_side"
    data = {"multipart": [
    {"apply": {"model": post}},
    {
    "apply": {"model": side,"uvlock": True},
    "when": {"north": "true"}
    },
    {
    "apply": {"model": side,"uvlock": True,"y": 90},
    "when": {"east": "true"}
    },
    {
    "apply": {"model": side,"uvlock": True,"y": 180},
    "when": {"south": "true"}
    },
    {
    "apply": {"model": side,"uvlock": True,"y": 270},
    "when": {"west": "true"}
    }]}
    return data

def blockstate_slab(model_id):
    data = {}
    data['variants'] = {
        "type=bottom": { "model": model_id + "_slab" },
        "type=top": { "model":    model_id + "_slab_top" },
        "type=double": { "model": model_id }
    }
    return data

def blockstate_pillar(model_id):
    data = {}
    data['variants'] = {
        "axis=y": { "model": model_id },
        "axis=z": { "model": model_id, "x": 90 },
        "axis=x": { "model": model_id, "x": 90, "y": 90 }
    }
    return data

def blockstate_doubleplant(model_id):
    data = {}
    data['variants'] = {
        "half=lower": { "model": model_id + "_bottom" },
        "half=upper": { "model": model_id + "_top" }
    }
    return data

def blockstate_solid(model_id, random_y):
    data = {}
    if random_y == True:
        data['variants'] = {
            "": [
                {"model": model_id},
                {"model": model_id, "y": 90},
                {"model": model_id, "y": 180},
                {"model": model_id, "y": 270}
            ]
        }
    else:
        data['variants'] = {
            "": {"model": model_id}
        }

    return data

def model_solid(tex):
    data = {}
    data['parent'] = "minecraft:block/cube_all"
    data['textures'] = {
        "all": tex
    }
    return data

def model_path(side, top, bottom):
    data = {}
    data['parent'] = "minecraft:block/dirt_path"
    data['textures'] = {
        "particle": side,
        "side": side,
        "top": top,
        "bottom": bottom
    }
    return data

def model_pillar(side, top, bottom):
    data = {}
    data['parent'] = "minecraft:block/cube_bottom_top"
    data['textures'] = {
        "side": side,
        "bottom": bottom,
        "top": top
    }
    return data

def model_slab(side, top, bottom, upper):
    data = {}
    data['parent'] = "minecraft:block/slab_top" if upper == True else "minecraft:block/slab"
    data['textures'] = {
        "side": side,
        "bottom": bottom,
        "top": top
    }
    return data

def model_stairs(side, top, bottom, stairtype):
    data = {}
    match stairtype:
        case 'default':
            data['parent'] = "minecraft:block/stairs"
        case 'inner':
            data['parent'] = "minecraft:block/inner_stairs"
        case 'outer':
            data['parent'] = "minecraft:block/outer_stairs"
        case _:
            return 'Invalid stair type'
    
    data['textures'] = {
        "side": side,
        "bottom": bottom,
        "top": top
    }
    return data

def model_wall(wall, walltype):
    data = {}
    match walltype:
        case 'post':
            data['parent'] = "minecraft:block/template_wall_post"
        case 'side':
            data['parent'] = "minecraft:block/template_wall_side"
        case 'side_tall':
            data['parent'] = "minecraft:block/template_wall_side_tall"
        case 'inv':
            data['parent'] = "minecraft:block/wall_inventory"
        case _:
            return 'Invalid wall type'
    
    data['textures'] = {
        "wall": wall
    }
    return data

def model_fence(texture, fencetype):
    data = {}
    match fencetype:
        case 'post':
            data['parent'] = "minecraft:block/fence_post"
        case 'side':
            data['parent'] = "minecraft:block/fence_side"
        case 'inv':
            data['parent'] = "minecraft:block/fence_inventory"
        case _:
            return 'Invalid fence type'
        
    data['textures'] = {
        "texture": texture
    }
    return data

def model_cross(tex):
    data = {}
    data['parent'] = 'minecraft:block/cross'
    data['textures'] = {
        "cross": tex
    }
    return data

def item_model(model_id):
    data = {}
    data['parent'] = model_id
    return data

def item_model_2d(texture_id):
    data = {}
    data['parent'] = "minecraft:item/generated"
    data['textures'] = {
        "layer0": texture_id
    }
    return data

# constants
block_pre = "dungeons:block/"
item_pre = "dungeons:item/"

parser = argparse.ArgumentParser(description="Basic asset management script for JSON model/blockstate files.")
parser.add_argument('action', metavar="action", help="Action to perform\n * str - Creates resource files for stairs.\n * slb - Creates resource files for slabs.\n * cube - Creates resource files for generic full cubes.\n * plr - Creates resource files for pillar blocks.\n * plx - Creates resource files for pillar blocks (solid blockstate).\n * x - Creates resource files for cross blocks.\n * xx - Creates resource files for double plant cross blocks.\n * w - Creates resource files for wall blocks\n * f - creates resource files for fence blocks\n * bss - Creates resource files for base, slab, stair blocks.\n * ib - Creates item model based on block model.\n * ig - Creates item model based on item texture.\n * s - Creates generic blockstate file.\n * w - Creates resource files for walls\n * f - Creates resource files for fences")
parser.add_argument('-r', '--rotate', action='store_true', help='Whether to have random Y rotation in the blockstate or not. Only applies for solid blocks.')
parser.add_argument('area', metavar='zone', help='Zone of model\n * none: No zone/generic block\n * cw: Creeper Woods\n * dt: Desert Temple\n * pm: Pumpkin Pastures\n * cc: Cacti Canyon\n ss: Soggy Swamp\n rm: Redstone Mines\n ff: Fiery Forge\n dj: Dingy Jungle\n cr: Coral Rise')
parser.add_argument('-i', '--id', metavar='id', help='ID of block, without area affix.', required=True)
parser.add_argument('-s', '--sidetex',  metavar='sidetex', help='Side texture id, or texture of all sides if generic cube.', required=False )
parser.add_argument('-t', '--toptex', metavar='toptex', help='Top texture id. Not applicable if generic cube.', required=False)
parser.add_argument('-b', '--bottomtex', metavar='bottomtex', help='Bottom texture id. Not applicable if generic cube.', required=False)
parser.add_argument('-m', '--mirror', action='store_true', help='Mirrors ID input to texture inputs. Useful when ID/textures have a shared name.', required=False)
parser.add_argument('-a', '--absolute', action='store_true', help="Takes absolute texture and ID paths instead of using inbuilt constants to add that info.", required=False)
args = parser.parse_args()

# Begin asset generation routine

# Get zone strings
zone = ""
zone_short = ""
match args.area:
    case 'cw':
        zone = "creeper_woods/"
        zone_short = "cw_"
    case 'dt':
        zone = "desert_temple/"
        zone_short = "dt_"
    case 'pm':
        zone = "pumpkin_pastures/"
        zone_short = "pm_"
    case 'cc':
        zone = "cacti_canyon/"
        zone_short = "cc_"
    case 'ss':
        zone = "soggy_swamp/"
        zone_short = "ss_"
    case 'rm':
        zone = "redstone_mines/"
        zone_short = "rm_"
    case 'ff':
        zone = "fiery_forge/"
        zone_short = "ff_"
    case 'dj':
        zone = "dingy_jungle/"
        zone_short = "dj_"
    case 'cr':
        zone = "coral_rise/"
        zone_short = "cr_"

# Get texture locations
        
sidetex = ""
toptex = ""
bottomtex = ""
id_zone = block_pre + zone + args.id
# If side texture is not specified and mirror is not enabled, do not calculate any texture strings (likely id-only action)
if not args.sidetex is None and not args.mirror:
    sidetex = block_pre + zone + args.sidetex

    if not args.toptex is None:
        toptex = block_pre + zone + args.toptex
    else:
        toptex = block_pre + zone + args.sidetex

    if not args.bottomtex is None:
        bottomtex = block_pre + zone + args.bottomtex
    elif not args.toptex is None:
        bottomtex = block_pre + zone + args.toptex
    else:
        bottomtex = block_pre + zone + args.sidetex
    
    if args.absolute:
        sidetex = args.sidetex
        if not args.toptex is None:
            toptex = args.toptex
        else:
            toptex = args.sidetex
    
        if not args.bottomtex is None:
            bottomtex = args.bottomtex
        elif not args.toptex is None:
            bottomtex = args.toptex
        else:
            bottomtex = args.sidetex

if args.mirror and not args.absolute:
    # If mirror mode enabled, mirror ID string to all textures
    sidetex = id_zone
    toptex = id_zone
    bottomtex = id_zone
elif args.mirror and args.absolute:
    sidetex = args.id
    toptex = args.id
    bottomtex = args.id
    

# Generate JSON and write based on corresponding action
match args.action:
    case 'cube':
        # Generic cube
        block = model_solid(sidetex)
        item = item_model(id_zone)
        state = blockstate_solid(id_zone, args.rotate)
        # open files
        blockf = open("assets/dungeons/models/block/{}{}.json".format(zone, args.id), "w")
        itemf = open("assets/dungeons/models/item/{}{}.json".format(zone_short, args.id), "w")
        statef = open("assets/dungeons/blockstates/{}{}.json".format(zone_short, args.id), "w")
        # write json
        json.dump(block, blockf)
        json.dump(item, itemf)
        json.dump(state, statef) 

    case 'path':
        # Path
        block = model_path(sidetex, toptex, bottomtex)
        item = item_model(id_zone)
        state = blockstate_solid(id_zone, args.rotate)
        # open files
        blockf = open("assets/dungeons/models/block/{}{}.json".format(zone, args.id), "w")
        itemf = open("assets/dungeons/models/item/{}{}.json".format(zone_short, args.id), "w")
        statef = open("assets/dungeons/blockstates/{}{}.json".format(zone_short, args.id), "w")
        # write json
        json.dump(block, blockf)
        json.dump(item, itemf)
        json.dump(state, statef) 

    case 'plr':
        # Pillar (with pillar blockstate)
        block = model_pillar(sidetex, toptex, bottomtex)
        item = item_model(id_zone)
        state = blockstate_pillar(id_zone)
        # open files
        blockf = open("assets/dungeons/models/block/{}{}.json".format(zone, args.id), "w")
        itemf = open("assets/dungeons/models/item/{}{}.json".format(zone_short, args.id), "w")
        statef = open("assets/dungeons/blockstates/{}{}.json".format(zone_short, args.id), "w")
        # write json
        json.dump(block, blockf)
        json.dump(item, itemf)
        json.dump(state, statef) 
    
    case 'plx':
        # Pillar (with solid blockstate)
        block = model_pillar(sidetex, toptex, bottomtex)
        item = item_model(id_zone)
        state = blockstate_solid(id_zone, False)
        # open files
        blockf = open("assets/dungeons/models/block/{}{}.json".format(zone, args.id), "w")
        itemf = open("assets/dungeons/models/item/{}{}.json".format(zone_short, args.id), "w")
        statef = open("assets/dungeons/blockstates/{}{}.json".format(zone_short, args.id), "w")
        # write json
        json.dump(block, blockf)
        json.dump(item, itemf)
        json.dump(state, statef) 

    case 'str':
        # Stairs

        # generate json
        block = model_stairs(sidetex, toptex, bottomtex, "default")
        block1 = model_stairs(sidetex, toptex, bottomtex, "inner")
        block2 = model_stairs(sidetex, toptex, bottomtex, "outer")
        item = item_model(id_zone)
        state = blockstate_stairs(id_zone)

        # open files
        blockf = open("assets/dungeons/models/block/{}{}.json".format(zone, args.id), "w")
        block1f = open("assets/dungeons/models/block/{}{}_inner.json".format(zone, args.id), "w")
        block2f = open("assets/dungeons/models/block/{}{}_outer.json".format(zone, args.id), "w")
        itemf = open("assets/dungeons/models/item/{}{}.json".format(zone_short, args.id), "w")
        statef = open("assets/dungeons/blockstates/{}{}.json".format(zone_short, args.id), "w")

        # write json
        json.dump(block, blockf)
        json.dump(block1, block1f)
        json.dump(block2, block2f)
        json.dump(item, itemf)
        json.dump(state, statef) 

    case 'slb':
        # Slab

        # generate json
        block = model_slab(sidetex, toptex, bottomtex, False)
        block1 = model_slab(sidetex, toptex, bottomtex, True)
        item = item_model(id_zone)
        state = blockstate_slab(id_zone)

        # open files
        blockf = open("assets/dungeons/models/block/{}{}.json".format(zone, args.id), "w")
        block1f = open("assets/dungeons/models/block/{}{}_top.json".format(zone, args.id), "w")
        itemf = open("assets/dungeons/models/item/{}{}.json".format(zone_short, args.id), "w")
        statef = open("assets/dungeons/blockstates/{}{}.json".format(zone_short, args.id), "w")

        # write json 
        json.dump(block, blockf)
        json.dump(block1, block1f)
        json.dump(item, itemf)
        json.dump(state, statef)  

    case 'x':
        # Cross model

        # generate json
        block = model_cross(sidetex)
        item = item_model_2d(sidetex)
        state = blockstate_solid(id_zone, False)

        # open files
        blockf = open("assets/dungeons/models/block/{}{}.json".format(zone, args.id), "w")
        itemf = open("assets/dungeons/models/item/{}{}.json".format(zone_short, args.id), "w")
        statef = open("assets/dungeons/blockstates/{}{}.json".format(zone_short, args.id), "w")

        # write json
        json.dump(block, blockf)
        json.dump(item, itemf)
        json.dump(state, statef) 

    case 'xx':
        # Double plant

        # generate json
        block = model_cross(sidetex + "_bottom")
        block1 = model_cross(sidetex + "_top")
        item = item_model_2d(sidetex + "_bottom")
        state = blockstate_doubleplant(id_zone)

        # open files
        blockf = open("assets/dungeons/models/block/{}{}_bottom.json".format(zone, args.id), "w")
        block1f = open("assets/dungeons/models/block/{}{}_top.json".format(zone, args.id), "w")
        itemf = open("assets/dungeons/models/item/{}{}.json".format(zone_short, args.id), "w")
        statef = open("assets/dungeons/blockstates/{}{}.json".format(zone_short, args.id), "w")

        # write json
        json.dump(block, blockf)
        json.dump(block1, block1f)
        json.dump(item, itemf)
        json.dump(state, statef) 

    case 'w':
        # Wall

        # generate json
        post = model_wall(sidetex, 'post')
        side = model_wall(sidetex, 'side')
        side_tall = model_wall(sidetex, 'side_tall')
        inv = model_wall(sidetex, 'inv')

        item = item_model(id_zone + "_inventory")
        state = blockstate_wall(id_zone)

        # open all files
        blockf = open("assets/dungeons/models/block/{}{}_post.json".format(zone, args.id), "w")
        block1f = open("assets/dungeons/models/block/{}{}_side.json".format(zone, args.id), "w")
        block2f = open("assets/dungeons/models/block/{}{}_side_tall.json".format(zone, args.id), "w")
        block3f = open("assets/dungeons/models/block/{}{}_inventory.json".format(zone, args.id), "w")
        itemf = open("assets/dungeons/models/item/{}{}.json".format(zone_short, args.id), "w")
        statef = open("assets/dungeons/blockstates/{}{}.json".format(zone_short, args.id), "w")

        # write json
        json.dump(post, blockf)
        json.dump(side, block1f)
        json.dump(side_tall, block2f)
        json.dump(inv, block3f)
        json.dump(item, itemf)
        json.dump(state, statef)

    case 'f':
        # Fence

        # generate json
        post = model_fence(sidetex, 'post')
        side = model_fence(sidetex, 'side')
        inv = model_fence(sidetex, 'inv')

        item = item_model(id_zone + "_inventory")
        state = blockstate_fence(id_zone)

        # open all files
        blockf = open("assets/dungeons/models/block/{}{}_post.json".format(zone, args.id), "w")
        block1f = open("assets/dungeons/models/block/{}{}_side.json".format(zone, args.id), "w")
        block2f = open("assets/dungeons/models/block/{}{}_inventory.json".format(zone, args.id), "w")
        itemf = open("assets/dungeons/models/item/{}{}.json".format(zone_short, args.id), "w")
        statef = open("assets/dungeons/blockstates/{}{}.json".format(zone_short, args.id), "w")

        # write json
        json.dump(post, blockf)
        json.dump(side, block1f)
        json.dump(inv, block2f)
        json.dump(item, itemf)
        json.dump(state, statef)

    case 'bss':
        # Base Slab Stair

        # generate json data
        base_block = model_solid(sidetex)
        base_item = item_model(id_zone)
        base_state = blockstate_solid(id_zone, args.rotate)
        slab_block = model_slab(sidetex, toptex, bottomtex, False)
        slab_block1 = model_slab(sidetex, toptex, bottomtex, True)
        slab_item = item_model(id_zone + "_slab")
        slab_state = blockstate_slab(id_zone)
        stairs_block = model_stairs(sidetex, toptex, bottomtex, "default")
        stairs_block1 = model_stairs(sidetex, toptex, bottomtex, "inner")
        stairs_block2 = model_stairs(sidetex, toptex, bottomtex, "outer")
        stairs_item = item_model(id_zone + "_stairs")
        stairs_state = blockstate_stairs(id_zone + "_stairs")
        
        # open all files
        b_blockf = open("assets/dungeons/models/block/{}{}.json".format(zone, args.id), "w")
        b_itemf = open("assets/dungeons/models/item/{}{}.json".format(zone_short, args.id), "w")
        b_statef = open("assets/dungeons/blockstates/{}{}.json".format(zone_short, args.id), "w")
        sl_blockf = open("assets/dungeons/models/block/{}{}_slab.json".format(zone, args.id), "w")
        sl_block1f = open("assets/dungeons/models/block/{}{}_slab_top.json".format(zone, args.id), "w")
        sl_itemf = open("assets/dungeons/models/item/{}{}_slab.json".format(zone_short, args.id), "w")
        sl_statef = open("assets/dungeons/blockstates/{}{}_slab.json".format(zone_short, args.id), "w")
        st_blockf = open("assets/dungeons/models/block/{}{}_stairs.json".format(zone, args.id), "w")
        st_block1f = open("assets/dungeons/models/block/{}{}_stairs_inner.json".format(zone, args.id), "w")
        st_block2f = open("assets/dungeons/models/block/{}{}_stairs_outer.json".format(zone, args.id), "w")
        st_itemf = open("assets/dungeons/models/item/{}{}_stairs.json".format(zone_short, args.id), "w")
        st_statef = open("assets/dungeons/blockstates/{}{}_stairs.json".format(zone_short, args.id), "w")
        
        # write json
        json.dump(base_block, b_blockf)
        json.dump(base_item, b_itemf)
        json.dump(base_state, b_statef) 
        json.dump(slab_block,sl_blockf)
        json.dump(slab_block1, sl_block1f)
        json.dump(slab_item, sl_itemf)
        json.dump(slab_state,sl_statef)  
        json.dump(stairs_block, st_blockf)
        json.dump(stairs_block1, st_block1f)
        json.dump(stairs_block2, st_block2f)
        json.dump(stairs_item, st_itemf)
        json.dump(stairs_state, st_statef) 
    
    case 'ib':
        # Item model based on block model
        item = item_model(id_zone)

        itemf = open("assets/dungeons/models/item/{}{}.json".format(zone_short, args.id), "w")
        json.dump(item, itemf)

    case 'ig':
        # Item model based on item texture
        item = item_model_2d(item_pre + zone + args.id)

        itemf = open("assets/dungeons/models/item/{}{}.json".format(zone_short, args.id), "w")
        json.dump(item, itemf)

    case 's':
        # Generic blockstate
        state = blockstate_solid(id_zone, args.rotate)

        statef = open("assets/dungeons/blockstates/{}{}.json".format(zone_short, args.id), "w")
        json.dump(state, statef)

    case 'lb':
        # Langfile block updating shortcut
        langf = open("assets/dungeons/lang/en_us.json", "r")
        lang_raw = json.load(langf)
        langf.close()
        langf = open("assets/dungeons/lang/en_us.json", "w")

        lang_raw["block.dungeons." + zone_short + args.id] = args.sidetex

        json.dump(lang_raw, langf, indent=4)

    case _:
        print("Invalid action input.")