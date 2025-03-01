# Project Enzyme
Project Enzyme is a Cell Lab mod focused around expanding the game's genome editor. It seeks to aid creativity by adding features that allow for larger and more complex organisms to be created with the limitations of the genome editor.

Here is a list of the biggest features:
* 80 Cell Modes
* New genome editor parameters such as:
  * The ability to adjust the maximum size of cells
  * The ability to set a minimum amount of connections before cell split
  * The ability to set a limit on how many times a mode can split.
  * The ability to change a cell's mode after the split limit is reached
* New cell type: The osteocyte (WIP)
* Backwards compatibility with vanilla genomes for easy migration (just make sure to back them up when you install the mod)
* Working saving/loading system with modified .substrate and .genome savefiles to include modded features.
* Support for newer devices (Up to 2023)
* 'Sandbox' mode. All challenges are unlocked automatically, giving access to all of the game's features. (Mostly intended to facilitate mod development)
* More signals. Up to 16 signals for Neurocytes and other signal cells.
* New signal equation: The sine wave. With modifiable frequency and amplitude parameters.

You can download the mod from this google drive link:
https://drive.google.com/drive/folders/1F8-p4qFHIoTkJUI01W5C-G8jQ7Xe5UVb

This repository is a read-only! But you are free to clone and modify your own version, as I don't plan on making further changes or additions. This repository does not contain the necessary 3rd party tools to successfully compile, package and sign a modified APK! The 3rd party tools necessary are mentionned in the Modding Guide below, so if you wish to compile your own copy of the game, feel free to use Project Enzyme's smali patches as a starting point.

The smali code is commented and somewhat documented. I encircled all my patches with comments and tried my best to document the changes but sometimes I might have gotten lazy or forgotten to properly or accurately comment on my patches.

# Modding Guide 

A modding guide is available in here:
https://docs.google.com/document/d/1Ndu5u0FhspEaDwRcBQp4mkaq344pvL3m7Wo_G8Dg1jo/edit?usp=sharing

