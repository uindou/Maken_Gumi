package kagaya_riku.kagaya;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class Kagaya {
    public static final String MOD_ID = "kagaya";

    public Kagaya() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Items.register(modEventBus);
    }

    public static class Items {
        private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
        public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("DefaultItemName", () -> new Item(new Item.Properties()
                .tab(CreativeModeTab.TAB_MATERIALS)));

        public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
    }
}
