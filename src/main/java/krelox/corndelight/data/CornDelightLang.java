package krelox.corndelight.data;

import krelox.corndelight.block.CornDelightBlocks;
import krelox.corndelight.item.CornDelightItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import org.apache.commons.lang3.text.WordUtils;

public class CornDelightLang extends FabricLanguageProvider {
    public CornDelightLang(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(CornDelightBlocks.CORN_CROP, "Corn");
        translationBuilder.add("itemgroup.corn_delight", "Corn Delight");
        CornDelightItems.items.forEach(item -> translationBuilder.add(item, formatName(item.toString())));
    }

    @SuppressWarnings("deprecation")
    public String formatName(String name) {
        String s = name.replace('_', ' ');
        return WordUtils.capitalize(s.trim());
    }
}
