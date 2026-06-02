v1.0.1:
### Changes
- Changed carpet detection to use `instanceof`, improving compatibility with all carpets and carpet-like blocks from other mods that use `CarpetBlock` type.
- Simplified datapack customization by merging cozy spot definitions into a single `cozy_spots.json` tag file.
- Blocks added to `cozy_spots.json` are now automatically recognized by both cat sitting and sleeping behaviors.