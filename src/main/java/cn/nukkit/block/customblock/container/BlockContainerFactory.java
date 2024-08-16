package cn.nukkit.block.customblock.container;

import cn.nukkit.block.properties.BlockProperties;

public interface BlockContainerFactory {

    BlockContainer create(int meta);

    static BlockContainer createSimple(String blockName, int blockId) {
        return new CustomBlock(blockName, blockId);
    }

    static BlockContainer createMeta(String blockName, int blockId, int meta, BlockProperties properties) {
        return new CustomBlockMeta(blockName, blockId, properties, meta);
    }
}
