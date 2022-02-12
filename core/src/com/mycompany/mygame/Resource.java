package com.mycompany.mygame;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.utils.Disposable;

public class Resource implements Disposable {

    private AssetManager manager;
    public Resource() {
    }

    @Override
    public void dispose() {
        manager.dispose();
    }
}
