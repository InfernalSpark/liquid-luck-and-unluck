package InfernalSpark.brewable.luck;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BrewableLuck implements ModInitializer {
	public static final String modid = "brewableluck";
	public static final Item CLOVER = new Item(new Item.Settings().group(ItemGroup.BREWING));

	public static final Potion LUCK = new Potion(new StatusEffectInstance(StatusEffects.LUCK, 3600, 0));
	public static final Potion LONG_LUCK = new Potion(new StatusEffectInstance(StatusEffects.LUCK, 9600));
	public static final Potion STRONG_LUCK = new Potion(new StatusEffectInstance(StatusEffects.LUCK, 3600, 1));
	public static final Potion UNLUCK = new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 3600));
	public static final Potion LONG_UNLUCK = new Potion(new StatusEffectInstance(StatusEffects.UNLUCK,9600));
	public static final Potion STRONG_UNLUCK = new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 3600, 1));



	@Override
	public void onInitialize() {
		Registry.register(Registry.POTION, new Identifier(modid, "iluck"), LUCK);
		Registry.register(Registry.ITEM, new Identifier(modid, "clover"), CLOVER);
		Registry.register(Registry.POTION, new Identifier(modid, "long_luck"), LONG_LUCK);
		Registry.register(Registry.POTION, new Identifier(modid, "strong_luck"), STRONG_LUCK);
		Registry.register(Registry.POTION, new Identifier(modid, "unluck"), UNLUCK);
		Registry.register(Registry.POTION, new Identifier(modid, "long_unluck"), LONG_UNLUCK);
		Registry.register(Registry.POTION, new Identifier(modid, "strong_unluck"), STRONG_UNLUCK);

		System.out.println("Hello Fabric world!");
	}
}
