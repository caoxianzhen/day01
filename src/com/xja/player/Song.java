package com.xja.player;

import java.util.Objects;

public class Song {

   private String id;

    private String name;

    private String player;
    public Song() {
    }

    public Song(String id, String name, String player) {
        this.id = id;
        this.name = name;
        this.player = player;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o.getClass() == Song.class) {
            Song song = (Song) o;
            return (song.getId().equals(id) && song.getName().equals(name) && song.player.equals(player));

        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPlayer());
    }

    @Override
    public String toString() {
        return "歌曲信息:id为" + id + "歌曲的名称为：" + name + "演唱者为"+ player;
    }
}

