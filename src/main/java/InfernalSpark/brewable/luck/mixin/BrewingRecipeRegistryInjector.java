package InfernalSpark.brewable.luck.mixin;

import InfernalSpark.brewable.luck.BrewableLuck;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrewingRecipeRegistry.class)
public class BrewingRecipeRegistryInjector implements BrewingRecipeRegistryAccessor{
    @Inject(at = @At("HEAD"), method = "registerDefaults")
    private static void registerDefaults(CallbackInfo info){
        BrewingRecipeRegistryAccessor.registerPotionRecipe(Potions.AWKWARD, BrewableLuck.CLOVER, BrewableLuck.LUCK);
        BrewingRecipeRegistryAccessor.registerPotionRecipe(BrewableLuck.LUCK, Items.GLOWSTONE_DUST, BrewableLuck.LONG_LUCK);
        BrewingRecipeRegistryAccessor.registerPotionRecipe(BrewableLuck.LUCK, Items.REDSTONE, BrewableLuck.STRONG_LUCK);
        BrewingRecipeRegistryAccessor.registerPotionRecipe(BrewableLuck.LUCK, Items.FERMENTED_SPIDER_EYE, BrewableLuck.UNLUCK);
        BrewingRecipeRegistryAccessor.registerPotionRecipe(BrewableLuck.UNLUCK, Items.GLOWSTONE_DUST, BrewableLuck.LONG_UNLUCK);
        BrewingRecipeRegistryAccessor.registerPotionRecipe(BrewableLuck.UNLUCK, Items.REDSTONE, BrewableLuck.STRONG_UNLUCK);
        System.out.println("Injector success");
    }
}
