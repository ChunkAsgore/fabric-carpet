package carpet.fakes;

import net.minecraft.util.math.ChunkPos;

public interface ThreadedAnvilChunkStorageInterface
{
    void regenerateChunkRegion(ChunkPos from, ChunkPos to);
}
