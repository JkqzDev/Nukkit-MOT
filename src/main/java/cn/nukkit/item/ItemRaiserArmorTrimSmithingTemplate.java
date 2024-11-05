package cn.nukkit.item;

import cn.nukkit.item.trim.ItemTrimPatternType;
import cn.nukkit.network.protocol.ProtocolInfo;

/**
 * @author Glorydark
 */
public class ItemRaiserArmorTrimSmithingTemplate extends StringItemBase implements ItemTrimPattern {

    public ItemRaiserArmorTrimSmithingTemplate() {
        super(RAISER_ARMOR_TRIM_SMITHING_TEMPLATE, "Raiser Armor Trim Smithing Template");
    }

    @Override
    public ItemTrimPatternType getPattern() {
        return ItemTrimPatternType.RAISER_ARMOR_TRIM_ARMOR_TRIM;
    }

    @Override
    public boolean isSupportedOn(int protocolId) {
        return protocolId >= ProtocolInfo.v1_19_80;
    }
}
