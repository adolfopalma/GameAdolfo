package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
