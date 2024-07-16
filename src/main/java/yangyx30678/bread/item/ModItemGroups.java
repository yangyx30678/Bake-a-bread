package yangyx30678.bread.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import yangyx30678.bread.BakeABread;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BakeABread.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.BAKED_BREAD)).entries((displayContext, entries) -> {
                            entries.add(ModItems.BAKED_BREAD);
                    }).build());

    public static void registerItemGroups(){
        BakeABread.LOGGER.info("Registering Item Groups for " + BakeABread.MOD_ID);

    }
}
