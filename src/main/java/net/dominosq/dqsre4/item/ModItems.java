package net.dominosq.dqsre4.item;

import net.dominosq.dqsre4.DQsRE4Mod;
import net.dominosq.dqsre4.item.custom.HealingItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DQsRE4Mod.MODID);

    public static final DeferredItem<Item> GREEN_HERB = ITEMS.registerItem("green_herb",
            properties -> new HealingItem(properties.stacksTo(3),5.0F,false));

    public static final DeferredItem<Item> RED_HERB = ITEMS.registerSimpleItem("red_herb");

    public static final DeferredItem<Item> YELLOW_HERB = ITEMS.registerSimpleItem("yellow_herb");


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
