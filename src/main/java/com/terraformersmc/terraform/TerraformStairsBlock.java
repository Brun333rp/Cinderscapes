package com.terraformersmc.terraform;

import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;

/**
 * A simple wrapper around the parent StairsBlock class allowing access to the constructor.
 */
public class TerraformStairsBlock extends StairsBlock {
    public TerraformStairsBlock(Block base, Settings settings) {
        super(base.getDefaultState(), settings);
    }
}
