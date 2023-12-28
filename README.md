# Introduction

This server-only mod adds the stats `blocks_placed` and `blocks_broken` to the game, counting the number of blocks a player has placed/broken respectively.

# Example Usage

To display the number of blocks placed in sidebar, we first add a scoreboard objective:
```
/scoreboard objectives add blocks_placed minecraft.custom:minecraft.blocks_placed "Blocks Placed"
```

Then display the scoreboard on the sidebar:
```
/scoreboard objectives setdisplay sidebar blocks_placed
```

Similarly for blocks broken:
```
/scoreboard objectives add blocks_broken minecraft.custom:minecraft.blocks_broken "Blocks Broken"
/scoreboard objectives setdisplay sidebar blocks_broken
```