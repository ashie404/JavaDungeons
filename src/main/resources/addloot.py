import argparse
import json

parser = argparse.ArgumentParser(description='Generates basic loot tables for blocks.')
parser.add_argument('name', metavar='name', help='Name of block')
args = parser.parse_args()

lootTableFile = open(f'data/dungeons/loot_tables/blocks/{args.name}.json', 'w')

lootTable = {}

lootTable['type'] = 'minecraft:block'
pools = [{}]
pools[0]['rolls'] = 1

entries = [{}]
entries[0]['type'] = 'minecraft:item'
entries[0]['name'] = f'dungeons:{args.name}'

pools[0]['entries'] = entries

conditions = [{}]
conditions[0]['condition'] = 'minecraft:survives_explosion'

pools[0]['conditions'] = conditions

lootTable['pools'] = pools

json.dump(lootTable, lootTableFile)