package ac.sapphire.client.mixin.entity;

import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(EntityRenderer.class)
public interface IEntityRendererAccessor {
    @Invoker
    void callSetupCameraTransform(float partialTicks, int pass);
}
