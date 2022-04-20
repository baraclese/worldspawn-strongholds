package baraclese.worldspawn_strongholds.mixin;

import net.minecraft.structure.StrongholdStructure;
import net.minecraft.structure.StructureFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(StrongholdStructure.class)
public abstract class WorldspawnStrongholds extends StructureFeature
{
    @ModifyVariable(method = "shouldStartAt", at = @At(value = "STORE", ordinal = 0), index = 10)
    private int modifyChunkPosX(int pos)
    {
        return pos + (this.world.getLevelProperties().getSpawnX() >> 4);
    }

    @ModifyVariable(method = "shouldStartAt", at = @At(value = "STORE", ordinal = 0), index = 11)
    private int modifyChunkPosZ(int pos)
    {
        return pos + (this.world.getLevelProperties().getSpawnZ() >> 4);
    }
}
