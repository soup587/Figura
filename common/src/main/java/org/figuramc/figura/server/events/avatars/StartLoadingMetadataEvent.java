package org.figuramc.figura.server.events.avatars;

import org.figuramc.figura.server.avatars.FiguraServerAvatarManager;
import org.figuramc.figura.server.events.ReturnableEvent;
import org.figuramc.figura.server.utils.Hash;

import java.util.concurrent.CompletableFuture;

public class StartLoadingMetadataEvent extends ReturnableEvent<FiguraServerAvatarManager.AvatarMetadata> {
    private final Hash hash;

    public StartLoadingMetadataEvent(Hash hash) {
        this.hash = hash;
    }

    public Hash hash() {
        return hash;
    }
}