package com.xja.player;

public class Test_Demo {
    public void testSong(){

        Song song1 = new Song("S001","两只老虎", "小太阳");
        Song song2 = new Song("S002","小燕子", "风车");
        Song song3 = new Song("S003","茉莉花", "彩虹");
//        System.out.println(song1);
//        System.out.println(song1.equals(song2));


    }

    public  void testPlayList(){
        Song song1 = new Song("S001","两只老虎", "小太阳");
        Song song2 = new Song("S002","小燕子", "风车");
        Song song3 = new Song("S003","茉莉花", "彩虹");
        PlayList pl = new PlayList("主播放列表");
        pl.addToPlayList(song1);
        pl.addToPlayList(song2);
        pl.addToPlayList(song3);
          pl.displayAllSong();
        System.out.println(pl.getMusicList()
        );

    }

    public static void main(String[] args) {
        Test_Demo td = new Test_Demo();
//        td.testSong();
        td.testPlayList();

    }
}
