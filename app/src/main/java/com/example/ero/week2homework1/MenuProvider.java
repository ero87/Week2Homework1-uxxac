package com.example.ero.week2homework1;

import android.content.Context;

import java.util.ArrayList;

public class MenuProvider {

    public static ArrayList<Menyu> getMenyuArrayList(Context context) {

        ArrayList<Menyu> menyuslist = new ArrayList<>();

        Menyu menyu = new Menyu();
        menyu.setText(context.getString(R.string.menuTxt));
        menyu.setTitle(context.getString(R.string.menuTitle));
        menyu.setKaloria(context.getString(R.string.menuKaloria));
        menyu.setImageUrl(context.getString(R.string.menuImageUrl));
        menyu.setMenyuUrl(context.getString(R.string.menuInfoUrl));

        Menyu menyu1 = new Menyu();
        menyu1.setText(context.getString(R.string.menu1Text));
        menyu1.setTitle(context.getString(R.string.menu1Title));
        menyu1.setKaloria(context.getString(R.string.menu1Kaloria));
        menyu1.setImageUrl(context.getString(R.string.menu1ImageUrl));
        menyu1.setMenyuUrl(context.getString(R.string.menu1InfoUrl));

        Menyu menyu2 = new Menyu();
        menyu2.setText(context.getString(R.string.menu2Text));
        menyu2.setTitle(context.getString(R.string.menu2Title));
        menyu2.setKaloria(context.getString(R.string.menu2Kaloria));
        menyu2.setImageUrl(context.getString(R.string.menu2ImageUrl));
        menyu2.setMenyuUrl(context.getString(R.string.menu2InfoUrl));

        Menyu menyu3 = new Menyu();
        menyu3.setText(context.getString(R.string.menu3Text));
        menyu3.setTitle(context.getString(R.string.menu3Title));
        menyu3.setKaloria(context.getString(R.string.menu3Kaloria));
        menyu3.setImageUrl(context.getString(R.string.menu3ImageUrl));
        menyu3.setMenyuUrl(context.getString(R.string.menu3InfoUrl));

        Menyu menyu4 = new Menyu();
        menyu4.setText(context.getString(R.string.menu4Text));
        menyu4.setTitle(context.getString(R.string.menu4Title));
        menyu4.setKaloria(context.getString(R.string.menu4Kaloria));
        menyu4.setImageUrl(context.getString(R.string.menu4ImageUrl));
        menyu4.setMenyuUrl(context.getString(R.string.menu4InfoUrl));

        menyuslist.add(menyu);
        menyuslist.add(menyu1);
        menyuslist.add(menyu2);
        menyuslist.add(menyu3);
        menyuslist.add(menyu4);
        menyuslist.add(menyu);
        menyuslist.add(menyu1);
        menyuslist.add(menyu2);
        menyuslist.add(menyu3);
        menyuslist.add(menyu4);
        return menyuslist;
    }
}