package net.dominosq.dqsre4.item;

import net.dominosq.dqsre4.DQsRE4Mod;
import net.dominosq.dqsre4.item.custom.HealingItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DQsRE4Mod.MODID);

    public static final DeferredItem<Item> GREEN_HERB = ITEMS.register("green_herb",
            () -> new HealingItem(new Item.Properties(),5.0F,false));

    public static final DeferredItem<Item> RED_HERB = ITEMS.register("red_herb",
            () -> new Item(new Item.Properties().stacksTo(5)));

    public static final DeferredItem<Item> YELLOW_HERB = ITEMS.register("yellow_herb",
            () -> new Item(new Item.Properties().stacksTo(5)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
